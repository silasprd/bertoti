package anipad;

public class Anime {
	private String name;
    private Genre genre;
    private String description;
    private String link;
    
    public Anime(String name, Genre genre, String description, String link) {
            this.name = name;
            this.genre = genre;
            this.description = description;
            this.link = link;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }


    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre newGenre) {
        genre = newGenre;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String newDescription) {
        description = newDescription;
    }


    public String getLink() {
        return link;
    }
    public void setLink(String newLink) {
        link = newLink;
    }
}
