package mode23.mode_decorate

/**
 * 装饰类将动作的执行委托给需要装饰的对象
 */
abstract class Decorator(
    private val sr: SchoolReport
) : SchoolReport() {

    override fun report() {
        this.sr.report()
    }

    override fun sign() {
        this.sr.sign()
    }
}

class HighScoreDecorator(
    private val str: SchoolReport
) : Decorator(str) {


    private fun reportHighScore() {
        println("most high score 75")
    }

    override fun report() {
        this.reportHighScore()
        super.report()
    }

}

class SortDecorator(
    private val str: SchoolReport
) : Decorator(str) {


    private fun reportSort() {
        println("sort 38")
    }

    override fun report() {
        super.report()
        this.reportSort()
    }

}

fun main() {
    var sr: SchoolReport = FouthGradeSchoolReport()
    sr = HighScoreDecorator(sr)
    sr = SortDecorator(sr)
    sr.report()
    sr.sign()
}












