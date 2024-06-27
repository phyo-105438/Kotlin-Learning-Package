package AmigoScope

import com.sun.org.apache.xpath.internal.operations.Bool
import kotlin.math.*

class Math {
}
fun main(){
    val number1 = 10;
    val number2 = 3;
    println(kotlin.math.PI)
    println(max(10, 3))
    println(min(10, 3))
    println(sqrt(5.0))
    println(round(4.2))
    println(ceil(4.2))
    println(floor(4.9))

    //SUM
    val sum = 10 + 10;
    val sumString = "10" + "10";
    println(sum)
    println(sumString)

    val num1 = "10";
    println(10 + num1.toInt());
    val d = 3.0;
    println(d.toInt())

    val isAdult = true;
    val isMale = false;
    val orderComplete : Boolean? = null;
    println(isAdult)
    println(isMale)
    println(orderComplete)

    //IF ELSE
    val n1 = 31;
    val n2 = 20;
    if(n1<n2 || n1<=30){
        println(":(")
    }
    else{
        println(":)")
    }
    //Ternary Operator
    val ternary = if (n1>n2)"n1 is greater" else "n2 is greater";
   // String ter = (n1 < n2) ? "n1 is greater" : "n2 is greater"; In java
    println(ternary)
    //When (Switch In Java)
    val gender : String = "M";
    when(gender){
        "M" -> println("Male")
        "F" -> println("Female")
        else -> {
            println("Unknown Gender")
    }

    }

}