package AmigoScope

class Practise {
}
fun main(){
    val name = arrayOf("Hello","Ezzie","Kiel",2,true);
    println(name.contentToString())
    val names = arrayOf<String>("Hello","Ezzie");
    println(names.contentToString())
    val list : List<String>  = listOf("Hello","Ezzie","Kiel");
    println(list)
    println(list.get(1))
    println(list.contains("Kiel"))
    val nullArray = arrayOfNulls<String>(5);
    nullArray.fill("$")
    nullArray.set(0,"Hello");
    nullArray.set(1,"Ezzie");
}