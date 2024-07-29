package AD_Coder.Control_Statement

class `When and For Each` {
}
fun main(){
    //When
    var num : Int = 20
    when(num){
        1 -> println("num = 1")
        2 -> println("num = 2")
        3 -> println("num = 3")
        4 -> println("num = 4")
        5 -> println("num = 5")
       in 6..10 -> println("num is between 6 to 10")
        else -> println("num = $num")
    }
    // For Each
    var res = arrayOf("android", "kotlin", "multiple")
        res.forEach {
            println(it)
        }
}