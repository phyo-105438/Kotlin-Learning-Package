package AD_Coder.Control_Statement

class Function {
}
fun main(){
    hello()
}
//Simple or no parameter function
fun hello(){
    println("This is an hello function")
    var a = 5
    var b = 7
    var c = a + b
    if(c%2 == 0){
        println("c is even number")
    }
    else{
        println("c is odd number")
    }
}