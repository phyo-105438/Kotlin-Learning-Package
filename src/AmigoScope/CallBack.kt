fun applyOperation ( a : Int , b : Int , add : (Int,Int) ->Int) : Int{
    return add(a,b);
}
fun add (a : Int, b : Int) : Int {
    return a + b;
}
fun main(){
   var sum =  applyOperation(3,4, ::add);
    println(sum);
    functionAsArgument();

}
fun doubles( n : Int) : Int{
    return n * 2;
}
fun functionAsArgument(){
   println(doubles(4));
}