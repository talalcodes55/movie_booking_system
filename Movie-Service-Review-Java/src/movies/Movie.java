package movies;

import java.util.List;
//import java.util.Objects;

public class Movie {
	int movieID ;
	String movieName;
	String movieType ;
	int yearOfRelease;
	List<Showtime> showTimes;
	Ticketing ticketBook;
	
	public Movie(int movieID,String movieName, String movieType , int yearOfRelease , List<Showtime> showTimes) {
		this.movieID = movieID ;
		this.movieName = movieName;
		this.movieType = movieType;
		this.yearOfRelease = yearOfRelease;
		this.showTimes = showTimes;
		this.ticketBook = new Ticketing();
	}

	public int getMovieID() {
		return this.movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return this.movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieType() {
		return this.movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public int getYearOfRelease() {
		return this.yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public List<Showtime> getShowTimes() {
		return this.showTimes;
	}

	public void setShowTimes(List<Showtime> showTimes) {
		this.showTimes = showTimes;
	}

	
}
