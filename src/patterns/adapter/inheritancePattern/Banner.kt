package patterns.adapter.inheritancePattern

open class Banner(title: String) {
    var string: String = title

    fun showWithParen() {
        println("($string)")
    }

    fun showWithAster() {
        println("*$string*")
    }
}