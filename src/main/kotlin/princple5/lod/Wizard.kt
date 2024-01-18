package princple5.lod

import java.util.Random

/**
 * 迪米特原则要求类“害羞”点，尽量不要暴露太多的public方法
 * 尽可能的使用private protected final关键字，来限制外部的访问权限
 * 类间解耦，弱耦合
 */
class Wizard {

    private val rand = Random(System.currentTimeMillis())

    private fun first(): Int {
        println("执行第一个方法")
        return rand.nextInt(100)
    }

    private fun second(): Int {
        println("执行第二个方法")
        return rand.nextInt(100)
    }

    private fun third(): Int {
        println("执行第三个方法")
        return rand.nextInt(100)
    }

    fun installWizard() {
        val a = first()
        if (a > 50) {
            val b = second()
            if (b > 50) {
                val c = third()
            }
        }
    }

}