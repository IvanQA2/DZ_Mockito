package org.example;

public class ManagerFilm {
    private String[] filmName = new String[0];
    private int limit;

    public ManagerFilm() {
        this.limit = 10;

    }

    public ManagerFilm(int limit) {
        this.limit = limit;

    }

    public void addFilm(String film) {
        String[] tmp = new String[filmName.length + 1];
        for (int i = 0; i < filmName.length; i++) {
            tmp[i] = filmName[i];
        }
        tmp[tmp.length - 1] = film;
        filmName = tmp;

    }

    public String[] findAll() {
        return filmName;
    }

    public String[] findLast() {
        int resultLenght;
        if (filmName.length < limit) {
            resultLenght = filmName.length;
        } else {
            resultLenght = limit;
        }
        String[] tmp = new String[resultLenght];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = filmName[filmName.length - 1 - i];
        }
        return tmp;
    }
}



