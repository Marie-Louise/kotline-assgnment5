import javax.print.DocFlavor

fun main() {
oddNumber()
    println(names(arrayOf("marie","louise","Uwase")))
    robbot(6)
    robbot(16)
    robbot(78)
    numbers()

}
fun oddNumber(){
    for (n in 1..100)
        if(n %2!=0)
            println(n)
}
fun names(name:Array<String>):Int{
    var number=0
    for (name in name){
        if(name.length > 5){
          number++
        }
    }
    return number
}
fun robbot(age:Int){
    if(age>6)
        print("glass of milk")
    else if(age>6&& age>16)
        println("bottle of fanta and orange")
    else
            println("bottle of coca cola")
}
fun numbers(){
    for(n in 1..100){
        if (n%3==0 && n%5==0){
            println("FizzBuzz")
    }
     else if (n%3==0){
         println("Fizz")
    }
    else if(n%5==0){
        println("Buss")
    }
    else{
        println(n)
    }}}





