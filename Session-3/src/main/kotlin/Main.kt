fun main(){
//    createCourse()
//    createNemesis()
    chatRoulette()
}

//fun createCourse(){
//    val design1 = Course(
//        "Design 1",
//        "Je maakt in dit opleidingsonderdeel kennis met de basisprincipes van grafische vormgeving: typografie, kleur, beeld, compositie en de werkprocessen van een grafisch vormgever. We leren deze principes toepassen en maken daarvoor gebruik van de software uit de professionele wereld (Adobe Illustrator en Photoshop).",
//        1,"Maaike Beuten",
//        1,
//        5,
//        "design",
//        true
//    )
//
//    val development1 = Course(
//        "development 1",
//        "Je leert procedureel programmeren met behulp van Javascript. Door gebruik te maken van de grafische mogelijkheden van HTML 5 Canvas leer je op een visuele en intuïtieve manier programmeren. Alle basisconcepten van programmeren komen aan bod: variabelen en objecten, functies en methodes, variatie door middel van iteratiestructuren en selectiestructuren, events en lijst-structuren. Met behulp van de aangeleerde vaardigheden genereer je abstracte afbeeldingen en interactieve animaties.",
//        1,
//        "Peter Dickx",
//        1,
//        5,
//        "development",
//        true
//    )
//}
//
//fun createNemesis(){
//    val dries = Villain("Dries")
//    val jens = Hero("Jens")
//    val matthias = Villain("Matthias")
//
//    dries.talk()
//    jens.talk()
//    matthias.talk()
//}

fun chatRoulette(){
    val sam = Student("Sam")
    val bram = Teacher("Bram")
    val pete = Comedian("Pete")
    val bot = ChatBot("Dornaku")

    val names = arrayOf(sam, bram, pete, bot)
    val choice = names.random()

    choice.intro()
    choice.talk()
}