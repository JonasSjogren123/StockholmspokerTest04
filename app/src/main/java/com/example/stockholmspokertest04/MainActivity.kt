package com.example.stockholmspokertest04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val cardClub2 = PlayingCard(R.drawable.playing_card_club_2, PlayingCardSuits.CLUBS, PlayingCardRanks.TWO)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}