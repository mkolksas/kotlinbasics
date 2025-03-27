//Parent class/Base class/Super class
open class Animal{
    var gender = "Male"
    var age = 3

    fun makesound(){
        println("Animal is speaking")
    }
}

//Child class/Derived class/Sub class
class dog:Animal(){
    fun bark(){
        println("Woof! Woof!")
    }
}

class cat{
    var color = "White"
    var hasFurs = true

    fun meow(){
        println("Meow! Meow!")
    }
}

fun main() {
    var a = Animal()
    var d = dog()
    var c = cat()
}