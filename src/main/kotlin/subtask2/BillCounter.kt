package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = bill.sum()
        val averageBill = (sum - bill[k]) / 2

        return if (averageBill == b)
            "Bon Appetit"
        else
            (b - averageBill).toString()
    }
}
