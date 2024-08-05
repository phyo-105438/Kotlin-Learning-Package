package AD_Coder.Control_Statement

class `Sealed Class` {
}
sealed class Error( var message : String){
    class Network() : Error("Network Error")
    class Database() : Error("Database Error")
    class API() : Error("API Error")
    class Unknown() : Error("Unknown")
}

fun main(){
    println(Error.Network().message)
    var error = listOf(Error.Network(), Error.Database(), Error.API(), Error.Unknown())
    error.forEach {
        println(it.message)
    }
}