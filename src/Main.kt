class MultiplicationTable {
    fun multiplication(base: Int, multiplier: Int): String {
        return "$base x $multiplier = ${base * multiplier}"
    }

    // Public method to generate the table
    fun generateTable(base: Int) {
        for (i in 1..10) {
            println("$base x $i = ${base * i}")
        }
    }
}

fun main() {
    var table = MultiplicationTable()
    var base = 2
    println("Multiplication Table for $base:")
    table.generateTable(base)
}