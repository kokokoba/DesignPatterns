package patterns.templateMethod

class StringDisplay(str: String) : AbstractDisplay() {
    private var str: String = str
    private var width: Int = str.toByteArray().size

    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$str|")
    }

    override fun close() {
        printLine()
    }


    fun printLine() {
        print("+")
        for(i in 1..width) {
            print("-")
        }
        println("+")
    }
}