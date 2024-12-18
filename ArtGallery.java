package Art_gallery;

public class ArtGallery {
    public String galleryName;
    public String galleryAddress;

    // Constructor
    public ArtGallery(String galleryName, String galleryAddress) {
        this.galleryName = galleryName;
        this.galleryAddress = galleryAddress;
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

    // Gallery Details
    public void galleryDetails() {
        System.out.println("Gallery Name: " + galleryName);
        System.out.println("Gallery Address: " + galleryAddress);
    }
}
