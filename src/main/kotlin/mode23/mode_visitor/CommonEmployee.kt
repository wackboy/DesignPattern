package mode23.mode_visitor

/**
 * Author: wackyboy
 * Date: 2024/3/24
 */
class CommonEmployee : Employee() {

    private var job: String = ""

    fun getJob(): String = job

    fun setJob(job: String) {
        this.job = job
    }

    override fun getOtherInfo(): String {
        return "work: $job, \t"
    }

    override fun accept(visitor: IVisitor) {
        visitor.visit(this)
    }
}

class Manager : Employee() {

    private var performance: String = ""

    fun getPerformance() = performance

    fun setPerformance(performance: String) {
        this.performance = performance
    }

    override fun getOtherInfo(): String {
        return "performance: $performance, \t"
    }

    override fun accept(visitor: IVisitor) {
        visitor.visit(this)
    }


}
