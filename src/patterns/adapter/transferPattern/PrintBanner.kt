package patterns.adapter.transferPattern

class PrintBanner(msg: String) : Print{
    var banner: Banner = Banner(msg)

    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }

}