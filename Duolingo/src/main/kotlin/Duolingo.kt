class Duolingo {
    val wordsList = mutableListOf<Word>(
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
        println("Translate the following words in Dutch:")

        val numberOfWords = 5
        val randomElements = wordsList.asSequence().shuffled().take(numberOfWords).toList()

        val element0 = randomElements[0]
        val element1 = randomElements[1]
        val element2 = randomElements[2]
        val element3 = randomElements[3]
        val element4 = randomElements[4]

        println(element0.original + ", " + element1.original + ", " + element2.original + ", " + element3.original + ", " + element4.original)

        println("Type your answer under here (1 word at a time), you have 5 words left to translate:")

        val input0 = readLine()

        if(input0 == element0.translated){
            println("Correct! 4 words left, now on to the next one:")
        }else if (input0 != element0.translated){
            println("Wrong you idiot! The answer was: ${element0.translated}. 4 words left you faggot:")
        }

        val  input1 = readLine()

        if(input1 == element1.translated){
            println("Correct! 3 words left, now on to the next one:")
        }else if (input1 != element1.translated){
            println("Wrong you idiot! The answer was ${element1.translated}, 3 words left you faggot:")
        }

        val  input2 = readLine()

        if(input2 == element2.translated){
            println("Correct! 2 words left, now on to the next one:")
        }else if (input2 != element2.translated){
            println("Wrong you idiot! The answer was ${element2.translated}, 2 words left you faggot:")
        }

        val  input3 = readLine()

        if(input3 == element3.translated){
            println("Correct! 1 word left, now on to the next one:")
        }else if (input3 != element3.translated){
            println("Wrong you idiot! The answer was ${element3.translated}, 1 word left you faggot:")
        }

        val  input4 = readLine()

        if(input4 == element4.translated){
            println("Correct! That's it for today!, good job!:")
        }else if (input4 != element4.translated){
            println("Wrong you idiot! The answer was ${element4.translated}! No words for you anymore, stupid human!")
        }
    }
}