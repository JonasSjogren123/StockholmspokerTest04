package com.example.stockholmspokertest04

class CardSlot (var cardFaceImage: Int) {

    var cardInSlot : Card? = null
    val cardSlotImageEmpty = (R.drawable.playing_card_gallery_slot_empty)

    var positionX : Int? = null
    var positionY : Int? = null

    val rotationAngleInt = 0
    val rotationAngle = rotationAngleInt.toFloat()
    var isCardSlotEmpty: Boolean = true

    fun assignImageView(){
        if (isCardSlotEmpty == true){
            cardFaceImage = (R.drawable.playing_card_gallery_slot_empty)
        }
    }

    fun removeCardFromSlot() {
        cardInSlot = null
        isCardSlotEmpty = true
    }


}