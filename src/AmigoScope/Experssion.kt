package AmigoScope

class Experssion {
}
fun main(){
    val n1 = 31;
    val n2 = 20;
    when(n1>=n2 || n1<=30){
        (n1==100) -> println(":)")
        (n2 == 100) -> println(":(")
        else -> {
            println("None of these")}
    }

    val age = 48;
    when(age){
        in 13..19 -> println("Teenager")
        in 0..12 -> println("Child")
        in 18..60 -> println("Adult")
        else -> {
            println("Older")
        }
    }
    //Array
    val names = arrayOf<String>("Jamila", "Jamas");
    val int = arrayOf<Int>(2,3,34,34,5);
    println(int)
    println(names[0])
    println(names.size)
    println(names.contentToString())
    if("hello" in names){
        println("Found")
    }else{
        println("Not Found")
    }
    val arrayOfNull = arrayOfNulls<String>(5);
    arrayOfNull.fill("$")
    arrayOfNull[0] = "Hello"
    arrayOfNull[1] = "Ezzie"

    println(arrayOfNull.contentToString())

    //List
    val list : List<String> = listOf("Jamila", "Jamas", "Saleh","Peter");
    println(list.get(3))
    println(list)
    println(list.contains("Jamas"))
}