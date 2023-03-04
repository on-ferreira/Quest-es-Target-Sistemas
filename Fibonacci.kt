fun main() {
    // Defining the number to be checked
    val num = 34

    // Defining the first two numbers of the Fibonacci sequence
    var a = 0
    var b = 1

    // Initializing a variable to indicate whether the number was found in the sequence or not
    var found = false

    // Initializing a list to store the Fibonacci sequence
    val fibSequence = mutableListOf<Int>()

    // Adding the first two numbers to the sequence list
    fibSequence.add(a)
    fibSequence.add(b)

    // While the next number in the sequence is less than or equal to the checked number,
    // update the values of a and b, add the new number to the sequence list, and check if the number
    // equals the next number in the sequence
    // If the b-value exceeds the "num" value, break it and don't add to the sequence.
    while (b <= num) {
        if (b == num) {
            found = true
            break
        }
        val temp = b
        b += a
        a = temp
        if (b > num) {
            break
        }
        fibSequence.add(b)
    }

    // Printing the Fibonacci sequence up to the checked number
    println("Fibonacci sequence up to $num :")
    println(fibSequence.joinToString(" "))

    // Checking if the number was found in the sequence and displaying the corresponding message
    if (found) {
        println("\nThe number $num belongs to the Fibonacci sequence!")
    } else {
        println("\nThe number $num does not belong to the Fibonacci sequence.")
    }
}
