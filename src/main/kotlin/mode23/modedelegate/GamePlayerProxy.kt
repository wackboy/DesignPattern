package mode23.modedelegate

class GamePlayerProxy(
    private val gamePlayer: IGamePlayer
) : IGamePlayer {

    override fun login(user: String, password: String) {
        this.gamePlayer.login(user, password)
    }

    override fun killBoss() {
        this.gamePlayer.killBoss()
    }

    override fun upgrade() {
        this.gamePlayer.upgrade()
    }

}

fun main() {
    val player = GamePlayer("zhangsan")
    val proxy = GamePlayerProxy(player)
    proxy.login("ss", "saf")
    proxy.upgrade()
    proxy.killBoss()
}
