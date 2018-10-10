package patterns.iterator

class Book(title: String) {
    private var name: String = title

    fun getName(): String {
        return this.name
    }

}