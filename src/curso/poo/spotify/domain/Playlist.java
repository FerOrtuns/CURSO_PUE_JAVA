package curso.poo.spotify.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Playlist implements Comparable<Playlist> {

    private long id;
    private String title;
    private String description;
    private List<String> comments;
    private LocalDate creationDate;

    public Playlist(long id, String title, String description, List<String> comments) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.comments = comments;
        this.creationDate = LocalDate.now();
    }

    public Playlist(long id, String title, String description, List<String> comments, LocalDate creationDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.comments = comments;
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playList = (Playlist) o;
        return id == playList.id && Objects.equals(title, playList.title) && Objects.equals(description, playList.description) && Objects.equals(comments, playList.comments) && Objects.equals(creationDate, playList.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, comments, creationDate);
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", comments=" + comments +
                ", creationDate=" + creationDate +
                '}';
    }

    @Override
    public int compareTo(Playlist p) {
        return this.creationDate.compareTo(p.creationDate);
    }

}