package fr.mines.android.exercises;

public class Movie {

    public final int imageRes;
    public final String title;
    public final String inTheaterDate;
    public final String synopsis;

    public Movie(int imageRes, String title, String inTheaterDate, String synopsis) {
        this.imageRes = imageRes;
        this.title = title;
        this.inTheaterDate = inTheaterDate;
        this.synopsis = synopsis;
    }
}
