class Duolingo{
    constructor(
        roundSize: Int = 5,
        language: String = "english"
    )

    val words = mutableListOf<Word>(
        Word("candle", "kaars", "english"),
        Word("bougie", "kaars", "french"),

        Word("lightbulb", "lamp", "english"),
        Word("ampoule", "lamp", "french"),

        Word("lighter", "aansteker", "english"),
        Word("briquet", "aansteker", "french"),

        Word("mouse", "muis", "english"),
        Word("souris", "muis", "french"),

        Word("safe", "koffer", "english"),
        Word("coffre", "koffer", "french"),

        Word("hat", "hoed", "english"),
        Word("chapeau", "hoed", "french"),

        Word("charger", "lader", "english"),
        Word("chargeur", "lader", "french"),

        Word("car", "auto", "english"),
        Word("voiture", "auto", "french"),

        Word("wallet", "portemonee", "english"),
        Word("portefeuille", "portemonee", "french"),

        Word("phone", "gsm", "english"),
        Word("téléphone", "gsm", "french"),
    )

    fun play(){

        val numberOfWords = 5;
        val randomWord = words.shuffled().take(numberOfWords).toMutableSet()


        while (randomWord.isNotEmpty()){
            val selectedWord = randomWord.random()
            println("What is the translation of ${selectedWord.original}")
            val userAnswer = readLine()

            if (selectedWord.translated == userAnswer) {
                println("Good job !")
                randomWord.remove(selectedWord)
            }else{
                println("False answer. Try again later")
            }
            println("They are currently " + randomWord.count() + "words left")
        }
    }
}