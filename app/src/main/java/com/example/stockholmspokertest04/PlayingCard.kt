package com.example.stockholmspokertest04

import android.widget.ImageView

class PlayingCard(var imageFace: Int, val suit: PlayingCardSuits, val rank: PlayingCardRanks) {

    val cardSideBack = (R.drawable.playing_card_backside)
    var positionX : Int? = null
    var positionY : Int? = null

    var rotationAngleInt = 0
    var rotationAngle = rotationAngleInt.toFloat()

    var faceUp : Boolean = true
    var choice = (0..1).random()

    fun faceDirection() {
        if (choice == 0) {
        faceUp = false
        }
    }


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