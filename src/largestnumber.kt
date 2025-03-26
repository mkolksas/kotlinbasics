//Enter three numbers and display the largest
import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number :")
    var num1 = read.nextInt()

    println("Enter second number :")
    var num2 = read.nextInt()

    println("Enter third number :")
    var num3 = read.nextInt()

    if ((num1 >= num2) && num1 >= num3){
        println("$num1 is the largest number")
    }
    else if (num2 >= num1 && num2 >= num3){
        println("$num2 is the largest number")
    }
    else{
        println("$num3 is the largest number")
    }


}