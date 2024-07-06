package AmigoScope

class Function {
}

fun main(){
    greet("Android",2);
    greet("Kotlin",5);
//    foo(bar = {
//        println("bar as a function")
//    })
//
//    foo(bar = {
//        println("Baz Baz")
//    })
    foo(bar = {
        2
    })
    foo();
}
//Passing parameter in function
fun greet( name : String, age : Int) : Unit{// default include public and unit like public void in java print("Hello Kotlin");
    println("Hello $name and $age years old");
}
//Default arguments
//fun greet(name : String , age = 1){
//
//}
//Callback Function
fun foo( name : String = "", bar : () -> Int = {2}){
    println("bar function")
    bar();
}