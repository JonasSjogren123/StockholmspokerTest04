package com.example.stockholmspokertest04

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {

    val playingCardDeck = PlayingCardDeck()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playingCardDeck.shuffle()


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

        dealCards()

    }
}