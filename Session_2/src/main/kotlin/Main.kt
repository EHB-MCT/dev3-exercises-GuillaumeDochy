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
        challengeTwo()
    } else{
        gameOver()
    }
}

fun challengeTwo(){
    println("For this next task, guess the number the dice rolled, guess wrong and your head will roll")
    println("Type low if your guess is 1-3, type high if your guess is 4-6")

    val number = rollDice(0)
    var correctAnswer = ""

    if (number < 4){
        correctAnswer = "low"
    } else {
        correctAnswer = "high"
    }

    val playerChoiceTwo = readLine()

    if( playerChoiceTwo == correctAnswer){
        succes()
    }else{
        gameOver()
    }
}

fun rollDice(number: Int): Int {
    val dice = arrayOf(1, 2, 3, 4, 5, 6)
    return dice.random()
}

fun succes(){
    println("Good job!")
}

fun gameOver(){
    println("nope, you failed, cut this bastards head off")
}