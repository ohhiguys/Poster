package ru.netology.domain;

public class PosterManager {

    private PosterData[] films = new PosterData[0];
    private int maxFilms;

    public PosterManager() {
        this.maxFilms = 10;
    }

    public PosterManager(int maxFilms) {
        this.maxFilms = maxFilms;
    }

    public void add(PosterData film) {
        PosterData[] tmp = new PosterData[films.length + 1];
        for(int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public PosterData[] findAll() {
        return films;
    }

    public PosterData[] findLast() {
        int resultLength;
        if(films.length < maxFilms) {
            resultLength = films.length;
        } else {
            resultLength = maxFilms;
        }
        PosterData[] tmp = new PosterData[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
