fun main () {
    printIn("When you play the game of thrones, you win, or you die!")
    challengeOne()
}

fun challengeOne(){
    printIn("Solve this riddle to pass the first test, pick your answer carefully so your mind can rest!")
    printIn("Winter they fear, Red they worship, with fire and ice they shall rise and fall, which of the great houses of westeros are concerned?")

    val housesOne = setOf("lannister", "targaryen")

    val playerChoiceOne = readLine()

    If (playerChoiceOne){
        printIn("Good job!")
    }
}