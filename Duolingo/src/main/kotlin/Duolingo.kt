class Duolingo(
    val roundSize: Int = 5,
    val roundLanguage: String = "english"
){

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

        val filteredList = words.filter{
            it.language == roundLanguage
        }

        val numberOfWords = roundSize;
        val randomWord = filteredList.shuffled().take(numberOfWords).toMutableSet()

        println("Hello, you have $roundSize words from to translate from $roundLanguage to Dutch today, let's begin!")

        while (randomWord.isNotEmpty()){
            val selectedWord = randomWord.random()
            println("What is the translation of ${selectedWord.original}")
            val userAnswer = readLine()

            if (selectedWord.translated == userAnswer) {
                println("Good job!")
                randomWord.remove(selectedWord)
            }else{
                println("False answer. Try again later")
            }
            println("There are currently " + randomWord.count() + " words left.")
        }
    }
}