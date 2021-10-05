fun main(){
    val options = arrayOf("rock", "paper", "scissors")
    val computerChoice = options.random()

    print("Pick rock, paper or scissors: ")
    val playerOption = readLine()

    if(computerChoice == playerOption){
        println("It's a tie!")
        return
    }

    val winMessage = "you won!"
    val loseMessage = "you loser!"

    when(computerChoice) {
        "rock" -> if (playerOption == "paper") { println(winMessage) } else { println(loseMessage) }
        "paper" -> if (playerOption == "scissors") { println(winMessage) } else { println(loseMessage) }
        "scissors" -> if (playerOption == "rock") { println(winMessage) } else { println(loseMessage) }
    }
}