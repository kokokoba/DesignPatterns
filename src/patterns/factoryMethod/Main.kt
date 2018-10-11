package patterns.factoryMethod

import patterns.factoryMethod.framework.Factory
import patterns.factoryMethod.framework.Product
import patterns.factoryMethod.idcard.IDCardFactory

fun main(args: Array<String>) {
    var factory: Factory = IDCardFactory()
    var card1: Product = factory.create("とむら")
    var card2: Product = factory.create("結城浩")
    var card3: Product = factory.create("佐藤花子")

    card1.use()
    card2.use()
    card3.use()
}