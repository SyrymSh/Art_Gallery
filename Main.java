package Art_gallery;

public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("<Leonardo da Vinci>", "Italian");
        Artist artist2 = new Artist("<Vincent van Gogh>", "Dutch");

        Artwork artwork1 = new Artwork("Mona Lisa", artist1.getName(), "1503", 8500000);
        Artwork artwork2 = new Artwork("Starry Night", artist2.getName(), "1889", 9500000);
        Artwork artwork3 = new Artwork("The Last Supper", artist2.getName(), "1498", 8500000);

        ArtGallery gallery = new ArtGallery ("Louvre Museum", "Paris");

        gallery.galleryDetails();

        System.out.println("\nArtworks:");
        artwork1.artworkDetails();
        artwork2.artworkDetails();
        artwork3.artworkDetails();

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
