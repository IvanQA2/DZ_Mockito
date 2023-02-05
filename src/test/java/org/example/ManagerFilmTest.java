package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerFilmTest {

    @Test
    public void test() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";
        String film4 = "Film 4";


        ManagerFilm manager = new ManagerFilm();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testLast() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";
        String film4 = "Film 4";


        ManagerFilm manager = new ManagerFilm();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testLastTen() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";
        String film4 = "Film 4";
        String film5 = "Film 5";
        String film6 = "Film 6";
        String film7 = "Film 7";
        String film8 = "Film 8";
        String film9 = "Film 9";
        String film10 = "Film 10";


        ManagerFilm manager = new ManagerFilm();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findLastSmallArrayReturnsCorrectLength() {
        ManagerFilm manager = new ManagerFilm();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        String[] result = manager.findLast();
        assertEquals(2, result.length);
    }
    @Test
    public void findLastLongArrayReturnsCorrectLength() {
        ManagerFilm manager = new ManagerFilm();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");
        String[] result = manager.findLast();
        assertEquals(10, result.length);
    }
    @Test
    public void findAllEmptyArrayReturnsEmptyArray() {
        ManagerFilm manager = new ManagerFilm();
        String[] result = manager.findAll();
        assertEquals(0, result.length);
    }
    @Test
    public void findLastEmptyArrayReturnsEmptyArray() {
        ManagerFilm manager = new ManagerFilm();
        String[] result = manager.findLast();
        assertEquals(0, result.length);
    }
}