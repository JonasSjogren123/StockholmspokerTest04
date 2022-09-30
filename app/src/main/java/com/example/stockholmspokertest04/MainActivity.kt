package com.example.stockholmspokertest04

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

//import com.example.stockholmspokertest04.databinding.ActivityMainBinding


class MainActivity: AppCompatActivity() {

    val playingCardDeck = PlayingCardDeck()
    var listOfPlayingCardsRemainingInGame = playingCardDeck.listOfPlayingCardsRandom.toMutableList()
    lateinit var layout: RelativeLayout

    var buttonIsAlreadyPressed: Boolean = false
    var playingCardFaceUp : Boolean = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val galleryCardSlot = ImageView(this)
        galleryCardSlot.layoutParams = LinearLayout.LayoutParams(300, 300)
        galleryCardSlot.setImageResource(R.drawable.gallery_playing_card_slot_empty)
        placeViewStatic(galleryCardSlot)

        layout = findViewById<RelativeLayout>(R.id.layout)
        layout?.addView(galleryCardSlot)
        playingCardDeck.shuffle()
        dropCardsOntheLayout()

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            dropCardsOntheLayout()
            playingCardDeck.listOfPlayingCardsRandom.shuffle()
            layout.addView(button)
        }

    }

    fun placeViewStatic(imageView: ImageView) {
        imageView.x = 0f
        imageView.y = 0f
    }

    fun flipCardSide() {
        var choice = (0..1).random()
        playingCardFaceUp = choice == 0
    }

    fun dropCardsOntheLayout() {
        playingCardDeck.listOfPlayingCardsRemainingInGame = playingCardDeck.listOfPlayingCardsRandom.toMutableList()
        playingCardDeck.listOfPlayingCardsRandom.clear()
           if (buttonIsAlreadyPressed == true) {
            layout?.removeAllViewsInLayout()
        }
        for (playingCard in playingCardDeck.listOfPlayingCardsRemainingInGame) {
            val imageView = ImageView(this)
            imageView.layoutParams = LinearLayout.LayoutParams(200, 200)
            flipCardSide()
            if (playingCardFaceUp == true) {
                imageView.setImageResource(playingCard.imageFace)
                playingCardDeck.listOfPlayingCardsRandom.add(playingCard)
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