package com.example.stockholmspokertest04

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    val cardDeck = CardDeck()
    val cardSlotGallery = CardSlotGallery()
    lateinit var layout: RelativeLayout

    var buttonIsAlreadyPressed: Boolean = false
    var cardFaceUp : Boolean = true
    var numberOfFilledSlotts = 0
    var listOfCardsRemainingInGame = cardDeck.listOfCardsRemainingOnCourt.toMutableList()
    var cardSlotIndex = 0
    var isNewGame : Boolean = false
    var layoutBackgroundNumber = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val galleryCardSlot = ImageView(this)
        galleryCardSlot.layoutParams = LinearLayout.LayoutParams(300, 300)
        galleryCardSlot.setImageResource(R.drawable.playing_card_gallery_slot_empty)

        layout = findViewById<RelativeLayout>(R.id.layout)
        changeBackGroundImage()

        cardDeck.shuffle()
        populateCourtWithPlayingCards()
        populateGalleryWithCardSlots()

        layout.setOnClickListener(){
            if(cardDeck.listOfCardsRemainingOnCourt.size == 0){
                nextRound()
            }else{
                populateCourtWithPlayingCards()
                populateGalleryWithCardSlots()
            }
        }
    }

    fun nextRound () {
        populateCourtWithPlayingCards()
        populateGalleryWithCardSlots()
        cardDeck.listOfCardsRandom.shuffle()
        if (listOfCardsRemainingInGame.size == 0){}

    }

    fun flipCardSide() {
        var choice = (0..1).random()
        cardFaceUp = choice == 0
    }

    fun populateGalleryWithCardSlots(){
        var positionX = -11
        val positionY = 50

        for (cardSlot in cardSlotGallery.listOfCardSlotsInGallery) {
            val imageView = ImageView(this)
            imageView.layoutParams = LinearLayout.LayoutParams(250, 250)

            imageView.setOnClickListener(){
                Log.d("! ! ! ! ! ! ! ! ! ! ! !","numberOfFilledSlotts: ${numberOfFilledSlotts}")
                layout?.removeView(imageView)
               // layout?.addView(cardSlot.cardSlotImageEmpty)
                cardSlot.isCardSlotEmpty = true
                numberOfFilledSlotts -= 1
            }
            if (cardSlot.isCardSlotEmpty == true){
                imageView.setImageResource(cardSlot.cardFaceImage)
            } else {
                imageView.setImageResource(cardSlot.cardSlotImageEmpty)
            }
            imageView.x = positionX.toFloat()
            imageView.y = positionY.toFloat()
            layout?.addView(imageView)
            imageView.tag = cardSlot
            positionX += 213
            }
    }

    fun populateCourtWithPlayingCards() {
        newGameDecision()
        cardDeck.listOfCardsRemainingOnCourt = cardDeck.listOfCardsRandom.toMutableList()
        cardDeck.listOfCardsRandom.clear()
           if (buttonIsAlreadyPressed == true) {
            layout?.removeAllViewsInLayout()
        }
        for (card in cardDeck.listOfCardsRemainingOnCourt) {
            val imageView = ImageView(this)
            var cardToGallerySlot : Card

            imageView.layoutParams = LinearLayout.LayoutParams(350, 350)
            imageView.setOnClickListener{
                cardToGallerySlot = (imageView.tag as? Card)!!
                Log.d("!!!!!!!!!!!!!!!!","Card clicked! ${cardToGallerySlot?.suit}, ${cardToGallerySlot?.rank} ")
                //playingCardSlotGallery.listOfPlayingCardsInGallery
                setNumberOfFilledSlots()
                Log.d("! ! ! ! ! ! ! ! ! ! ! !","numberOfFilledSlotts: ${numberOfFilledSlotts}")

                for (i in 0..cardSlotGallery.listOfCardSlotsInGallery.size -1){
                    if (cardToGallerySlot != null) {
                        if (cardSlotGallery.listOfCardSlotsInGallery[cardSlotIndex].isCardSlotEmpty == true){
                    cardSlotGallery.listOfCardSlotsInGallery[cardSlotIndex].cardFaceImage = (cardToGallerySlot.imageFace)
                        }else{
                        cardSlotIndex ++
                        cardSlotGallery.listOfCardSlotsInGallery[cardSlotIndex].cardFaceImage = (cardToGallerySlot.imageFace)
                            cardSlotGallery.listOfCardSlotsInGallery[cardSlotIndex].isCardSlotEmpty = false
                        }
                    }
                    layout?.removeView(imageView)
                }
                cardDeck.listOfCardsRandom.remove(cardToGallerySlot)
                listOfCardsRemainingInGame.remove(cardToGallerySlot)
                cardSlotIndex ++
                if (cardSlotIndex > 4){
                    cardSlotIndex = 0
                }
            }
            flipCardSide()
            if (cardFaceUp == true) {
                imageView.setImageResource(card.imageFace)
                if (cardDeck.listOfCardsRemainingOnCourt.size > 1){
                    cardDeck.listOfCardsRandom.add(card)
                }
            } else {
                imageView.setImageResource(card.cardSideBack)
            }
            placeViewRandomly(imageView)
            rotateViewRandomly(imageView)
            layout?.addView(imageView)
            imageView.tag = card
        }
        buttonIsAlreadyPressed = true
    }

    fun setNumberOfFilledSlots(){

        if (numberOfFilledSlotts >= cardSlotGallery.listOfCardSlotsInGallery.size){
            numberOfFilledSlotts = 5
            nextRound()
        } else {
            numberOfFilledSlotts += 1
        }
        layout.background.alpha = 255/5 * numberOfFilledSlotts
    }

    fun newGameDecision(){
        if (cardDeck.listOfCardsRemainingOnCourt.size == 0){
            for (cardSlot in cardSlotGallery.listOfCardSlotsInGallery) {
                cardSlot.isCardSlotEmpty = true
            }
            cardDeck.listOfCardsRandom = cardDeck.listOfAllCards.toMutableList()
            changeBackGroundImage()
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

    fun changeBackGroundImage(){
        if(layoutBackgroundNumber%2 == 0){
            layoutBackgroundNumber = 1
            layout.background = resources.getDrawable(R.drawable.background_1)

        } else {
        layoutBackgroundNumber = 2
            layout.background = resources.getDrawable(R.drawable.background_2)
        }
    }

}