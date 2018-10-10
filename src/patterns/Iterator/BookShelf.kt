package patterns.Iterator


class BookShelf() : Aggregate {
    private var books = ArrayList<Book>()

    // 本棚から本を取り出す
    fun getBookAt(index: Int): Book {
        return books[index]
    }

    // 本棚に本を追加
    fun appendBook(book: Book) {
        books.add(book)
    }

    // 本棚に入っている本の個数を返す
    fun getLength(): Int {
        return this.books.size
    }

    override fun iterator(): Iterator {
       return  BookShelfIterator(this)
    }
}