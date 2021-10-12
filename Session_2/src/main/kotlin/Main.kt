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

    println(correctAnswer)

    val playerChoiceTwo = readLine()

    if( playerChoiceTwo == correctAnswer){
        succes()
        challengeThree()
    }else{
        gameOver()
    }
}

fun rollDice(number: Int): Int {
    val dice = arrayOf(1, 2, 3, 4, 5, 6)
    return dice.random()
}

fun challengeThree(){
    println("In this challenge you will face an opponent: The Mountain. Pick a weapon to defeat him")
    println("Pick wrong and you die, pick right and you win, but pick too weak and you return to the previous challenge")
    println("Your choices are: sword, axe, spear")

    val playerChoiceThree = readLine()

    when(playerChoiceThree){
        "sword" -> failed()
        "axe" -> flee()
        "spear" -> succeeded()
    }
}

fun failed(){
    println("You died, what idiot would use a sword against The Mountain!")
    gameOver()
}

fun flee(){
    println("You stupid bastard, that's too weak against him! Your punishment is going back to the previous challenge!")
    challengeTwo()
}

fun succeeded(){
    println("Good job defeating The Mountain! On you go to the next challenge")
    challengeFour()
}

fun challengeFour(){
    println("Be quick, the King asked for your help! His brother at the Nightswatch needs help against WhiteWalker that survived the Long Night!")
    println("The Whitewalker could be reasoned with, but in order for him to stay far beyond the Wall, he asked to guess a number between 1 and 100")
    println("We tricked him into never losing, but if he lose patience, he will attack! Guess as fast as possible!")

    val number = (1..100).random()

    println(number)

    var playerChoiceFour = readLine()!!.toInt()

    while (playerChoiceFour != number){
        if (playerChoiceFour < number){
            println("The number is higher than that")
            playerChoiceFour = readLine()!!.toInt()
        } else if (playerChoiceFour > number) {
            println("The number is lower than that")
            playerChoiceFour = readLine()!!.toInt()
        }
    }



    if (playerChoiceFour == number){
        succes()
        challengeFive()
    }
}

fun challengeFive(){
    
}

fun succes(){
    println("Good job!")
}

fun gameOver(){
    println("nope, you failed, cut this bastards head off")
}