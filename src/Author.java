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
        return authorFirstName + authorSecondName;
    }
}