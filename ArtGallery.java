package Art_gallery;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArtGallery {
    private String galleryName;
    private String galleryAddress;
    private List<Artwork> artworks;

    // Constructor
    public ArtGallery(String galleryName, String galleryAddress) {
        this.galleryName = galleryName;
        this.galleryAddress = galleryAddress;
        this.artworks = new ArrayList<>();
    }

    // Getters, Setters
    public String getGalleryName() {
        return galleryName;
    }

    public void setGalleryName(String galleryName) {
        this.galleryName = galleryName;
    }

    public String getGalleryAddress() {
        return galleryAddress;
    }

    public void setGalleryAddress(String galleryAddress) {
        this.galleryAddress = galleryAddress;
    }

    public List<Artwork> getArtworks() {return artworks;}

    // Add artwork
    public void addArtwork(Artwork artwork) {artworks.add(artwork);}

    // Filter Artworks by price range
    public List<Artwork> FilterByPrice(double min, double max) {
        List<Artwork> filteredArtworks = new ArrayList<>();
        for (Artwork artwork : artworks) {
            if (artwork.getPrice() >= min && artwork.getPrice() <= max) {
                filteredArtworks.add(artwork);
            }
        }
        return filteredArtworks;
    }

    // Search Artworks by Title
    public Artwork searchByTitle(String title) {
        for (Artwork artwork : artworks) {
            if (artwork.getTitle().equalsIgnoreCase(title)) {
                return artwork;
            }
        }
        return null;
    }

    // Sort Artworks by Price
    public void sortByPrice() {
        artworks.sort(Comparator.comparing(Artwork::getPrice));
    }

    // Gallery Details
    public void galleryDetails() {
        System.out.println(this);
    }

    // Override toString()
    @Override
    public String toString() {
        return "Art Gallery: " + galleryName + ", Location: " + galleryAddress;
    }
}
