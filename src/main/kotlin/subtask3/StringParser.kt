package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val result: MutableList<String> = mutableListOf()
        var tempString: String
        var openingChar: Char
        var closingChar: Char
        var lastIndex = 0
        var countChar = 0

        for (i in inputString.indices) {
            if (inputString[i] == '[' || inputString[i] == '<' || inputString[i] == '(') {
                openingChar = inputString[i]
                closingChar = if (openingChar == '(') inputString[i] + 1 else inputString[i] + 2

                tempString = inputString.substring(i + 1)

                for (j in tempString.indices) {
                    if (tempString[j] == openingChar) {
                        countChar += 1
                    }
                }

                for (j in tempString.indices) {
                    if (tempString[j] == closingChar) {
                        countChar -= 1
                        if (countChar == 0 || countChar == -1) {
                            lastIndex = j
                            countChar = 0
                            break
                        }
                    }
                }

                result.add(tempString.substring(0, lastIndex))
            }
        }

        return result.toTypedArray()
    }
}
