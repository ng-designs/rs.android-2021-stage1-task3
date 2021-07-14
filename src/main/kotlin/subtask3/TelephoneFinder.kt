package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val result = mutableListOf<String>()

        for (i in number.indices){

            val keyList = number[i].toString().toIntOrNull()?.getKeyNeighbors() ?: return null

            for (key in keyList){

                val combo = number.substring(0, i) + key + number.substring(i + 1)

                result.add(combo)
            }
        }
        return result.toTypedArray()
    }

    private fun Int.getKeyNeighbors() : List<String>? {

        var neighbors:List<String>? = listOf()

        neighbors = when (this) {
            1 -> listOf("2","4")
            2 -> listOf("1","3","5")
            3 -> listOf("2","6")
            4 -> listOf("1","5","7")
            5 -> listOf("2","4","6","8")
            6 -> listOf("3","5","9")
            7 -> listOf("4","8")
            8 -> listOf("0","5","7","9")
            9 -> listOf("6","8")
            0 -> listOf("8")
            else -> null
        }

        return neighbors
    }

}