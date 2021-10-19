class ChatBot (override val name: String): PersonChat(name) {
    fun intro(){
        println("I am the chatbot who kills people")
    }
}