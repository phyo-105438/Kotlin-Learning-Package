package AD_Coder

class Operator {
}

fun main (){
    //Assignment Operator + - * / %
    var a : Int = 4
    var b : Int = 5
    var c = a % b
    println(c)
    //Compound operator
    var one : String = "Android"
    var two : String = "Kotlin"
    var three = one + two
    println(three)

    //Relational > < >= <= == !=
    var x = 3
    var y = 1
    //If else statement
    //Bitwise Operator || &&
    if(x>y && x!=y){
        println("True")
    }
    else{
        println("False")
    }
}