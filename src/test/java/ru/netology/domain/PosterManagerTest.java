package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterData film1 = new PosterData(8, "Матрица", "8 октября", "премьера завтра", 18, "Киану Ривз");
    PosterData film2 = new PosterData(25, "Рокки", "18 ноября", "премьера 18 ноября", 16, "Сильвестр Сталлоне");
    PosterData film3 = new PosterData(80, "Кровью и потом: анаболики", "16 июня", "премьера завтра", 18, "Марк Уолберг");
    PosterData film4 = new PosterData(11, "Лара Крофт", "10 мая", "премьера завтра", 10, "Анджелина Джоли");
    PosterData film5 = new PosterData(1, "Марсианин", "3 июля", "премьера 3 июля", 16, "Марк Уолберг");
    PosterData film6 = new PosterData(4, "Гнев человеческий", "1 января", "премьера 1 января", 18, "Джейсон Стэйтем");
    PosterData film7 = new PosterData(21, "Дюна", "13 июля", "премьера 13 июля", 16, "Зендея");
    PosterData film8 = new PosterData(10, "Веном", "10 октября", "премьера завтра", 16, "Том Харди");
    PosterData film9 = new PosterData(84, "Отряд самоубийц", "3 сентября", "премьера 3 сентября", 12, "Марго Робби");
    PosterData film10 = new PosterData(16, "Черная вдова", "16 декабря", "премьера завтра", 16, "Скарлетт Йоханссон");
    PosterData film11 = new PosterData(33, "Форсаж 20", "8 августа", "премьера завтра", 16, "Вин Дизель");

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

    @Test
    public void equalLimit() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        PosterData[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        PosterData[] actual = manager.findLast();
    }

    @Test
    public void moreThanLimit() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);

        PosterData[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        PosterData[] actual = manager.findLast();
    }

    @Test
    public void lessThanLimit() {
        PosterManager manager = new PosterManager();
        manager.add(film11);

        PosterData[] expected = {film11};
        PosterData[] actual = manager.findLast();
    }
}
