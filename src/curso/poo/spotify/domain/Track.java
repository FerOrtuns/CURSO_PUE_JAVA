package curso.poo.spotify.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Track {

    private long id;
    private String title;
    private List<String> artist;
    private List<String> genre;
    private LocalDate releaseDate;
    private String url;
    private int seconds;

    public Track() {
    }

    public Track(long id, String title, List<String> artist, List<String> genre, String url, int seconds) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.releaseDate = LocalDate.now();
        this.url = url;
        this.seconds = seconds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getArtist() {
        return artist;
    }

    public void setArtist(List<String> artist) {
        this.artist = artist;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
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
        Track track = (Track) o;
        return seconds == track.seconds && Objects.equals(title, track.title) && Objects.equals(artist, track.artist) && Objects.equals(genre, track.genre) && Objects.equals(releaseDate, track.releaseDate) && Objects.equals(url, track.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, genre, releaseDate, url, seconds);
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", artist=" + artist +
                ", genre=" + genre +
                ", releaseDate=" + releaseDate +
                ", url='" + url + '\'' +
                ", seconds=" + seconds +
                '}';
    }

}