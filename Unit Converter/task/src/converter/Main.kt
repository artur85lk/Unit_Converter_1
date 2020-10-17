package converter

fun wordFirst(x:Double, y:String):String {              //funkcja dla odpowiedzi liczba pierwsza

    val first = x
    var jednostka = "pp"
    if (first == 1.0) {           // sprawdza czy wynik jest pojedyńczy czy mnogi
        when {
            y == "kg" || y == "kilogram" || y == "kilograms" -> jednostka = "kilogram" // dopisać warunki (wynik pojedycz, mnogi i jednostka)
            y == "g" || y == "gram" || y == "grams" -> jednostka = "gram"
            y == "mg" || y == "milligram" || y == "milligrams" -> jednostka = "milligram"
            y == "lb" || y == "pound" || y == "pounds" -> jednostka = "pound"
            y == "oz" || y == "ounce" || y == "ounces" -> jednostka = "ounce"
            y == "m" || y == "meter" || y == "meters" -> jednostka = "meter"
            y == "km" || y == "kilometer" || y == "kilometers" -> jednostka = "kilometer"
            y == "cm" || y == "centimeter" || y == "centimeters" -> jednostka = "centimeter"
            y == "mm" || y == "millimeter" || y == "millimeters" -> jednostka = "millimeter"
            y == "mi" || y == "mile" || y == "miles" -> jednostka = "mile"
            y == "yd" || y == "yard" || y == "yards" -> jednostka = "yard"
            y == "ft" || y == "foot" || y == "feet" -> jednostka = "foot"
            y == "in" || y == "inch" || y == "inches" -> jednostka = "inch"
            y == "c" || y == "dc" || y == "celsius" || y == "degrees celsius" || y == "degree celsius" -> jednostka = "degree Celsius"
            y == "f" || y == "df" || y == "fahrenheit" || y == "degrees fahrenheit" || y == "degree fahrenheit" -> jednostka = "degree Fahrenheit"
            y == "k" || y == "kelvins" || y == "kelvin" -> jednostka = "kelvin"
        }
    } else {
        when {
            y == "kg" || y == "kilogram" || y == "kilograms" -> jednostka = "kilograms" // dopisać warunki (wynik pojedycz, mnogi i jednostka)
            y == "g" || y == "gram" || y == "grams" -> jednostka = "grams"
            y == "mg" || y == "milligram" || y == "milligrams" -> jednostka = "milligrams"
            y == "lb" || y == "pound" || y == "pounds" -> jednostka = "pounds"
            y == "oz" || y == "ounce" || y == "ounces" -> jednostka = "ounces"
            y == "m" || y == "meter" || y == "meters" -> jednostka = "meters"
            y == "km" || y == "kilometer" || y == "kilometers" -> jednostka = "kilometers"
            y == "cm" || y == "centimeter" || y == "centimeters" -> jednostka = "centimeters"
            y == "mm" || y == "millimeter" || y == "millimeters" -> jednostka = "millimeters"
            y == "mi" || y == "mile" || y == "miles" -> jednostka = "miles"
            y == "yd" || y == "yard" || y == "yards" -> jednostka = "yards"
            y == "ft" || y == "foot" || y == "feet" -> jednostka = "feet"
            y == "in" || y == "inch" || y == "inches" -> jednostka = "inches"
            y == "c" || y == "dc" || y == "celsius" || y == "degrees celsius" || y == "degree celsius" -> jednostka = "degrees Celsius"
            y == "f" || y == "df" || y == "fahrenheit" || y == "degrees fahrenheit" || y == "degree fahrenheit" -> jednostka = "degrees Fahrenheit"
            y == "k" || y == "kelvins" || y == "kelvin" -> jednostka = "kelvins"
        }
    }
    return jednostka
}
fun wordLast(y: String, b: Double):String {    // sprawdza czy wynik jest pojedyńczy czy mnogi
    val liczba = y
    //val first = y
    var jednostka = "pp"
    if (b == 1.0) {
        when {
            y == "kg" || y == "kilogram" || y == "kilograms" -> jednostka = "kilogram" // dopisać warunki (wynik pojedycz, mnogi i jednostka)
            y == "g" || y == "gram" || y == "grams" -> jednostka = "gram"
            y == "mg" || y == "milligram" || y == "milligrams" -> jednostka = "milligram"
            y == "lb" || y == "pound" || y == "pounds" -> jednostka = "pound"
            y == "oz" || y == "ounce" || y == "ounces" -> jednostka = "ounce"
            y == "m" || y == "meter" || y == "meters" -> jednostka = "meter"
            y == "km" || y == "kilometer" || y == "kilometers" -> jednostka = "kilometer"
            y == "cm" || y == "centimeter" || y == "centimeters" -> jednostka = "centimeter"
            y == "mm" || y == "millimeter" || y == "millimeters" -> jednostka = "millimeter"
            y == "mi" || y == "mile" || y == "miles" -> jednostka = "mile"
            y == "yd" || y == "yard" || y == "yards" -> jednostka = "yard"
            y == "ft" || y == "foot" || y == "feet" -> jednostka = "foot"
            y == "in" || y == "inch" || y == "inches" -> jednostka = "inch"
            y == "c" || y == "dc" || y == "celsius" || y == "degrees celsius" || y == "degree celsius" -> jednostka = "degree Celsius"
            y == "f" || y == "df" || y == "fahrenheit" || y == "degrees fahrenheit" || y == "degree fahrenheit" -> jednostka = "degree Fahrenheit"
            y == "k" || y == "kelvins" || y == "kelvin" -> jednostka = "kelvin"
        }
    } else {
        when {
            y == "kg" || y == "kilogram" || y == "kilograms" -> jednostka = "kilograms" // dopisać warunki (wynik pojedycz, mnogi i jednostka)
            y == "g" || y == "gram" || y == "grams" -> jednostka = "grams"
            y == "mg" || y == "milligram" || y == "milligrams" -> jednostka = "milligrams"
            y == "lb" || y == "pound" || y == "pounds" -> jednostka = "pounds"
            y == "oz" || y == "ounce" || y == "ounces" -> jednostka = "ounces"
            y == "m" || y == "meter" || y == "meters" -> jednostka = "meters"
            y == "km" || y == "kilometer" || y == "kilometers" -> jednostka = "kilometers"
            y == "cm" || y == "centimeter" || y == "centimeters" -> jednostka = "centimeters"
            y == "mm" || y == "millimeter" || y == "millimeters" -> jednostka = "millimeters"
            y == "mi" || y == "mile" || y == "miles" -> jednostka = "miles"
            y == "yd" || y == "yard" || y == "yards" -> jednostka = "yards"
            y == "ft" || y == "foot" || y == "feet" -> jednostka = "feet"
            y == "in" || y == "inch" || y == "inches" -> jednostka = "inches"
            y == "c" || y == "dc" || y == "celsius" || y == "degrees celsius" || y == "degree celsius" -> jednostka = "degrees Celsius"
            y == "f" || y == "df" || y == "fahrenheit" || y == "degrees fahrenheit" || y == "degree fahrenheit" -> jednostka = "degrees Fahrenheit"
            y == "k" || y == "kelvins" || y == "kelvin" -> jednostka = "kelvins"
        }
    }
    return jednostka
}
fun main() {
    while (true) {
        print("Enter what you want to convert (or exit): ")
        var wprowadzenie = readLine()!!.toLowerCase()
        if (wprowadzenie == "exit") break
        var liczba = ""
        var licznik = 0   // sygnalizuje error
        var liczbaD: Double = 0.0
        //var liczbaI: Int
        var wordsList: List<String> = wprowadzenie.split(" ") //podział wprowadzenia na części
        //println(wordsList[0])




        var jednostka = ""
        val wordtoDouble = try { wordsList[0].toDouble() } catch (e: NumberFormatException) { 1.1 }

        for (i in wprowadzenie) {
            when (i) {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.' -> liczba += i.toString()
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'w', 'y', 'z' -> jednostka += i.toString()
            }
        }
        for (j in liczba) {                            //sprawdza i konwertuje do Double
            if (j == '.') {
                liczbaD = liczba.toDouble()
            } else {
                liczbaD = liczba.toDouble()
            }
        }
        // zabezpieczenie w od padku np. degree celsius
        var pierwszaPodanaJednostka = wordsList[1]
        var drugaPodanaJednostka = wordsList[3]


        if (wordsList[2]  != "to" && wordsList[3] != "to" && wordsList[2] != "in" && wordsList[3] != "in" && wordsList[2] != "convertTo" && wordsList[3] != "convertTo" || wordtoDouble == 1.1) {
            licznik = 1
        }
        if (wordsList[2] != "to" && wordsList[2] != "in") {
            pierwszaPodanaJednostka = "${wordsList[1]} ${wordsList[2]}"
            if (wordsList.lastIndex == 5) {
                drugaPodanaJednostka = "${wordsList[4]} ${wordsList[5]}"
            } else if (wordsList.lastIndex == 4 && wordsList[3] == "to" || wordsList.lastIndex == 4 && wordsList[3] == "in") {
                pierwszaPodanaJednostka = "${wordsList[1]} ${wordsList[2]}"
                drugaPodanaJednostka = "${wordsList[4]}"
            }
        }
        if (wordsList.lastIndex == 4 && wordsList[2] == "to" || wordsList.lastIndex == 4 && wordsList[2] == "in") {
            drugaPodanaJednostka = "${wordsList[3]} ${wordsList[4]}"
        }

        var firstNumber = 0.0
        var wynik = 0.0
        var wordFirst = wordFirst(wordtoDouble, pierwszaPodanaJednostka)

        if (isJednostka(pierwszaPodanaJednostka, drugaPodanaJednostka, licznik, wordtoDouble) == 1) {
//            if (wordtoDouble < -1)
            when (pierwszaPodanaJednostka) {                 // drugie słowo        doprowadzenie do jednakowej jednostki
                "g", "gram", "grams" -> firstNumber = wordtoDouble
                "kg", "kilogram", "kilograms" -> firstNumber = wordtoDouble * 1000
                "mg", "milligram", "milligrams" -> firstNumber = wordtoDouble * 0.001
                "lb", "pound", "pounds" -> firstNumber = wordtoDouble * 453.592
                "oz", "ounce", "ounces" -> firstNumber = wordtoDouble * 28.3495

                "m", "meter", "meters" -> firstNumber = wordtoDouble * 1
                "km", "kilometer", "kilometers" -> firstNumber = wordtoDouble * 1000
                "cm", "centimeter", "centimeters" -> firstNumber = wordtoDouble * 0.01
                "mm", "millimeter", "millimeters" -> firstNumber = wordtoDouble * 0.001
                "mi", "mile", "miles" -> firstNumber = wordtoDouble * 1609.35
                "yd", "yard", "yards" -> firstNumber = wordtoDouble * 0.9144
                "ft", "foot", "feet" -> firstNumber = wordtoDouble * 0.3048
                "in", "inch", "inches" -> firstNumber = wordtoDouble * 0.0254

                "degree celsius", "degrees celsius", "celsius", "dc", "c" -> firstNumber = wordtoDouble
                "degree fahrenheit", "degrees fahrenheit", "fahrenheit", "df", "f" -> firstNumber = (wordtoDouble - 32) * 5 / 9
                "kelvin", "kelvins", "k" -> firstNumber = wordtoDouble - 273.15

            }
            when (drugaPodanaJednostka) {        // w czym chce wynik
                "g", "gram", "grams" -> wynik = firstNumber
                "kg", "kilogram", "kilograms" -> wynik = firstNumber / 1000
                "mg", "milligram", "milligrams" -> wynik = firstNumber / 0.001
                "lb", "pound", "pounds"-> wynik = firstNumber / 453.592
                "oz", "ounce", "ounces" -> wynik = firstNumber / 28.3495

                "m", "meter", "meters" -> wynik = firstNumber / 1
                "km", "kilometer", "kilometers" -> wynik = firstNumber / 1000
                "cm", "centimeter", "centimeters" -> wynik = firstNumber / 0.01
                "mm", "millimeter", "millimeters" -> wynik = firstNumber / 0.001
                "mi", "mile", "miles" -> wynik = firstNumber / 1609.35
                "yd", "yard", "yards" -> wynik = firstNumber / 0.9144
                "ft", "foot", "feet" -> wynik = firstNumber / 0.3048
                "in", "inch", "inches" -> wynik = firstNumber / 0.0254

                "degree celsius", "degrees celsius", "celsius", "dc", "c" -> wynik = firstNumber
                "degree fahrenheit", "degrees fahrenheit", "fahrenheit", "df", "f" -> wynik = firstNumber * 9 / 5 + 32
                "kelvin", "kelvins", "k" -> wynik = firstNumber + 273.15
            }
            var wordLast = wordLast(drugaPodanaJednostka, wynik)
            println("$wordtoDouble $wordFirst is $wynik $wordLast")                      // odpowiedz
        } else if (isJednostka(pierwszaPodanaJednostka, drugaPodanaJednostka, licznik, wordtoDouble) == 2){
            var wordLast = wordLast(drugaPodanaJednostka, firstNumber)
            wordFirst = wordFirst(2.1, pierwszaPodanaJednostka)
            println("Conversion from $wordFirst  to $wordLast is impossible") // zmienić
        } else if (isJednostka(pierwszaPodanaJednostka, drugaPodanaJednostka, licznik, wordtoDouble) == 3){
            var wordLast = wordLast(drugaPodanaJednostka, firstNumber)
            println("Conversion from ??? to $wordLast is impossible")
        } else if (isJednostka(pierwszaPodanaJednostka, drugaPodanaJednostka, licznik, wordtoDouble) == 4){
            println("Conversion from $wordFirst to ??? is impossible")
        } else if (isJednostka(pierwszaPodanaJednostka, drugaPodanaJednostka, licznik, wordtoDouble) == 5){
        println("Parse error")
        } else if (isJednostka(pierwszaPodanaJednostka, drugaPodanaJednostka, licznik, wordtoDouble) == 6){
            println("Conversion from ??? to ??? is impossible")
        } else if (isJednostka(pierwszaPodanaJednostka, drugaPodanaJednostka, licznik, wordtoDouble) == 7){
            println("Length shouldn't be negative.")
        } else if (isJednostka(pierwszaPodanaJednostka, drugaPodanaJednostka, licznik, wordtoDouble) == 8){
            println("Weight shouldn't be negative.")
        }
    }
}
enum class Weight (val jednostka: String, val rodzaj: String){
    G("g", "waga"),
    GRAM("gram", "waga"),
    GRAMS("grams", "waga"),
    KG("kg", "waga"),
    KILOGRAM("kilogram", "waga"),
    KILOGRAMS("kilograms", "waga"),
    MG("mg","waga"),
    MILLIGRAM("milligram", "waga"),
    MILLIGRAMS("milligrams", "waga"),
    LB("lb", "waga"),
    POUND("pound", "waga"),
    POUNDS("pounds", "waga"),
    OZ("oz", "waga"),
    OUNCE("ounce", "waga"),
    OUNCES("ounces", "waga"),
    M("m", "o"),
    METER("meter", "o"),
    METERS("meters", "o"),
    KM("km", "o"),
    KILOMETER("kilometer", "o"),
    KILOMETERS("kilometers", "o"),
    CM("cm", "o"),
    CENTIMETER("centimeter", "o"),
    CENTIMETERS("centimeters", "o"),
    MM("mm", "o"),
    MILLIMETER("millimeter", "o"),
    MILLIMETERS("millimeters", "o"),
    MI("mi", "o"),
    MILE("mile", "o"),
    MILES("miles", "o"),
    YD("yd", "o"),
    YARD("yard", "o"),
    YARDS("yards", "o"),
    FT("ft", "o"),
    FOOT("foot", "o"),
    FEET("feet", "o"),
    IN("in", "o"),
    INCH("inch", "o"),
    INCHES("inches", "o"),
    DEGREE_CELSIUS("degree celsius", "t"),
    DEGREES_CELSIUS("degrees celsius", "t"),
    CELSIUS("celsius", "t"),
    DC("dc", "t"),
    C("c", "t"),
    DEGREE_FAHRENHEIT("degree fahrenheit", "t"),
    DEGREES_FAHRENHEIT("degrees fahrenheit", "t"),
    FAHRENHEIT("fahrenheit", "t"),
    DF("df", "t"),
    F("f", "t"),
    KELVIN("kelvin", "t"),
    KELVINS("kelvins", "t"),
    K("k", "t")
}
fun isJednostka(x: String, y:String, z:Int, w:Double) : Int {
    var canter = 0
    var canter2 = 0
    if (z == 2){     // zmieniłem na 2 do testów
        return 5
    }
    for (enum in Weight.values()) {    // czy spełnia warunek
        if (x == enum.jednostka) {
            val first = enum.rodzaj
            for (enum in Weight.values()) {
                if (y == enum.jednostka) {
                    val second = enum.rodzaj
                    if (first == second && first == "o" && w < 0) {
                        return 7
                    } else if (first == second && first == "waga" && w < 0) {
                        return 8
                    } else if (first == second) {
                        return 1
                    }
                }
            }
        }
    }
    for (enum in Weight.values()) {
        if (x == enum.jednostka) {
            canter++
        }
    }
    for (enum in Weight.values()) {
        if (y == enum.jednostka) {
            canter2++
        }
    }
    if (canter == 0 && canter2 == 0) {
        return 6
    }
    else if (canter == 0) {
        return 3
    }
    else if (canter2 == 0) {
        return 4
    }
    return 2
}

