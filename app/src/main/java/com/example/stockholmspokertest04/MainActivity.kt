package com.example.stockholmspokertest04

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {

    val playingCardDeck = PlayingCardDeck()
    lateinit var layout: RelativeLayout
   // lateinit var button : Button
    var buttonIsAlreadyPressed : Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val galleryCardSlot = ImageView(this)
        galleryCardSlot.layoutParams = LinearLayout.LayoutParams(300, 300)
        galleryCardSlot.setImageResource(R.drawable.playing_card_empty)
        placeViewStatic(galleryCardSlot)


        layout = findViewById<RelativeLayout>(R.id.layout)
        layout?.addView(galleryCardSlot)
        playingCardDeck.shuffle()
        dropCardsOntheLayout()

        //val button = findViewById<Button>(R.id.button1)
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            dropCardsOntheLayout()
            playingCardDeck.listOfPlayingCardsRandom.shuffle()
            layout.addView(button)
        }

    }



        fun dealCards() {

            if (playingCardDeck.listOfPlayingCardsRandom.size == playingCardDeck.listOfPlayingCards.size){
                println("")
                println("")
                println("")
                println("The Deck is full, there are: ${(playingCardDeck.listOfPlayingCardsRandom.size)} cards.")
            }
            for (i in 0 until playingCardDeck.listOfPlayingCardsRandom.size) {
                println("Size: ${playingCardDeck.listOfPlayingCardsRandom.size}")
                playingCardDeck.dealCard()
                if (playingCardDeck.listOfPlayingCardsRandom.size  == 0) {
                    println("The Deck is empty, there are: ${(playingCardDeck.listOfPlayingCardsRandom.size)} cards left.")
                }
            }
        }

        //dealCards()
        //dropCardsOntheLayout()



    fun placeViewStatic(imageView: ImageView) {
        imageView.x = 0f
        imageView.y = 0f
    }

    fun dropCardsOntheLayout() {

           if (buttonIsAlreadyPressed == true) {
            layout?.removeAllViewsInLayout()
        }

        for (playingCard in playingCardDeck.listOfPlayingCardsRandom) {
            val imageView = ImageView(this)
            imageView.layoutParams = LinearLayout.LayoutParams(200, 200)
            imageView.setImageResource(playingCard.imageFace)
            placeViewRandomly(imageView)
            rotateViewRandomly(imageView)
            layout?.addView(imageView)
            imageView.tag = playingCard
        }
        buttonIsAlreadyPressed = true
        /*val button = findViewById<Button>(R.id.button1)
            layout?.addView(button)*/
    }

    fun placeViewRandomly(imageView: ImageView) {
        var randomIntX = (10..700).random()
        imageView.x = randomIntX.toFloat()
        var randomIntY = (300..1600).random()
        imageView.y = randomIntY.toFloat()
    }

    fun rotateViewRandomly(imageView: ImageView) {
        var randomInt = (0..360).random()
        imageView.rotation = randomInt.toFloat()
    }
}