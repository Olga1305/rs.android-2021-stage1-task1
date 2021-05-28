package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var list = sadArray.toList()
        var sad = true
        while (sad) {
            val size = list.size
            list = list.filterIndexed { index, it ->
                index == 0 || index == list.size - 1 || it < list[index - 1] + list[index + 1]
            }
            sad = size != list.size
        }
        return list.toIntArray()
    }
}
