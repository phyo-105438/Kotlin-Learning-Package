package AmigoScope

class ClassAndObject {
}

fun main(){
    var tv = SmartDevice(
        "Samsung QLED",
        1000.00,
        false
    );
    tv.brand = "Samsung";
    tv.price = 1000.00;
    println("${tv.brand}  is ${tv.price}");
    tv.switchOn();
    tv.switchOff();


    val phone = SmartDevice(
        "Hawei",
        300.00,
        false
    );
    phone.brand = "Hawei";
    phone.price = 300.00;
    println("${phone.brand} is ${phone.price}")
    phone.switchOn();
    phone.switchOff();
}

class SmartDevice constructor(
    brand : String,
    price : Double,
    isSwitchOn : Boolean
){
    var brand: String = brand
        get() = field;
        set(value){
            field = value.uppercase();
        }
    var price: Double = price
        get() = field;
        set(value){
            field = 100.0
        }
    var isSwitchOn = isSwitchOn
    fun switchOn(){
        isSwitchOn = true;
        println("$brand is switching om")
    }
    fun switchOff(){
        isSwitchOn = false;
        println("$brand is switching off")
    }

}
