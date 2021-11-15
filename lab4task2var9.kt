import kotlin.math.*

fun main() {
    val (a,b,h) = readInput9Data()
    tabulation9(a,b,h)
}

fun readInput9Data(): Triple<Double, Double, Double> {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val h = readLine()!!.toDouble()
    return Triple(a,b,h)
}

fun tabulation9(a: Double, b:Double, h:Double) {
    var i = a
    while( i <= b ){;
        var result = ln(i - 0.5)/ sqrt(i);
        println(result);
        i += h;
    }
}