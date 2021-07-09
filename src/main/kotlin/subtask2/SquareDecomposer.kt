package subtask2


class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {

        return null
    }

    fun variants(a: Int): List<Pair<Int, Array<Int>>> = if (a == 1) listOf(1 to arrayOf(1)) else {
        val first = variants(a - 1)
        val second = a * a to arrayOf(a)
        val last = first.map { it.first + second.first to it.second + second.second}
        first + second + last
    }
}

fun main() {
//    SquareDecomposer().variants(9).forEach { println("""${it.first} - ${it.second.joinToString(" ")}""") }
    SquareDecomposer().variants(8).last { it.first == 21 }.second.forEach { println(it) }
}
