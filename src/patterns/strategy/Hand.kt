package patterns.strategy

class Hand {
    companion object {
        const val HANDVALUE_GUU: Int = 0
        const val HANDVALUE_CHO: Int = 1
        const val HANDVALUE_PAA: Int = 2
//        const val hand: Array<Hand> = arrayOf(Hand(HANDVALUE_GUU), Hand(HANDVALUE_CHO), Hand(HANDVALUE_PAA))
        private val name: Array<String> = arrayOf("グー", "チョキ", "パー")
    }

    private var handvalue: Int = 0

    fun Hand(handValue: Int) {
        this.handvalue = handvalue
    }


}