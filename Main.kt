import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to the Basic Calculator")
    println("Please select an operation:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")
    println("5. Exit")

    while (true) {
        print("Enter your choice (1-5): ")
        val choice = scanner.nextInt()

        if (choice == 5) {
            println("Exiting the calculator. Goodbye!")
            break
        }

        if (choice !in 1..4) {
            println("Invalid choice. Please try again.")
            continue
        }

        print("Enter the first number: ")
        val num1 = scanner.nextDouble()
        print("Enter the second number: ")
        val num2 = scanner.nextDouble()

        val result = when (choice) {
            1 -> num1 + num2
            2 -> num1 - num2
            3 -> num1 * num2
            4 -> {
                if (num2 == 0.0) {
                    println("Error: Division by zero is not allowed.")
                    continue
                } else {
                    num1 / num2
                }
            }
            else -> 0.0
        }

        println("The result is: $result")
    }
}
