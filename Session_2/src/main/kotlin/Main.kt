fun main () {
    println("When you play the game of thrones, you win, or you die!")
    challengeOne()
}

fun challengeOne(){
    println("Solve this riddle to pass the first test, pick your answer carefully so your mind can rest!")
    println("Winter they fear, Red they worship, with fire and ice they shall rise and fall, which of the great houses of Westeros are concerned?")

    val housesOne = setOf("lannister", "targaryen")

    val playerChoiceOne = readLine()

    if (housesOne.contains(playerChoiceOne)){
        succes()
    } else{
        gameOver()
    }
}

fun succes(){
    println("Good job!")
}

fun gameOver(){
    println("nope, you failed, cut this bastards head off")
}