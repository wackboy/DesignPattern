package mode23.mode_visitor

abstract class Employee {

    companion object {
        const val MALE = 0
        const val FEMALE = 1
    }

    private var name: String? = null
    private var salary: Int = 0
    private var sex: Int = 0

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name

    fun setSalary(salary: Int) {
        this.salary = salary
    }

    fun getSalary() = salary

    fun setSex(sex: Int) {
        this.sex = sex
    }

    fun getSex() = sex

    fun report() {
        println("name: $name, sex: $sex, salary: $salary, otherInfo: ${getOtherInfo()}")
    }

    abstract fun getOtherInfo(): String

    abstract fun accept(visitor: IVisitor)

}