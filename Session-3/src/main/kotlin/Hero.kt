class Hero (
    override val name: String
    ): Person(name) {
        fun talk(){
            println("The hell you doing idiot?")
        }
}