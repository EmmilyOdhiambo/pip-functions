fun main() {
    myDetail("Stephanie",20,"Uganda")
    println(addition(50,100,550,200))
    print(averageNumber(10,20,30,40,50))

}
// Create and invoke a function that takes in a users name, age, and nationality and prints out
// “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and
// I am from Kenya”
fun myDetail (name:String,age:Int,nationality:String){
    println("Hello my name is $name, I am $age years old, and I am from $nationality")
}
// Create and invoke a function that returns the sum of any given 4 numbers
fun addition (num1:Int,num2:Int,num3:Int,num4:Int): Int{
    var sum = num1 + num2 + num3 + num4
    return (sum)
}
//Create and invoke a function that given any 5 numbers, it returns their average
fun averageNumber(num5:Int,num6:Int,num7:Int,num8:Int,num9:Int):Int{
    var result = (num5+num6+num7+num8+num9)/5
    return result

}


//You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not.

fun studentRecord (fullName:String,age:Int,phoneNumber:String,weight:Double,citizen:Boolean){
    println($fullName)


}