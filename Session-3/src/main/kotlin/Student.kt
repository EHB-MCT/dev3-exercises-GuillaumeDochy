class Student(override val name: String): PersonChat(name), ChatPartner {
    override fun talk(){
        gossip()
    }
    private fun gossip(){
        println("U fat")
    }
    override fun intro() {
        println("I'm $name")
    }
}