package princple5.dip

interface ICar {
    fun run()
}

class Driver {
    fun drive(car: ICar) {
        car.run()
    }
}

class Benz: ICar {
    override fun run() {
        println("奔驰起飞了！")
    }
}

class BMW : ICar {
    override fun run() {
        println("BWM起飞了！")
    }
}

fun main() {
    val zhangSan = Driver()
    // 这种写法，屏蔽外部对于具体实现类的访问，依赖倒置
    // 变量的表面类型尽量是接口或者抽象类，避免外部直接访问到实现
    val benz: ICar = Benz()
    benz.run()
    zhangSan.drive(Benz())
    zhangSan.drive(BMW())
}