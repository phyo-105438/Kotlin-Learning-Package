package AD_Coder.Control_Statement

class Function {
}
fun main(){
    hello()
    paraFun("Ezzie",25)
    returnFun(3,5)

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
//Parameterized Function
fun paraFun(name : String , age : Int){
    if (age > 12){
        println("$name is adult")
    }
    else{
        println("$name is younger")
    }
}
//Return Function
fun returnFun(x : Int , y : Int ):Int {
    var result = x + y
    println(result)
    return result
}