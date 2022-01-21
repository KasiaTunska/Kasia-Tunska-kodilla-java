package challenges;

import challenges.MovieStore;

import java.util.stream.Collectors;

public class MainMovieStore {

    public static void main(String[] args) {
        String allMovies = MovieStore.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.joining("!", " ", " "));

        System.out.println(allMovies);
    }
}