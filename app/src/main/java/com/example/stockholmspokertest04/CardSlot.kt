package com.example.stockholmspokertest04

class CardSlot (var cardFaceImage: Int) {

    lateinit var playingCardInSlot : Card
    val playingCardSlotEmpty = (R.drawable.playing_card_gallery_slot_empty)
    var playingCardSlotFull = false

    var positionX : Int? = null
    var positionY : Int? = null

    val rotationAngleInt = 0
    val rotationAngle = rotationAngleInt.toFloat()
    var slotTaken: Boolean = false

    fun assignImageView(){
        if (slotTaken == false){

        }
    }
}