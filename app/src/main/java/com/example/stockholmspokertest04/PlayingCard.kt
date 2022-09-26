package com.example.stockholmspokertest04

import android.widget.ImageView

class PlayingCard(val imageFace: Int, val suit: PlayingCardSuits, val rank: PlayingCardRanks) {

    val cardSideBack = (R.drawable.playing_card_backside)
    var positionX : Int? = null
    var positionY : Int? = null

    var rotationAngleInt = 0
    var rotationAngle = rotationAngleInt.toFloat()
    var faceUo : Boolean = true
    var inGallery : Boolean = false
    var inGame : Boolean = false

    /*lateinit var image : Int

    if (faceUp == true) {
        image = imgageFace
    } else {
        image = cardSideBack
    }

     */

    //imageFace.rotation = rotationAngle
    //cardSideBack.rotation = imageFace.rotation

}