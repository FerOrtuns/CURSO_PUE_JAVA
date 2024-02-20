package curso.poo.spotify.application;

import curso.poo.spotify.domain.Playlist;
import curso.poo.spotify.domain.Track;

import java.time.LocalDate;
import java.util.*;

public class SpotifyImpl implements Spotify {

    private final Map<Playlist, List<Track>> map = new HashMap<>();

    @Override
    public boolean addPlaylist(Playlist playlist) {

        if (map.containsKey(playlist)) {

            System.out.println("The playlist already exists.");
            return false;

        } else {

            map.put(playlist, new ArrayList<>());
            System.out.println("Playlist added.");
            return true;

        }

    }

    @Override
    public void addTrackToPlaylist(Playlist playlist, Track track) {

        if (!map.containsKey(playlist)) {

            System.out.println("The playlist with ID '" + playlist.getId() + "' doesn't exists.");

        } else {

            List<Track> tracks = map.get(playlist);
            tracks.add(track);
            System.out.println("Track '" + track.getTitle() + "' successfully added to playlist '" + playlist.getId() + "'.");

        }

    }

    @Override
    public void addTrackToPlaylistPosition(Playlist playlist, int position, Track track) {

        if (!map.containsKey(playlist)) {

            System.out.println("The playlist '" + playlist.getId() + "' doesn't exist.");

        } else {

            List<Track> tracks = map.get(playlist);

            if (position < 0 || position > tracks.size()) {

                System.out.println("Invalid position.");

            } else {

                tracks.add(position, track);
                System.out.println("Track added in position '" + position + "' successfully.");

            }

        }

    }

    @Override
    public List<Track> getTracks(Playlist playlist) {
//        return map.get(playlist);
        return Collections.unmodifiableList(map.get(playlist));
    }

    @Override
    public List<Track> getTracksFunctional(Playlist playlist) {
        List<Track> tracks = map.get(playlist);

        return tracks.stream().filter(track -> track.getReleaseDate().isAfter(LocalDate.of(2023, 1, 1))).toList();
    }

    @Override
    public Track findLongestTrack(Playlist playlist) {

        Track longestTrack = new Track();

        if (!map.containsKey(playlist)) {

            System.out.println("The playlist '" + playlist.getId() + "' doesn't exist.");

        } else {

            List<Track> tracks = map.get(playlist);

            for (Track track : tracks) {

                if (longestTrack.getSeconds() < track.getSeconds()) {

                    longestTrack = track;

                }

            }

        }

        return longestTrack;
    }

    @Override // Alfredo version
    public Track findLongestTrackFunctional(Playlist playlist) {
//        return getTracks(playlist).stream().max(Comparator.comparing(Track::getSeconds)).orElse(null);

        var list = new ArrayList<>(map.get(playlist));
        list.sort(Comparator.comparingInt(Track::getSeconds));
        return list.getFirst();
    }

    @Override
    public Track findShortestTrack(Playlist playlist) {

        Track shortestTrack = new Track();
        shortestTrack.setSeconds(Integer.MAX_VALUE);

        if (!map.containsKey(playlist)) {

            System.out.println("The playlist '" + playlist.getId() + "' doesn't exist.");

        } else {

            List<Track> tracks = map.get(playlist);

            for (Track track : tracks) {

                if (track.getSeconds() < shortestTrack.getSeconds()) {

                    shortestTrack = track;

                }

            }

        }

        return shortestTrack;
    }

    @Override // Stephan version
    public Track findShortestTrackFunctional(Playlist playlist) {
        map.get(playlist).sort((track, t1) -> track.getSeconds() - t1.getSeconds());
        return map.get(playlist).getFirst();
    }

    @Override
    public Double getAverageDurationTrack(Playlist playlist) {

        double totalDuration = 0.0;
        int totalTracks = 0;
        double averageDuration = 0.0;

        if (!map.containsKey(playlist)) {

            System.out.println("The playlist '" + playlist.getId() + "' doesn't exist.");

        } else {

            List<Track> tracks = map.get(playlist);

            if (!tracks.isEmpty()) {

                for (Track track : tracks) {

                    totalDuration += track.getSeconds();
                    totalTracks++;

                }

                averageDuration = (totalDuration / totalTracks);

            } else {
                System.out.println("The playlist '" + playlist.getId() + "' is empty.");
            }

        }

        return averageDuration;
    }

    @Override
    public Double getAverageDurationTrackFunctional(Playlist playlist) {
        return null;
    }

    @Override
    public List<Playlist> findByDates(LocalDate start, LocalDate end) {

        List<Playlist> playlistsDates = new ArrayList<>();

        for (Playlist playlist : map.keySet()) {
            Boolean localdate1 = start.isBefore(playlist.getCreationDate());
            Boolean localdate2 = end.isAfter(playlist.getCreationDate());

            if (localdate1 || localdate2) {
                playlistsDates.add(playlist);
            }

        }

        return playlistsDates;
    }

    @Override
    public List<Playlist> findByDatesFunctional(LocalDate start, LocalDate end) {
        return null;
    }

    @Override
    public List<Playlist> findByGenre(String genre) {

        Set<Playlist> playlists = map.keySet();
        List<Playlist> playlistWithGenre = new ArrayList<>();

        for (Playlist playlistActual : map.keySet()) {

            List<Track> tracks = map.get(playlistActual);

            for (Track track : tracks) {

                List<String> trackGenres = track.getGenre();

                if (trackGenres.contains(genre)) {

                    playlistWithGenre.add(playlistActual);

                }

            }

        }

        return playlistWithGenre;
    }

    @Override
    public List<Playlist> findByGenreFunctional(String genre) {

        return map.entrySet().stream().filter(entry -> entry.getValue().stream().anyMatch(track -> track.getGenre().contains(genre))).map(Map.Entry::getKey).toList();

    }

    @Override
    public List<Playlist> findByArtist(String artist) {
        return null;
    }

    @Override
    public List<Playlist> findByTrackDates(LocalDate start, LocalDate end, String artista) {
        return null;
    }

    @Override
    public Set<String> getGenres(Playlist playlist) {
        return null;
    }

    @Override
    public SortedSet<String> getSortedGenres(Playlist playlist) {
        return null;
    }

    @Override
    public List<String> getTopArtists(Playlist playlist) {
        return null;
    }

}