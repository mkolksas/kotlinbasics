import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number")
    var first = read.nextInt()

    println("Enter second number")
    var second = read.nextInt()

    println("Enter an operator (+,-,/,*)")
    var operator = read.next()

    var result = when(operator){
        "+" -> first + second
        "-" -> first - second
        "*" -> first * second
        "/" -> first / second
        else -> "Invalid operator"
    }
    println(result)




}