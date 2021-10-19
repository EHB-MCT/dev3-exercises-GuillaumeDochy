class Comedian (override val name: String): PersonChat(name), ChatPartner {
    override fun talk(){
        tellJoke()
    }

    override fun intro() {
        println("I am $name")
    }
    private fun tellJoke(){
        println("I sent a dickipick to my mom last night by accident. That's the joke")
    }
}