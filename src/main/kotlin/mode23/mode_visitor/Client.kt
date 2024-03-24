package mode23.mode_visitor

/**
 * Author: wackyboy
 * Date: 2024/3/24
 */
class Client {



}

fun main() {
    for (emp in mockEmployee()) {
        emp.report()
    }
}

fun mockEmployee(): List<Employee> {
    val employees = ArrayList<Employee>()
    val zhangsan = CommonEmployee()
    zhangsan.setJob("java coder")
    zhangsan.setName("zhangsan")
    zhangsan.setSex(Employee.MALE)
    employees.add(zhangsan)
    val lisi = CommonEmployee()
    lisi.setJob("meigong")
    lisi.setName("lisi")
    lisi.setSex(Employee.FEMALE)
    employees.add(lisi)
    val wangwu = Manager()
    wangwu.setName("wangwu")
    wangwu.setPerformance("fuzhi, paimapi")
    wangwu.setSalary(18750)
    wangwu.setSex(Employee.MALE)
    employees.add(wangwu)
    return employees
}