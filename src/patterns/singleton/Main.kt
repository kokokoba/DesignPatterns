package patterns.singleton

fun main(args: Array<String>) {
    println("start")
    val obj1: Singleton = Singleton.getInstance()
    val obj2: Singleton = Singleton.getInstance()
    if(obj1 == obj2) {
        println("obj1とobj2は同じインスタンスです")
    } else {
        println("obj1とobj2は同じインスタンスではありません")
    }
    println("end")
}