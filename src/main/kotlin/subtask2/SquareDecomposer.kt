package subtask2

import kotlin.math.sqrt


class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        val aSqrt = number - 1
        return variant(number * number, aSqrt)
    }

    private fun variant(number: Int, a: Int): Array<Int>? {
        val b = number - a * a
        val bSqrt = sqrt(b.toDouble()).toInt()
        if (b == 0) return arrayOf(a)
        for (_a in bSqrt downTo 1) {
            if(_a == 1 && b > 1) return null
            val varB = variant(b, _a)?: continue
            return if (varB.last() < a) {
                varB + arrayOf(a)
            } else null
        }
        return null
    }
}
