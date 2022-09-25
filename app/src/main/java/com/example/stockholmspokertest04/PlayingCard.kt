package com.example.stockholmspokertest04

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class PlayingCard(var image: Int, var suit: PlayingCardSuits, var rank: PlayingCardRanks) {
    lateinit var imageFace :ImageView

}