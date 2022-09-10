package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterData film1 = new PosterData(8, "Матрица", "8 октября", "премьера завтра", 18, "Киану Ривз");
    PosterData film2 = new PosterData(25, "Рокки", "18 ноября", "премьера 18 ноября", 16, "Сильвестр Сталлоне");
    PosterData film3 = new PosterData(80, "Кровью и потом: анаболики", "16 июня", "премьера завтра", 18, "Марк Уолберг");
    PosterData film4 = new PosterData(11, "Лара Крофт", "10 мая", "премьера завтра", 10, "Анджелина Джоли");

    @Test
    public void allFilms() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);

        PosterData[] expected = {film1, film2, film3, film4};
        PosterData[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilm() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        PosterData[] expected = {film3, film2, film1};
        PosterData[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
