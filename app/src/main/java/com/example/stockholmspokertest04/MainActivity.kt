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
        println("Size: ${playingCardDeck.listOfPlayingCardsRandom.size}")
        playingCardDeck.dealCard()
        playingCardDeck.shuffle()
        println("Size: ${playingCardDeck.listOfPlayingCardsRandom.size}")
        playingCardDeck.dealCard()
        playingCardDeck.shuffle()
        println("Size: ${playingCardDeck.listOfPlayingCardsRandom.size}")
        playingCardDeck.dealCard()
        playingCardDeck.shuffle()
        println("Size: ${playingCardDeck.listOfPlayingCardsRandom.size}")
        playingCardDeck.dealCard()
        playingCardDeck.shuffle()
        println("Size: ${playingCardDeck.listOfPlayingCardsRandom.size}")
        playingCardDeck.dealCard()



    }
}