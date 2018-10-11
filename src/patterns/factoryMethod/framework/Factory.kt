package patterns.factoryMethod.framework

abstract  class Factory {
    protected abstract fun createProduct(owner: String): Product
    protected abstract fun registerProduct(product: Product)

    final fun create(owner: String): Product {
        var p: Product = createProduct(owner)
        registerProduct(p)
        return p
    }
}