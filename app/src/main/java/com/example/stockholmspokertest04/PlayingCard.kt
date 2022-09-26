package com.example.stockholmspokertest04

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class PlayingCard(val imageFace: Int, val suit: PlayingCardSuits, val rank: PlayingCardRanks) {

    val cardSideBack = (R.drawable.playing_card_backside)
    var positionX : Int? = null
    var positionY : Int? = null
    var rotationAngle : Float? = null
    var faceUo : Boolean = true
    var inGallery : Boolean = false
    var inGame : Boolean = false

}