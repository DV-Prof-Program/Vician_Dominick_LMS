/**
 * Dominick Vician, CEN-3024C-16046, August 31st, 2023
 * Book Class
 * This class contains the three fields, id, title, and author, that compose a single book.
 * This can be used to create an interactive list of all books.
**/
public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        setId(id);
        setTitle(title);
        setAuthor(author);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Method: toString
     * Parameters: None
     * Return Type: String
     * This method returns the three fields of the class organized as 'id, title, author'
    **/
    @Override
    public String toString() {
        return getId() + ", " + getTitle() + ", " + getAuthor();
    }
}
