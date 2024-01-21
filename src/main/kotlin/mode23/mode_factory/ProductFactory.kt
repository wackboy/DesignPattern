package mode23.mode_factory

class ProductFactory {

    private val prMap = HashMap<String, Product>()

    @Synchronized
    fun createProduct(type: String): Product {
        val product: Product
        if (prMap.containsKey(type)) {
            product = prMap[type]!!
        } else {
            product = if (type == "Product1") {
                ConcreteProduct1()
            } else {
                ConcreteProduct2()
            }
            prMap[type] = product
        }
        return product
    }

}