fun main(){
    val options = arrayOf<String>("rock", "paper", "scissors")
    val computerChoice = options.random()
    //println(computerChoice)
    print("Pick rock, paper or scissors: ")
    val playerOption = readLine()
    if(computerChoice == playerOption){
        println("It's a tie!")
    } else if (computerChoice == "rock" || playerOption == "paper"){
        println("You won!")
    } else if (computerChoice == "rock" || playerOption == "scissors"){
        println("You loser!")
    }else if (computerChoice == "paper" || playerOption == "scissors") {
        println("You won!")
    }else if (computerChoice == "scissors" || playerOption == "paper") {
        println("You loser!")
    }else if (computerChoice == "paper" || playerOption == "rock"){
        println("You loser!")
    }else if (computerChoice == "scissors" || playerOption == "rock") {
        println("You won!")
    }
}