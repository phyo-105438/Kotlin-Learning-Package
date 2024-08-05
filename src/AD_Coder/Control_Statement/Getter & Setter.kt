package AD_Coder.Control_Statement

class `Getter & Setter` {
}
fun main(){
    var s1 = Student_2()
    s1.name = "Ezzie" // set
    println(s1.name)  // get
    var e1 = Employee()
    e1.info("Mg Mg")
    println(e1.name)

}
class Student_2(){
    var name : String = ""
        get() = field.uppercase() //Getter

        set(value){ // value = "Ezzie"
            field = value
        }
}
//Getter and setter using inner function
class Employee(){
    var name : String = ""
    fun info(name : String){
        this.name = name
    }
}



