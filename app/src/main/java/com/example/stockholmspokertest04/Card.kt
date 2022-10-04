package com.example.stockholmspokertest04

class Card(var imageFace: Int, val suit: CardSuits, val rank: CardRanks) {

    val cardSideBack = (R.drawable.playing_card_backside)
    var positionX : Int? = null
    var positionY : Int? = null

    var rotationAngleInt = 0
    var rotationAngle = rotationAngleInt.toFloat()
}