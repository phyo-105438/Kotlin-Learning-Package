package AD_Coder.Control_Statement

class `Data Class` {
}

fun main(){
    var s1 = Student_3("Mg Mg", "Yangon")
    s1.show()
    var loc = s1.info()
    println(loc)
}

data class Student_3(var name : String , var location : String){ // data class must include argument
    fun show(){
        println("Name = $name , Location = $location")
    }
    fun info() : String {
        return location
    }
}