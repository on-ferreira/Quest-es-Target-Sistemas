fun main() {
    val str = "Hello World!"
    val reversedStr = str.Reverse()
    println(reversedStr)
}

fun String.Reverse(): String {
    var reversed = ""
    for (i in this.length - 1 downTo 0) {
        reversed += this[i]
    }
    return reversed
}
