class Dog(var name:String,var breed:String,var color:String){

}

fun main() {

    var dog1 = Dog("Maureen", "Chihuahua", "white")
    println("${dog1.name} is a ${dog1.breed} and is color ${dog1.color}.")

    var dog2 = Dog("Ojijo", "Bulldog", "Brown")
    println(dog2.breed)
    var dog3 = Dog("Innocent", "German Shepherd", "Black")
    var dog4 = Dog("Abigail", "Siberian Husky", "White")

}