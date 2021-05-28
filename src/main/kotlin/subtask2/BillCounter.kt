package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairlyBill = bill.toMutableList().apply {removeAt(k)}.sum()/2
        return if (fairlyBill == b)
        {
            "Bon Appetit"
        } else {
            "${b -fairlyBill}"
        }
    }
}
