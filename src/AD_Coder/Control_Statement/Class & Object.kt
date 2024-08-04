package AD_Coder.Control_Statement

class `Class & Object` {
}

fun main(){
    var student = Student()
    student.info()
    student.display()
    student.name = "Kotlin"
    student.showName()
    var num = AddNumber(5,10)
    var result = num.addNum()
    println(result)
}

class Student (){
    var name : String = ""
    fun info(){
        println("This is Student info Function")
    }
    fun display(){
        println("This is Student display Function")
    }
    fun showName(){
        println("Student name is $name")
    }
}

class AddNumber(var a : Int , var b : Int){//Must declare variable in
        fun addNum() : Int {
            var c  = a + b
            return c
        }
}