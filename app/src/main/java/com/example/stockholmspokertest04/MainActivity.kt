package com.example.stockholmspokertest04

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    val cardDeck = CardDeck()
    var listOfCardsRemainingInGame = cardDeck.listOfCardsRandom.toMutableList()
    val cardSlotGallery = CardSlotGallery()
    lateinit var layout: RelativeLayout

    var buttonIsAlreadyPressed: Boolean = false
    var playingCardFaceUp : Boolean = true
    var numberOfFilledSlotts = 0
    var listOfPCardsRemaininginGame = cardDeck.listOfCardsRemainingOnCourt.toMutableList()
    var cardSlotIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val galleryCardSlot = ImageView(this)
        galleryCardSlot.layoutParams = LinearLayout.LayoutParams(300, 300)
        galleryCardSlot.setImageResource(R.drawable.playing_card_gallery_slot_empty)

        layout = findViewById<RelativeLayout>(R.id.layout)
        cardDeck.shuffle()
        populateCourtWithPlayingCards()
        populateGalleryWithPlayingCardSlots()

        layout.setOnClickListener(){
            if(cardDeck.listOfCardsRemainingOnCourt.size == 0){
                nextRound()
            }
        }
    }

    fun nextRound () {
        populateCourtWithPlayingCards()
        populateGalleryWithPlayingCardSlots()
        cardDeck.listOfCardsRandom.shuffle()
        //if (playingCardDeck.listOfPlayingCardsRemainingInGame.size == 0){}


    }

    fun flipCardSide() {
        var choice = (0..1).random()
        playingCardFaceUp = choice == 0
    }

    fun populateGalleryWithPlayingCardSlots(){
        var positionX = -11
        val positionY = 50

        for (playingCardSlot in cardSlotGallery.listOfPlayingCardSlotsInGallery) {
            val imageView = ImageView(this)
            imageView.layoutParams = LinearLayout.LayoutParams(250, 250)
            imageView.setImageResource(playingCardSlot.cardFaceImage)
            imageView.x = positionX.toFloat()
            imageView.y = positionY.toFloat()
            layout?.addView(imageView)
            imageView.tag = playingCardSlot
            positionX += 213
            }
    }

    fun populateGallerySlotsWithPlayingCards(){
        /*
        val imageViewInSlot = ImageView(this)
        imageViewInSlot.layoutParams = LinearLayout.LayoutParams(250, 250)
        imageViewInSlot. = playingCardSlotGallery.listOfPlayingCardSlotsInGallery[imageSlotIndex]
        imageViewInSlot.playingCardSlotFull = true
        imageViewInSlot.setImageResource(playingCard.imageFace)
       imageViewInSlot.tag = playingCardInSlot
         */
    //playingCardSlotGallery.playingCardSlotA.

    }

    fun populateCourtWithPlayingCards() {
        newGameDecision()
        cardDeck.listOfCardsRemainingOnCourt = cardDeck.listOfCardsRandom.toMutableList()
        cardDeck.listOfCardsRandom.clear()
           if (buttonIsAlreadyPressed == true) {
            layout?.removeAllViewsInLayout()
        }
        for (playingCard in cardDeck.listOfCardsRemainingOnCourt) {
            val imageView = ImageView(this)

            imageView.layoutParams = LinearLayout.LayoutParams(350, 350)
            imageView.setOnClickListener{
                val card = imageView.tag as? Card
                Log.d("!!!!!!!!!!!!!!!!","Card clicked! ${card?.suit}, ${card?.rank} ")
                //playingCardSlotGallery.listOfPlayingCardsInGallery
                setNumberOfFilledSlots()
                Log.d("! ! ! ! ! ! ! ! ! ! ! !","numberOfFilledSlotts: ${numberOfFilledSlotts}")
                populateGallerySlotsWithPlayingCards()
                cardSlotGallery.listOfPlayingCardSlotsInGallery[cardSlotIndex].cardFaceImage = (playingCard.imageFace)
                listOfCardsRemainingInGame.remove(playingCard)
                if (cardSlotIndex < 4){
                    cardSlotIndex ++
                }

            }
            flipCardSide()
            if (playingCardFaceUp == true) {
                imageView.setImageResource(playingCard.imageFace)
                cardDeck.listOfCardsRandom.add(playingCard)
            } else {
                imageView.setImageResource(playingCard.cardSideBack)
            }
            placeViewRandomly(imageView)
            rotateViewRandomly(imageView)
            layout?.addView(imageView)
            imageView.tag = playingCard
        }
        buttonIsAlreadyPressed = true
    }

    fun setNumberOfFilledSlots(){

        if (numberOfFilledSlotts >= cardSlotGallery.listOfPlayingCardSlotsInGallery.size){
            numberOfFilledSlotts = 5
            nextRound()
        } else {
            numberOfFilledSlotts += 1
        }

    }

    fun newGameDecision(){
        if (cardDeck.listOfCardsRemainingOnCourt.size == 0){
            cardDeck.listOfCardsRandom = cardDeck.listOfCards.toMutableList()
        }
    }


    fun placeViewRandomly(imageView: ImageView) {
        var randomIntX = (-50..800).random()
        imageView.x = randomIntX.toFloat()
        var randomIntY = (400..1600).random()
        imageView.y = randomIntY.toFloat()
    }

    fun rotateViewRandomly(imageView: ImageView) {
        var randomInt = (0..360).random()
        imageView.rotation = randomInt.toFloat()
    }
}