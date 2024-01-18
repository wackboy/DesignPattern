package princple5.lod

class Client {
}

fun main() {
    val teacher = Teacher()
    val girls = ArrayList<Girl>()
    repeat(20) {
        girls.add(Girl())
    }
    val groupLeader = GroupLeader(girls)
    teacher.command(groupLeader)

    val software = InstallSoftware()
    val wizard = Wizard()
    software.installWizard(wizard)

}