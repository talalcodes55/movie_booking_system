package movies;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    String hallName ;
    ArrayList <Movie> films;

    
    public Cinema ( String hallName ,ArrayList<Movie> films ){
        this.hallName=hallName;
        this.films = films ;
    }

    public String getHallName() {
        return this.hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public ArrayList<Movie> getFilms() {
        return this.films;
    }

    public void setFilms(ArrayList<Movie> films) {
        this.films = films;
    }

    public void addMovie(int movieID,String movieName, String typeOfMovie , int yearOfRelease , List<Showtime> showTimes) {
        
        films.add( new Movie(movieID, movieName, typeOfMovie, yearOfRelease, showTimes));
    }}
