package patterns.singleton

object Singleton {
    init {
        println("インスタンスを作成しました")
    }

    fun getInstance(): Singleton {
        return Singleton
    }
}