package com.example.stockholmspokertest04

class CardDeck {

    val cardClub2 = Card(R.drawable.playing_card_club_2, CardSuits.CLUBS, CardRanks.TWO)
    val cardClub3 = Card(R.drawable.playing_card_club_3, CardSuits.CLUBS, CardRanks.THREE)
    val cardClub4 = Card(R.drawable.playing_card_club_4, CardSuits.CLUBS, CardRanks.FOUR)
    val cardClub5 = Card(R.drawable.playing_card_club_5, CardSuits.CLUBS, CardRanks.FIVE)
    val cardClub6 = Card(R.drawable.playing_card_club_6, CardSuits.CLUBS, CardRanks.SIX)
    val cardClub7 = Card(R.drawable.playing_card_club_7, CardSuits.CLUBS, CardRanks.SEVEN)
    val cardClub8 = Card(R.drawable.playing_card_club_8, CardSuits.CLUBS, CardRanks.EIGHT)
    val cardClub9 = Card(R.drawable.playing_card_club_9, CardSuits.CLUBS, CardRanks.NINE)
    val cardClub10 = Card(R.drawable.playing_card_club_10, CardSuits.CLUBS, CardRanks.TEN)
    val cardClubJack = Card(R.drawable.playing_card_club_jack, CardSuits.CLUBS, CardRanks.JACK)
    val cardClubQueen = Card(R.drawable.playing_card_club_queen, CardSuits.CLUBS, CardRanks.QUEEN)
    val cardClubKing = Card(R.drawable.playing_card_club_king, CardSuits.CLUBS, CardRanks.KING)
    val cardClubAce = Card(R.drawable.playing_card_club_ace, CardSuits.CLUBS, CardRanks.ACE)

    val cardDiamond2 = Card(R.drawable.playing_card_diamond_2, CardSuits.DIAMONDS, CardRanks.TWO)
    val cardDiamond3 = Card(R.drawable.playing_card_diamond_3, CardSuits.DIAMONDS, CardRanks.THREE)
    val cardDiamond4 = Card(R.drawable.playing_card_diamond_4, CardSuits.DIAMONDS, CardRanks.FOUR)
    val cardDiamond5 = Card(R.drawable.playing_card_diamond_5, CardSuits.DIAMONDS, CardRanks.FIVE)
    val cardDiamond6 = Card(R.drawable.playing_card_diamond_6, CardSuits.DIAMONDS, CardRanks.SIX)
    val cardDiamond7 = Card(R.drawable.playing_card_diamond_7, CardSuits.DIAMONDS, CardRanks.SEVEN)
    val cardDiamond8 = Card(R.drawable.playing_card_diamond_8, CardSuits.DIAMONDS, CardRanks.EIGHT)
    val cardDiamond9 = Card(R.drawable.playing_card_diamond_9, CardSuits.DIAMONDS, CardRanks.NINE)
    val cardDiamond10 = Card(R.drawable.playing_card_diamond_10, CardSuits.DIAMONDS, CardRanks.TEN)
    val cardDiamondJack = Card(R.drawable.playing_card_diamond_jack, CardSuits.DIAMONDS, CardRanks.JACK)
    val cardDiamondQueen = Card(R.drawable.playing_card_diamond_queen, CardSuits.DIAMONDS, CardRanks.QUEEN)
    val cardDiamondKing = Card(R.drawable.playing_card_diamond_king, CardSuits.DIAMONDS, CardRanks.KING)
    val cardDiamondAce = Card(R.drawable.playing_card_diamond_ace, CardSuits.DIAMONDS, CardRanks.ACE)

    val cardHeart2 = Card(R.drawable.playing_card_heart_2, CardSuits.HEARTS, CardRanks.TWO)
    val cardHeart3 = Card(R.drawable.playing_card_heart_3, CardSuits.HEARTS, CardRanks.THREE)
    val cardHeart4 = Card(R.drawable.playing_card_heart_4, CardSuits.HEARTS, CardRanks.FOUR)
    val cardHeart5 = Card(R.drawable.playing_card_heart_5, CardSuits.HEARTS, CardRanks.FIVE)
    val cardHeart6 = Card(R.drawable.playing_card_heart_6, CardSuits.HEARTS, CardRanks.SIX)
    val cardHeart7 = Card(R.drawable.playing_card_heart_7, CardSuits.HEARTS, CardRanks.SEVEN)
    val cardHeart8 = Card(R.drawable.playing_card_heart_8, CardSuits.HEARTS, CardRanks.EIGHT)
    val cardHeart9 = Card(R.drawable.playing_card_heart_9, CardSuits.HEARTS, CardRanks.NINE)
    val cardHeart10 = Card(R.drawable.playing_card_heart_10, CardSuits.HEARTS, CardRanks.TEN)
    val cardHeartJack = Card(R.drawable.playing_card_heart_jack, CardSuits.HEARTS, CardRanks.JACK)
    val cardHeartQueen = Card(R.drawable.playing_card_heart_queen, CardSuits.HEARTS, CardRanks.QUEEN)
    val cardHeartKing = Card(R.drawable.playing_card_heart_king, CardSuits.HEARTS, CardRanks.KING)
    val cardHeartAce = Card(R.drawable.playing_card_heart_ace, CardSuits.HEARTS, CardRanks.ACE)

