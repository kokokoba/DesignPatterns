package patterns.factoryMethod.idcard

import patterns.factoryMethod.framework.Factory
import patterns.factoryMethod.framework.Product

class IDCardFactory: Factory() {
    private var owners = HashMap<Int, String>()
    private var num: Int = 0

    protected override fun createProduct(owner: String): Product {
        num++
        return IDCard(owner, num)
    }

    override fun registerProduct(product: Product) {
        product as IDCard
        owners.put(product.getNuber(), product.getOwner())
    }

    fun getOwner(): HashMap<Int, String> {
        return owners
    }
}