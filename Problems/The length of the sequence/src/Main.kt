import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var x = -1
    while (x != -3) {
        val y = scanner.nextInt()
        x++
        if (y == 0) {
            break
        }
    }
    println(x)
}