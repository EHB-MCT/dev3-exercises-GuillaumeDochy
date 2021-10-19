class ChatBot (private val name: String): ChatPartner{
    override fun talk(){
        println("I kill people haha")
    }
    override fun intro(){
        println("I am the chatbot named $name")
    }
}