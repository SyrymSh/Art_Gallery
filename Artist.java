package Art_gallery;

public class Artist {
    public String name;
    public String nationality;

    // Constructor
    public Artist(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    // Getters, Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Artist Details
    public void artistDetails() {
        System.out.println("Name: " + name);
        System.out.println("Nationality: " + nationality);
    }
}
