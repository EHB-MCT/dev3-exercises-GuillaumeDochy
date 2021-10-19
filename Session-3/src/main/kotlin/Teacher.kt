class Teacher(override val name: String): PersonChat(name) {
    fun funFact(){
        println("Nobody has ever been in an empty room")
    }
}