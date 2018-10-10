package patterns.adapter.transferPattern

fun main(args: Array<String>) {
    var p: Print = PrintBanner("Hello")
    p.printWeak()
    p.printStrong()
}