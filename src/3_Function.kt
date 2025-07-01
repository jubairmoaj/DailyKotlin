fun main(){
    //return type - String, Int, Double...
    //unit - no return type
    //fun functionName(): ReturnType{ body }


    fun test(): Int{
        val a = 1
        val b = 4
        return a+b
    }
    println(test())

    //title: No return type
    fun name(): Unit{
        println("My name is Jubair")
    }
    name()

    fun fullName(): String{
        val firstName = "Jubair"
        val lastName = "Moaj"
        return "$firstName $lastName"
    }
    println("My name is "+fullName())



    //title Add parameter
    println("==========================")

    fun birthdayWish(name: String): String{
        return "Happy Birthday $name"
    }
    println(birthdayWish("Jubair")) //pass string to in function
    println(birthdayWish("Sayeed"))

    //title use multiple parameter
    fun fullBirthdayWish(name: String, Age: Int): String{
        //multiple return type doesn't support directly

        return "Happy Birthday $name, you are $Age years old"
    }
    println(fullBirthdayWish("Jubair", 25))


    //title Set default parameter value
    println("==========================")

    fun fullBirthdayWish2(name: String="Abul", Age: Int = 0): String{
        return "Happy Birthday $name, you are $Age years old"
    }

    println(fullBirthdayWish2())
    println(fullBirthdayWish2("Panda"))
    println(fullBirthdayWish2(Age = 25))
    println(fullBirthdayWish2("Abul", 25))
}