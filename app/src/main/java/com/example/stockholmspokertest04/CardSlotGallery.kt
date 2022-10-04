package com.example.stockholmspokertest04

class CardSlotGallery {

    /*val playingCardSlotEmpty = (R.drawable.gallery_playing_card_slot_empty)
    var playingCardSlotFull = imageView
    var slotFull : Boolean = false

    var positionX : Int? = null
    var positionY : Int? = null

    val rotationAngleInt = 0
    val rotationAngle = rotationAngleInt.toFloat()
    var slotTaken: Boolean = false
    */

    val PlayingCardSlotsPositionY = 10
    val playingCardSlotA = CardSlot(R.drawable.playing_card_gallery_slot_empty)
    val playingCardSlotB = CardSlot(R.drawable.playing_card_gallery_slot_empty)
    val playingCardSlotC = CardSlot(R.drawable.playing_card_gallery_slot_empty)
    val playingCardSlotD = CardSlot(R.drawable.playing_card_gallery_slot_empty)
    val playingCardSlotE = CardSlot(R.drawable.playing_card_gallery_slot_empty)

    val listOfPlayingCardSlotsInGallery : List<CardSlot> = listOf(playingCardSlotA, playingCardSlotB, playingCardSlotC, playingCardSlotD,playingCardSlotE)
    var listOfPlayingCardsInGalleryMutable = mutableListOf<CardSlot>()

    fun populateGalleryWithPlayingCardSlots() {
        playingCardSlotA.positionX = 10
        playingCardSlotB.positionX = 110
        playingCardSlotC.positionX = 210
        playingCardSlotD.positionX = 310
        playingCardSlotE.positionX = 410
        playingCardSlotA.positionY = PlayingCardSlotsPositionY
        playingCardSlotB.positionY = PlayingCardSlotsPositionY
        playingCardSlotC.positionY = PlayingCardSlotsPositionY
        playingCardSlotD.positionY = PlayingCardSlotsPositionY
        playingCardSlotE.positionY = PlayingCardSlotsPositionY
    }

}