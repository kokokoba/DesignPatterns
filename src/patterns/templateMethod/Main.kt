package patterns.templateMethod

fun main(args: Array<String>) {
    var chDisPlay: AbstractDisplay = CharDisplay("H")
    var strDisplay: AbstractDisplay = StringDisplay("Hello, world.")
    var jsDisplay: AbstractDisplay = StringDisplay("こんにちは。")

    chDisPlay.display()
    strDisplay.display()
    jsDisplay.display()
}