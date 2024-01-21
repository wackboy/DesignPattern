package mode23.modedelegate

class GamePlayerProxy(
    name: String
) : IGamePlayer {

    private var gamePlayer: IGamePlayer? = null

    init {
        gamePlayer = GamePlayer(name)
    }
    override fun login(user: String, password: String) {
        this.gamePlayer?.login(user, password)
    }

    override fun killBoss() {
        this.gamePlayer?.killBoss()
    }

    override fun upgrade() {
        this.gamePlayer?.upgrade()
    }

}

fun main() {
    val proxy = GamePlayerProxy("zhangsan")
    proxy.login("ss", "saf")
    proxy.upgrade()
    proxy.killBoss()
}
