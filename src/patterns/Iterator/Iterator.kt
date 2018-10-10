package patterns.Iterator

interface Iterator {
    // 次の要素が存在するか、真偽値を返す
    fun hasNext(): Boolean
    // 次の要素を返す
    fun next(): Any
}