package AmigoScope

class ClassAndObject {
}

fun main(){
    var tv = SmartDevice();
    tv.brand = "Samsung";
    tv.price = 1000.00;
    println("${tv.brand}  is ${tv.price}");
    tv.switchOn();
    tv.switchOff();


    val phone = SmartDevice();
    phone.brand = "Hawei";
    phone.price = 300.00;
    println("${phone.brand} is ${phone.price}")
    phone.switchOn();
    phone.switchOff();
}

class SmartDevice {
    var brand: String = ""
        get() = field;
        set(value){
            field = value.uppercase();
        }
    var price: Double = 0.0
        get() = field;
        set(value){
            field = 100.0
        }
    var isSwitchOn = false;
    fun switchOn(){
        isSwitchOn = true;
        println("$brand is switching om")
    }
    fun switchOff(){
        isSwitchOn = false;
        println("$brand is switching off")
    }

}
