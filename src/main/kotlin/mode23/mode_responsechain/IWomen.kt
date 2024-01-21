package mode23.mode_responsechain

interface IWomen {

    fun getType(): Int

    fun getRequest(): String

}

class Women: IWomen {

    private var type = 0
    private var request = ""

    constructor()
    constructor(type: Int, request: String) {
        this.type = type
        when (this.type) {
            1 -> {
                this.request = "女儿的请求是：$request"
            }
            2 -> {
                this.request = "妻子的请求是：$request"
            }
            3 -> {
                this.request = "母亲的请求是：$request"
            }
        }
    }
    override fun getType(): Int {
        return this.type
    }

    override fun getRequest(): String {
        return this.request
    }

}
















