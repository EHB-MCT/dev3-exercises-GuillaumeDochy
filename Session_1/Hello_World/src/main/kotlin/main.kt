fun main(){
    println("Hello World")
    println(greetStudents())
}



fun greetStudents(){
    val students = arrayOf<String>("Guillaume", "Matthias", "Rayan", "Dries")
    for (student in students)
    {
        println("hello $student,")
    }
}