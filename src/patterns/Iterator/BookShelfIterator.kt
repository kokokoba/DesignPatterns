package patterns.Iterator

class BookShelfIterator(bookShelf: BookShelf) : Iterator{

    private var bookShelf: BookShelf = bookShelf
    private var index: Int = 0

    override fun hasNext(): Boolean {
        return this.index < bookShelf.getLength()
    }

    override fun next(): Any {
        var book: Book = bookShelf.getBookAt(index)
        index++
        return book
    }
}