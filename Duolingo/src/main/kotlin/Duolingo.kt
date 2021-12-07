class Duolingo(
    val roundSize: Int = 5,
    val language:String
){

    var words = mutableListOf<Word>(
        EnglishWord("candle", "kaars"),
        FrenchWord("bougie", "kaars"),

        EnglishWord("lightbulb", "lamp"),
        FrenchWord("ampoule", "lamp"),

        EnglishWord("lighter", "aansteker"),
        FrenchWord("briquet", "aansteker"),

        EnglishWord("mouse", "muis"),
        FrenchWord("souris", "muis"),

        EnglishWord("safe", "koffer"),
        FrenchWord("coffre", "koffer"),

        EnglishWord("hat", "hoed"),
        FrenchWord("chapeau", "hoed"),

        EnglishWord("charger", "lader"),
        FrenchWord("chargeur", "lader"),

        EnglishWord("car", "auto"),
        FrenchWord("voiture", "auto"),

        EnglishWord("wallet", "portemonee"),
        FrenchWord("portefeuille", "portemonee"),

        EnglishWord("phone", "gsm"),
        FrenchWord("téléphone", "gsm"),
    )

    init {
        words = words.filter { it.language == language }.toMutableList()
    }

    fun play(){

        val filteredList = words.filter{
            it.language == language
        }

        val numberOfWords = roundSize;
        val randomWord = filteredList.shuffled().take(roundSize).toMutableSet()

        println("Hello, you have $roundSize words from to translate from $language to Dutch today, let's begin!")

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