    val cardSpade2 = Card(R.drawable.playing_card_spade_2, CardSuits.SPADES, CardRanks.TWO)
    val cardSpade3 = Card(R.drawable.playing_card_spade_3, CardSuits.SPADES, CardRanks.THREE)
    val cardSpade4 = Card(R.drawable.playing_card_spade_4, CardSuits.SPADES, CardRanks.FOUR)
    val cardSpade5 = Card(R.drawable.playing_card_spade_5, CardSuits.SPADES, CardRanks.FIVE)
    val cardSpade6 = Card(R.drawable.playing_card_spade_6, CardSuits.SPADES, CardRanks.SIX)
    val cardSpade7 = Card(R.drawable.playing_card_spade_7, CardSuits.SPADES, CardRanks.SEVEN)
    val cardSpade8 = Card(R.drawable.playing_card_spade_8, CardSuits.SPADES, CardRanks.EIGHT)
    val cardSpade9 = Card(R.drawable.playing_card_spade_9, CardSuits.SPADES, CardRanks.NINE)
    val cardSpade10 = Card(R.drawable.playing_card_spade_10, CardSuits.SPADES, CardRanks.TEN)
    val cardSpadeJack = Card(R.drawable.playing_card_spade_jack, CardSuits.SPADES, CardRanks.JACK)
    val cardSpadeQueen = Card(R.drawable.playing_card_spade_queen, CardSuits.SPADES, CardRanks.QUEEN)
    val cardSpadeKing = Card(R.drawable.playing_card_spade_king, CardSuits.SPADES, CardRanks.KING)
    val cardSpadeAce = Card(R.drawable.playing_card_spade_ace, CardSuits.SPADES, CardRanks.ACE)

    val listOfAllCards = mutableListOf<Card>(cardClub2,cardClub3,cardClub4,cardClub5,cardClub6,cardClub7,cardClub8,cardClub9,cardClub10,cardClubJack,cardClubQueen,cardClubKing,cardClubAce,
        cardDiamond2,cardDiamond3,cardDiamond4,cardDiamond5,cardDiamond6,cardDiamond7,cardDiamond8,cardDiamond9,cardDiamond10,cardDiamondJack,cardDiamondQueen,cardDiamondKing,cardDiamondAce,
    cardHeart2,cardHeart3,cardHeart4,cardHeart5,cardHeart6,cardHeart7,cardHeart8,cardHeart9,cardHeart10,cardHeartJack,cardHeartQueen,cardHeartKing,cardHeartAce,
        cardSpade2,cardSpade3,cardSpade4,cardSpade5,cardSpade6,cardSpade7,cardSpade8,cardSpade9,cardSpade10,cardSpadeJack,cardSpadeQueen,cardSpadeKing,cardSpadeAce)


    var listOfCardsRandom = listOfAllCards.toMutableList()

    fun shuffle() {
        listOfCardsRandom.shuffle()
    }

    var listOfCardsRemainingOnCourt = listOfCardsRandom.toMutableList()

/*
    fun dealCard() /*: PlayingCard */{

        //postitionX, positionY, faceUp..will be set in separate class.
        //Postitions shall be adapted to relative coordinats to fit into any sized divice.
        //listOfPlayingCardsRandom.first().faceUo = (true..false).random()

        val dealtCard : PlayingCard = listOfPlayingCardsRandom.first()
        dealtCard.positionX = (0..400).random()
        dealtCard.positionY = (0..800).random()
        dealtCard.rotationAngleInt = (0..360).random()

        //dealtCard.faceDirection()
        //dealtCard.faceUp

        //dealtCard.inGame = true

        print("${dealtCard.suit}, ${dealtCard.rank}, ")
        print("X: ${dealtCard.positionX}, Y: ${dealtCard.positionY}, ")
        print("Rotation angle: ${dealtCard.rotationAngleInt}°,")
        //print("In game: ${dealtCard.inGame}, ")
        //print("In gallery: ${dealtCard.inGallery}, ")
        //print("Face Up: ${dealtCard.faceUp}, ")
        println("Image: ${dealtCard.imageFace}°")
        listOfPlayingCardsRandom.removeFirst()


       /* return dealtCard*/



    }*/



    //var listOfRandomCards = listOfPlayingCards.toMutableList()

    //listOfRandomCards.shuffle()
    //Log.d("!!!","listOfInts$listOfPlayingCards")
    //Log.d("!!!","listOfRandomInts$listOfRandomCards")
}
