package AD_Coder.Control_Statement

class `Nested & InnerClass` {
}
class Car(){
    var model : String = ""
    inner class Name(){
        fun show(){

        }
    }
    fun info(){

    }
}
fun main(){
    var car1 = Car()
    car1.model= "Mercedes"
    println(car1.model)
}