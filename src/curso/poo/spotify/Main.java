package curso.poo.spotify;

import curso.poo.spotify.application.Spotify;
import curso.poo.spotify.application.SpotifyImpl;
import curso.poo.spotify.domain.Playlist;
import curso.poo.spotify.domain.Track;

import java.time.LocalDate;
import java.util.List;

public class Main {

    private static Spotify spotify = new SpotifyImpl();

    public static void main(String[] args) {

        Playlist playlist1 = new Playlist(1, "PlaylistTitle1", "PlaylistDescription1", List.of("Let's dance all night!", "Great vibes!"));
        Playlist playlist2 = new Playlist(2, "PlaylistTitle2", "PlaylistDescription2", List.of("Let's dance all night!", "Great vibes!"));
        Playlist playlist3 = new Playlist(3, "PlaylistTitle3", "PlaylistDescription3", List.of("Perfect for a lazy afternoon", "Soothing melodies"));
        Playlist playlist4 = new Playlist(4, "PlaylistTitle4", "PlaylistDescription4", List.of("Epic tunes for the road", "Rock on!"));
        Playlist playlist5 = new Playlist(5, "PlaylistTitle5", "PlaylistDescription5", List.of("Start your day right!", "Positive energy"));
        Playlist playlist6 = new Playlist(6, "PlaylistTitle6", "PlaylistDescription6", List.of("Feel the sunshine!", "Good vibes only"), LocalDate.of(2022, 7, 27));
        Playlist playlist7 = new Playlist(7, "PlaylistTitle7", "PlaylistDescription7", List.of("Soulful melodies", "Relaxing jazz tunes"), LocalDate.of(2023, 7, 21));
        Playlist playlist8 = new Playlist(8, "PlaylistTitle8", "PlaylistDescription8", List.of("Nostalgia overload", "Best of the past"), LocalDate.of(2024, 2, 15));
        Playlist playlist9 = new Playlist(9, "PlaylistTitle9", "PlaylistDescription9", List.of("Discover new music", "Indie vibes"), LocalDate.of(2024, 1, 28));
        Playlist playlist10 = new Playlist(10, "PlaylistTitle10", "PlaylistDescription10", List.of("Pump up the volume!", "Get fit with music"), LocalDate.of(2020, 9, 19));

        Track track1 = new Track(1, "Sunset Dreams", List.of("Summer Vibes"), List.of("Chillout"), "url", 125);
        Track track2 = new Track(2, "City Lights", List.of("Urban Groove"), List.of("Hip Hop"), "url", 115);
        Track track3 = new Track(3, "Ocean Breeze", List.of("The Waves"), List.of("Ambient"), "url", 140);
        Track track4 = new Track(4, "Moonlit Serenade", List.of("Jazz Trio"), List.of("Jazz"), "url", 135);
        Track track5 = new Track(5, "Midnight Romance", List.of("Smooth Sax"), List.of("Romantic"), "url", 130);
        Track track6 = new Track(6, "Starlight Symphony", List.of("Orchestra Ensemble"), List.of("Classical"), "url", 180);
        Track track7 = new Track(7, "Electric Pulse", List.of("DJ Electro"), List.of("Electronic"), "url", 150);
        Track track8 = new Track(8, "Mountain Trek", List.of("Nature Sounds"), List.of("Ambient"), "url", 160);
        Track track9 = new Track(9, "Tropical Paradise", List.of("Island Beats"), List.of("Reggae"), "url", 145);
        Track track10 = new Track(10, "Firestorm", List.of("Heavy Riffs"), List.of("Metal"), "url", 170);

        System.out.println("\n");

        spotify.addPlaylist(playlist1);
        spotify.addPlaylist(playlist1);
        spotify.addPlaylist(playlist6);

        System.out.println("\n");

        spotify.addTrackToPlaylist(playlist1, track1);
        spotify.addTrackToPlaylist(playlist1, track2);
        spotify.addTrackToPlaylist(playlist1, track3);
        spotify.addTrackToPlaylist(playlist1, track4);
        spotify.addTrackToPlaylist(playlist2, track3);

        System.out.println("\n");

        spotify.addTrackToPlaylistPosition(playlist1, 0, track3);

        System.out.println("\n");

        System.out.println("The longest track is: " + spotify.findLongestTrack(playlist1));

        System.out.println("\n");

        System.out.println("The shortest track is: " + spotify.findShortestTrack(playlist1));

        System.out.println("\n");

        System.out.println("The average duration track in this playlist is: " + spotify.getAverageDurationTrack(playlist1));

        System.out.println("\n");

        spotify.addTrackToPlaylist(playlist6, track7);
        spotify.addTrackToPlaylist(playlist6, track6);
        spotify.addTrackToPlaylist(playlist6, track8);
        spotify.addTrackToPlaylist(playlist6, track9);

        System.out.println("\n");

        System.out.println("The dates in this playlist is: " + spotify.findByDates(LocalDate.of(2019, 02, 15), LocalDate.of(2024, 02, 15)));

        System.out.println("\n");

        List<Track> tracks = spotify.getTracks(playlist1);
        tracks.forEach(System.out::println);

        System.out.println("\n");

        List<Playlist> playlists = spotify.findByGenre("Jazz");
        System.out.println("Playlist with the genre Jazz: " + playlists);

        System.out.println("\n");


    }

}
