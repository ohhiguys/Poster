package ru.netology.domain;

public class PosterData {
    private int id;
    private String filmName;
    private String release;
    private String premiere;
    private int ageLimit;
    private String cast;

    public PosterData(int id, String filmName, String release, String premiere, int ageLimit, String cast) {
        this.id = id;
        this.filmName = filmName;
        this.release = release;
        this.premiere = premiere;
        this.ageLimit = ageLimit;
        this.cast = cast;
    }

    public int getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getRelease() {
        return release;
    }

    public String getPremiere() {
        return premiere;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public String getCast() {
        return cast;
    }
}
