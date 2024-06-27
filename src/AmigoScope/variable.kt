package AmigoScope

const val PI = 3.14;// static final ( in java) SO, it is more compatible to declare outside the function
//const val pi = getPIValue();// error
val pi2 = getPIValue();//final


fun main(args : Array<String>) {
    println("Hello World")
    println("How are you ?")

    //Declaration variable
    var name : String = "Ezzie"
    var age : Int = 25;
    println(name)
    println(age)
    println("Name : ${name} Age: ${age}")
    println("Name : $name , Age : $age")

   // int number = 19;// in java
    var n : Int = 10;
    var l : Long = 100L;
    var d : Double = 3.14;
    var f : Float = 3.14F;
    var b : Boolean = true;
    var s : String = "Amigoscode";
    var c : Char = 'A';

    //Any data type
    var number : Any = 10 // You can add any data type

    //Type Inference
    var n1 = 10;
    var l1 = 100L;
    var d1 = 3.14;

    // Var vs Val

    var num1 = 100;
    val num2 = 200;//Immutable Variable (Final in java)

    num1 = 123;

    val name1 = "Jamal";// read only
    var i = 0 ;
    i = 2;
    //nullable variable
    var name3 = "Ezzie"
    name3.uppercase();

    var brand1 : String? = "Ezekiel"
    println(brand1?.uppercase())//need to add nullable sign if you are declared as nullable

    //Methods
    var myName = "PhyoHEin";
    println(myName.uppercase())
    println(myName.lowercase())
    println(myName[0])
    println(myName[1])
    println("".isEmpty());
    var msg = "$name and $age";
    println(msg)
}

fun getPIValue() : Double = 3.142;


