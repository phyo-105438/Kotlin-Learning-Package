package AmigoScope

class Looping {
}
fun main(){
    val names = listOf("mary","ali","alex");
    val numbers = arrayOf<Int>(1,2,3,4,5);
    for(name in names){
        val n =name.replaceFirstChar { it.uppercase() }
        println(n)
    }
    println()
    for (number in numbers){
        print(number)
    }
    //Char Array
    val chars = charArrayOf('A','B','C','D','E')
    for (char in chars.indices.reversed()){
        println("$char - ${chars[char]}")
    }

    for (i in 1..5) println(i)
    for ( i in 10 downTo 1) println(i)
    for( i in 0 ..10 step 2) println(i)
    for ( i in 100 downTo 10 step 10) println(i)
    //For each Looping
    val name = "AmigoScope";
    for(i in name.indices.reversed()){
        println(name[i])
    }
    name.forEach { println(it) }
    //While Loop
    var number = name.length -1;
    while (number >= 0){
        println("Number : $number")
        --number
    }
}