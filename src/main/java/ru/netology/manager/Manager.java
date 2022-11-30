package ru.netology.manager;

public class Manager {
    private String[] movies = new String[0];
    private int Limit;

    public Manager() {
        int limit = 10;
    }

    public Manager(int limit) {
        this.Limit = limit;

    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];

        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;


    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {

        int resultSize;
        if (Limit < movies.length) {
            resultSize = Limit;
        } else {
            resultSize = movies.length;
        }
        // Limit < movies.length ? Limit : movies.length;

        String[] result = new String[resultSize];
        for (int i = 0; i < resultSize; i++) {
            result[i] = movies[movies.length - 1 - i];

        }
        return result;


    }
}
