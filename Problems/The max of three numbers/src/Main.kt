import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if (b > a && b > c) {
        println(b)
    } else {
        println(if (a > c) {
            a

        } else {
            c
        })
    }
}