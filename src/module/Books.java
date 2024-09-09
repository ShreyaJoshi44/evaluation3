package module;

public class Books {
    String book_name, author, description;
    Genre genre;
    Float price;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Books(String book_name, String author, Genre genre, Float price) {
        this.book_name = book_name;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public void getBookDetails() {
        System.out.println("name of book: " + this.book_name + " written by author: " + this.author);
        System.out.println("genre of book: " + this.genre.getName() + " Description of book is " + this.description);
        System.out.println("price of book: " + this.price + " rs");
    }
}




