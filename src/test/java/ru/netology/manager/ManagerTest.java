package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    String movie1 = "movie 1";
    String movie2 = "movie 2";
    String movie3 = "movie 3";
    String movie4 = "movie 4";
    String movie5 = "movie 5";


    @Test

    public void shouldSequentialAddition() {
        Manager manager = new Manager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);


        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,

        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @BeforeEach

    @Test
    public void shouldNonSequentialAddition() {
        Manager manager = new Manager();
        manager.add(movie4);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie5);
        manager.add(movie3);


        String[] expected = {
                movie4,
                movie1,
                movie2,
                movie5,
                movie3,

        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseOrder() {
        Manager manager = new Manager(10);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);


        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseOrderMaxLimit() {
        Manager manager = new Manager(11);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);


        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseOrderNegativeLimit() {
        Manager manager = new Manager(-1);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);


        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseOrderNoLimit() {
        Manager manager = new Manager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String movie1 = "movie 1";
        String movie2 = "movie 2";
        String movie3 = "movie 3";
        String movie4 = "movie 4";
        String movie5 = "movie 5";

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseOrderlessArrayLimit() {
        Manager manager = new Manager(4);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String movie1 = "movie 1";
        String movie2 = "movie 2";
        String movie3 = "movie 3";
        String movie4 = "movie 4";
        String movie5 = "movie 5";

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldReverseOrderLimitOne() {
        Manager manager = new Manager(1);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String movie1 = "movie 1";
        String movie2 = "movie 2";
        String movie3 = "movie 3";
        String movie4 = "movie 4";
        String movie5 = "movie 5";

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldReverseOrderLimitZero() {
        Manager manager = new Manager(0);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String movie1 = "movie 1";
        String movie2 = "movie 2";
        String movie3 = "movie 3";
        String movie4 = "movie 4";
        String movie5 = "movie 5";

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldReverseOrderlessArrayEqualsLimit() {
        Manager manager = new Manager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String movie1 = "movie 1";
        String movie2 = "movie 2";
        String movie3 = "movie 3";
        String movie4 = "movie 4";
        String movie5 = "movie 5";

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }
}
