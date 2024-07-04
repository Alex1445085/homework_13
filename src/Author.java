import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorSecondName;

    public Author(String firstName, String secondName) {
        this.authorFirstName = firstName;
        this.authorSecondName = secondName;
    }
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    public String getAuthorSecondName() {
        return this.authorSecondName;
    }

    public String toString() {
        return this.authorFirstName + this.authorSecondName;
    }
    @Override
    public boolean equals(Object obj) {
 //       System.out.println(obj.hashCode() + ", " + this.hashCode());
        if(obj.hashCode() != this.hashCode()) return false;
        if(this.getClass() != obj.getClass() || obj == null) return false;
        if(((Author) obj).getAuthorFirstName().equals(this.authorFirstName) &&
                ((Author) obj).getAuthorSecondName().equals(this.authorSecondName)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorSecondName);
    }
}