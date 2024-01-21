package mode23.mode_decorate

abstract class SchoolReport {

    abstract fun report()

    abstract fun sign()

}

class FouthGradeSchoolReport : SchoolReport() {
    override fun report() {
        println("成绩单样式")
    }

    override fun sign() {
        println("家长签名")
    }

}










