package mode23.mode_delegate

interface IGamePlayer {

    fun login(user: String, password: String)

    fun killBoss()

    fun upgrade()

}

interface IProxy {
    fun count()
}

class GamePlayer(
    private val name: String
) : IGamePlayer {

    override fun login(user: String, password: String) {
        println("login user: ${this.name} login success , password: $password")
    }

    override fun killBoss() {
        println("${this.name} kill boss")
    }

    override fun upgrade() {
        println("${this.name} upgrade")
    }

}

fun main() {
    val player: IGamePlayer = GamePlayer("zhangsan")
    player.login("hah", "asid")
    player.killBoss()
    player.upgrade()
}
