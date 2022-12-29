package org.example;

public class ManagerFilm {
    private String[] filmName = new String[0];


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
        if (filmName.length < 10) {
            resultLenght = filmName.length;
        } else {
            resultLenght = 10;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = filmName[filmName.length - 1 - i];
        }
        return tmp;

    }
}



