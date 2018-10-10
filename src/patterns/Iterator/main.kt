package patterns.Iterator

fun main(args: Array<String>) {
    var bookShelf: BookShelf = BookShelf()
    bookShelf.appendBook(Book("Around the World is 80 Days."))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cinderella"))
    bookShelf.appendBook(Book("Daddy-Long-Lengs"))

    var it: Iterator = bookShelf.iterator()
    while(it.hasNext()) {
        var book: Book = it.next() as Book
        println(book.getName())
    }
}