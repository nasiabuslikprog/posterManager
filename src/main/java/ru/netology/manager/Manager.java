package ru.netology.manager;

public class Manager {
    private String[] movies = new String[0];
    private int limit;

    public Manager() {
        limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
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
        Manager manager = new Manager();
        String[] resultSize;
        if (limit < movies.length) {
            resultSize = new String[limit];
        } else {
            resultSize = new String[movies.length];
        }

        for (int i = 0; i < resultSize.length; i++) {
            resultSize[i] = movies[movies.length - 1 - i];
        }
        return resultSize;
    }
}