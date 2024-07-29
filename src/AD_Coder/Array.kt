package AD_Coder

class Array {
}
fun main(){
    val strArray = arrayOf("android", "kotlin", "multiple")
    println(strArray.contentToString())
    println(strArray.joinToString())
    println(strArray.size)
    println(strArray[2])
    strArray.set(1,"Native");
    println(strArray.contentToString())

    val intArray = arrayOf<Int>(1,2,3,4,5,6)
    println(intArray.joinToString())
    println(intArray[3])
}