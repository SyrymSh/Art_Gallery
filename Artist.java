package Art_gallery;
import java.util.Objects;

public class Artist {
    private String name;
    private String birthday;

    // Constructor
    public Artist(String name, String birthday) {
        this.name = name;
        this.birthday = Artist.this.birthday;
    }

    // Getters, Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setNationality(String birthday) {
        this.birthday = birthday;
    }

    // Artist Details
    public void artistDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Artist: " + name + ", Birth Date: " + birthday;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artist artist = (Artist) obj;
        return name.equals(artist.name) && birthday.equals(artist.birthday);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
