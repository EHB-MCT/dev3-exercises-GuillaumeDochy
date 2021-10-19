class Teacher(override val name: String): PersonChat(name), ChatPartner {
    override fun talk(){
        funFact()
    }
    override fun intro() {
        println("I am $name")
    }
    private fun funFact() {
        println("Nobody has ever been in an empty room")
    }
}