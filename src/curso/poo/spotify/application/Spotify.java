package curso.poo.spotify.application;

import curso.poo.spotify.domain.Playlist;
import curso.poo.spotify.domain.Track;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public interface Spotify {

    boolean addPlaylist(Playlist playlist);

    void addTrackToPlaylist(Playlist playlist, Track track);

    void addTrackToPlaylistPosition(Playlist playlist, int position, Track track);

    List<Track> getTracks(Playlist playlist);

    List<Track> getTracksFunctional(Playlist playlist);

    Track findLongestTrack(Playlist playlist);

    Track findLongestTrackFunctional(Playlist playlist);

    Track findShortestTrack(Playlist playlist);

    Track findShortestTrackFunctional(Playlist playlist);

    Double getAverageDurationTrack(Playlist playlist);

    Double getAverageDurationTrackFunctional(Playlist playlist);

    List<Playlist> findByDates(LocalDate start, LocalDate end);

    List<Playlist> findByDatesFunctional(LocalDate start, LocalDate end);

    List<Playlist> findByGenre(String genre);

    List<Playlist> findByGenreFunctional(String genre);

    List<Playlist> findByArtist(String artist);

    List<Playlist> findByTrackDates(LocalDate start, LocalDate end, String artista);

    Set<String> getGenres(Playlist playlist);

    SortedSet<String> getSortedGenres(Playlist playlist);

    List<String> getTopArtists(Playlist playlist);

}
