package princple5.lod

class Teacher {

    fun command(groupLeader: GroupLeader) {
//        val girls = ArrayList<Girl>()
        // 不符合迪米特原则
//        repeat(20) {
//            girls.add(Girl())
//        }
        groupLeader.countGirls()
    }

}

class GroupLeader(
    private val girls: List<Girl>
) {
    fun countGirls() {
        println("女生的数量是: ${girls.size}" )
    }
}

class Girl {}
