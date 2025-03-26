fun main() {
    //Standard library functions/Pre-defined functions
    var output = Math.sqrt(144.0)
    println("The squareroot of 144 is $output")

    var number = Math.round(45.89)
    println(number)

    school()
    add()
    student("John","Male", 25)
    student("Ann", "Female", 18)
    employee("Dean", 50000, true)
    employee("Nicole", 100000, false)
}

//User-defined functions
fun school(){
    println("eMobilis")
}

fun add(){
    var x = 3
    var y = 5
    println(x + y)
}

//Parameters/Variable and Arguements
fun student(name:String,gender:String,age:Int){
    println("$name is a $gender.$name is $age years old")

}

fun employee(name:String, salary:Int, disability:Boolean){
    println("$name is paid KSH$salary.Does $name have a disability? $disability")
}

