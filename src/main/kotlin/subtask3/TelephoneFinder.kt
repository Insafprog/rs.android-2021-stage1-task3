package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val result = mutableListOf<String>()
        for ((i, v) in number.withIndex()) {
            when (v) {
                '0' -> arrayOf('8')
                '1' -> arrayOf('2', '4')
                '2' -> arrayOf('1', '3', '5')
                '3' -> arrayOf('2', '6')
                '4' -> arrayOf('1', '5', '7')
                '5' -> arrayOf('2', '4', '6', '8')
                '6' -> arrayOf('3', '5', '9')
                '7' -> arrayOf('4', '8')
                '8' -> arrayOf('0', '5', '7', '9')
                '9' -> arrayOf('8', '6')
                else -> return null
            }.forEach {
                val chars = number.toCharArray()
                chars[i] = it
                result.add(chars.joinToString(""))
            }
        }
        return result.toTypedArray()
    }
}

fun main() {
    TelephoneFinder().findAllNumbersFromGivenNumber("8675309")?.forEach { println(it) }
}
