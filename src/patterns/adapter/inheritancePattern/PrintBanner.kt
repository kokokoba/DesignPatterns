package patterns.adapter.inheritancePattern

class PrintBanner(msg:String) : Banner(msg) , Print {
    override fun printWeak() {
        showWithParen()
    }
    override fun printStrong() {
        showWithAster()
    }
}