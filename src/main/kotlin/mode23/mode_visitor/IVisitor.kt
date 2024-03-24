package mode23.mode_visitor

/**
 * Author: wackyboy
 * Date: 2024/3/24
 */
interface IVisitor {

    fun visit(commonEmployee: CommonEmployee)

    fun visit(manager: Manager)

}

class Visitor : IVisitor {

    override fun visit(commonEmployee: CommonEmployee) {
        println()
    }

    override fun visit(manager: Manager) {
        println()
    }

    private fun getBasicInfo(employee: Employee): String {
        return "name: ${employee.getName()}, sex: ${employee.getSex()}"
    }

    private fun getManagerInfo(manager: Manager) {

    }

    private fun getCommonEmployee(commonEmployee: CommonEmployee) {

    }

}

