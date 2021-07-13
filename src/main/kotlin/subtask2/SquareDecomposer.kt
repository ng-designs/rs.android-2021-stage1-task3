package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return getSquares(number)
    }

    private fun getSquares(number: Int, numSqr: Long = Sqr(number.toLong())): Array<Int>? {
        var resArray:Array<Int>? = arrayOf()
        var remain: Long
        for (i in number - 1 downTo 1) {
            if (Sqr(i.toLong()) == numSqr && resArray != null) {
                resArray += i
                return resArray
            }

            remain = numSqr - Sqr(i.toLong())
            if (remain > 0) {
                resArray = getSquares(i, remain)
                if (resArray != null) {
                    resArray += i
                    return resArray
                }
            }
        }
        return null
    }

    private fun Sqr(toSqr: Long): Long {
        return toSqr * toSqr
    }
}
