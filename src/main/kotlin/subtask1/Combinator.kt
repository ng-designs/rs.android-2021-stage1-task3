package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        for (i in 1..array[1]) {
            if (array[0] <= array[1].getFactorial() / ((array[1] - i).getFactorial() * i.getFactorial()))
                return i
        }
        return null
    }

    private fun Int.getFactorial(): Long {
        var value:Long = 1L
        for (i in 2..this) {
            value *= i
        }
        return value
    }
}