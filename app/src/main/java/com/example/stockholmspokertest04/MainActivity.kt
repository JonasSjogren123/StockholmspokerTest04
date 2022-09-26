package com.example.stockholmspokertest04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {

    val playingCardDeck = PlayingCardDeck()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

playingCardDeck.shuffle()

    }
}