
import java.util.Scanner
enum class Waluta (val cuntry: String, val currency: String){
    GERMANY("Germany",	"Euro"),
    MALI("Mali","CFA franc"),
    DOMINICANA("Dominica","Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain",	"Euro"),
    AUSTRALIA("Australia",	"Australian dollar"),
    BRAZYLIA("Brazil",	"Brazilian real"),
    SENEGAL("Senegal",	"CFA franc"),
    FRANCE("France",	"Euro"),
    GRENADA("Grenada",	"Eastern Caribbean dollar"),
    KIRIBATI("Kiribati",	"Australian dollar");



}
fun isWaluta(x: String, y:String) : Boolean {
    for (enum in Waluta.values()) {
        if (x == enum.cuntry) {
            val first = enum.currency
            //println(first)
        for (enum in Waluta.values()) {
            if (y == enum.cuntry) {
                val second = enum.currency
                //println(second)
                if (first == second) {
                    return true
                    }
                }
            }
        }
    }
    return false
}
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val contry = input.next().toString()
    val contrySecond = input.next().toString()
    println(isWaluta(contry, contrySecond))
}