package Art_gallery;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("<Leonardo da Vinci>", "15 April 1452");
        Artist artist2 = new Artist("<Vincent van Gogh>", "30 March 1853");

        Artwork artwork1 = new Artwork("Mona Lisa", artist1.getName(), "1503", 8500000);
        Artwork artwork2 = new Artwork("Starry Night", artist2.getName(), "1889", 9500000);
        Artwork artwork3 = new Artwork("The Last Supper", artist2.getName(), "1498", 8500000);

        ArtGallery gallery = new ArtGallery ("Louvre Museum", "Paris");
        // Add artworks to Gallery
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);
        gallery.addArtwork(artwork3);

        gallery.galleryDetails();

        // Print Artworks
        System.out.println("\nArtworks:");
        for (Artwork artwork : gallery.getArtworks()) {
            artwork.artworkDetails();
        }

        // Filter Artworks by price
        System.out.println("\nArtworks priced between $8,000,000 and $9,000,000:");
        List<Artwork> filteredArtworks = gallery.FilterByPrice(8000000, 9000000);
        for (Artwork artwork : filteredArtworks) {
            artwork.artworkDetails();
        }

        // Search Artwork by Title
        System.out.println("\nSearching for 'Mona Lisa':");
        Artwork foundArtwork = gallery.searchByTitle("Mona Lisa");
        if (foundArtwork != null) {
            foundArtwork.artworkDetails();
        } else {
            System.out.println("Artwork not found.");
        }

        // Sort Artworks by Price
        System.out.println("\nArtworks sorted by price:");
        gallery.sortByPrice();
        for (Artwork artwork : gallery.getArtworks()) {
            artwork.artworkDetails();
        }

        // Compare Artworks
        System.out.println("\nComparing Artworks:");
        if (artwork1.equals(artwork3)) {
            System.out.println(artwork1.getTitle() + " and " + artwork3.getTitle() + " have the same price.");
        } else {
            System.out.println(artwork1.getTitle() + " and " + artwork3.getTitle() + " have different prices.");
        }

        if (artwork1.equals(artwork2)) {
            System.out.println(artwork1.getTitle() + " and " + artwork2.getTitle() + " have the same price.");
        } else {
            System.out.println(artwork1.getTitle() + " and " + artwork2.getTitle() + " have different prices.");
        }
    }
}
