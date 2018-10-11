package patterns.factoryMethod.idcard

import patterns.factoryMethod.framework.Product

class IDCard(owner: String, number: Int): Product() {
    private var own: String = owner
    private var num: Int = number

    init {
        println("$own($num)のカードを作ります。")
    }

    override fun use() {
        println("$own($num)のカードを使います。")
    }

    fun getOwner(): String {
        return own
    }

    fun getNuber(): Int {
        return num
    }
}