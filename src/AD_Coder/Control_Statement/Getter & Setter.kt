package AD_Coder.Control_Statement

class `Getter & Setter` {
}
fun main(){
    var s1 = Student_2()
    s1.name = "Ezzie" // set
    println(s1.name)  // get

}
class Student_2(){
    var name : String = ""
        get() = field //Getter

        set(value){ // value = "Ezzie"
            field = value
        }
}



