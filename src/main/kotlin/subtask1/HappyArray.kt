package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var mutableSadArray = sadArray.toMutableList()
        var i = 1

        while (i < mutableSadArray.size - 1) {
            if (mutableSadArray[i] > (mutableSadArray[i - 1] + mutableSadArray[i + 1])) {
                mutableSadArray.removeAt(i)

                if (i > 1) i--
            } else i++
        }

        return mutableSadArray.toIntArray()
    }
}
