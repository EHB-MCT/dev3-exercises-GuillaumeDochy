fun main(){
    println("Choose a difficulty: easy/ hard")

    var roundSizing = 0
    val chosenMode = readLine()

    if (chosenMode == "easy"){
        roundSizing = 3
    } else if (chosenMode == "hard"){
        roundSizing = 6
    }else{
        throw Exception("Please give a valid answer.")
    }

    println("Choose a language: english/ french")

    val chosenLng = readLine()

    var duolingo = Duolingo(roundSizing, "$chosenLng")
    duolingo.play()
}