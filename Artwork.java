package Art_gallery;
import java.util.Objects;

public class Artwork {
    private String title;
    private String artist;
    private String year;
    private double price;

    // Constructor
    public Artwork(String title, String artist, String year, double price) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.price = price;
    }

    // Getter, Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Artwork Details
    public void artworkDetails() {
        System.out.println(this);
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artwork artwork = (Artwork) obj;
        return Double.compare(artwork.price, price) == 0 && title.equals(artwork.title) && year.equals(artwork.year);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(title, year, price);
    }
}

