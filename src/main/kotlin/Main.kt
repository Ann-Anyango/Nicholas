fun main() {
    greetperson("Ada")
    var y=remainder(65, 15)
    println(y)
    var x=addition(15,23)
    var w=addition(3,4)
    println(x)
    println(w)
    facts( "Ada"  , "I love dancing")


}
fun greetperson(name:String){
    println( "Hello " +name)
}
fun remainder(num1:Int,num2:Int):Int{
    var remainder = num1 % num2
    return remainder
}
fun addition( num1:Int,num2:Int):Int{
    var sum = num1 + num2
     return sum
}
fun facts (name: String, facts:String){
    println( facts+name)
}
