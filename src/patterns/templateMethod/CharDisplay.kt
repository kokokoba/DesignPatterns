package patterns.templateMethod

class CharDisplay(char: String) : AbstractDisplay() {
    private var ch: String = char

    override fun open() {
        print("<<")
    }

    override fun print() {
        print(ch)
    }

    override fun close() {
        println(">>")
    }
}