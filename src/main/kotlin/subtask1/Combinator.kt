package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val x = array[0]
        val n = array[1]
        if(x < 0 || n <= 0) return null
        for (m in 1 until n) {
            if (binom(n, m) >= x) return m
        }
        return null
    }

    private fun factorial(n: Int): Long = if (n < 2) 1L else n * factorial(n - 1)

    private fun binom(n: Int, m: Int): Int = (factorial(n) / factorial(n-m) / factorial(m)).toInt()

}


