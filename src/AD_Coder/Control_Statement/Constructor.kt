package AD_Coder.Control_Statement

class Constructor {
}
fun main(){
    var s1 = Student_1("Ezzie", "ez123")
    println(s1.name)
    println(s1.mail)
    println(s1.rollNo)

    var s2 = Student_1("Android", "android@gmail.com","AC_3000")
    println(s2.name)
    println(s2.mail)
    println(s2.rollNo)

    var t1 = Teacher("Ethan",123,213)
    println(t1.name)
    println(t1.id)
    println(t1.rollNo)
}

class Student_1 (var name : String , var mail : String ){
    var rollNo : String = ""
    constructor(nameRes : String , mailRes : String , rollNoRes : String) : this(nameRes,mailRes){
        this.rollNo = rollNoRes
    }
}
//Practise

class Teacher (var name : String){
    var id : Int = 0
    var rollNo : Int = 0
    constructor(TName :String , TId : Int, TRoll : Int) : this(TName) {
        this.name = TName
        this.id = TId
        this.rollNo = TRoll
    }
}