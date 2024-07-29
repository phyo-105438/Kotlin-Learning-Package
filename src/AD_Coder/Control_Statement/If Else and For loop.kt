package AD_Coder.Control_Statement

class `If Else and For loop` {
}

fun main(){
    //If else statement
    var a : Int = 3
    var b : Int = 5
    if(a%2 == 0){
        println("a is even number")
    }
    else if(a>b){
        println("a is greatere than b")
    }
    else{
        println("a is odd number")
    }
    //For loop
    for(i in 0 .. 10){//..
        println(i)
    }
    for( i in 0 until 10){// until 10
        println(i) // The result will be till 9
    }
    for( i in 10 downTo 1){// downTo
        println(i)
    }
    for(i in 1..10 step 2){
        println(i)
    }
    var str = arrayOf<String>("Android", "Kotlin", "Native")
    for ( i in str){
        println(i)
    }
}