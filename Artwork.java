package Art_gallery;

public class Artwork {
    public String title;
    public String artist;
    public String year;
    public double price;

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
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }

    // Compare Two Artworks (by price)
    public boolean equals(Artwork other) {
        return this.price == other.price;
    }
}
