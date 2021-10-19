class Student(override val name: String): PersonChat(name) {
    fun gossip(){
        println("U fat, I'm $name btw")
    }
}