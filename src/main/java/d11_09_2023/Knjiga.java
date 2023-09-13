package d11_09_2023;

public class Knjiga {
    private int isbn;
    private String title;
    private int releaseYear;
    private Autor author;
    public Knjiga (String title, Autor author){
        this.title=title;
        this.author=author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Autor getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public void printBook(){
        System.out.println(this.isbn);
        System.out.println(this.title + " - " + this.releaseYear);
        System.out.print("Autor: "); this.getAuthor().printFullName();

    }
}
