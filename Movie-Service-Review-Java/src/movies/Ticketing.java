package movies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;

public class Ticketing {

    final int TOTALSEATS = 100;
    final int[] showtimes = {8, 10, 12};

    HashMap<Showtime, Integer> sTSeats;

    public Ticketing() {

        sTSeats = new HashMap<>();

        for (int i : showtimes) 
            sTSeats.put(new Showtime(i), TOTALSEATS);
        
    }
   

    public void displayAvailableSeats() {
        
    }

    public void displayAvailableSeats(String moviename) {
        
    }
    
    public void displayAvailableSeats() {
        for (Map.Entry<String, Movie> entry : movies.entrySet()) {
            System.out.println("Movie: " + entry.getKey());
            entry.getValue().displayAvailableSeats();
        }
    }
    public void displayAvailableSeats() {
            for (int i = 0; i < seats.length; i++) {
                if (!seats[i]) {
                    System.out.println("Seat " + (i + 1) + " is available");
                }
            }
        }
    public void bookTicket(String movieName, int numTickets) {
        if (movies.containsKey(movieName)) {
            movies.get(movieName).bookTickets(numTickets);
        } else {
            System.out.println("Movie not found");
        }
    }

    public void cancelTicket(String movieName, int theChairNumber) {
        if (movies.containsKey(movieName)) {
            movies.get(movieName).cancelTicket(theChairNumber);
        } else {
            System.out.println("Movie not found");
        }
    }
    

        public void bookTickets(int numTickets) {
            int count = 0;
            for (int i = 0; i < seats.length; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    count++;
                }
                if (count == numTickets) {
                    break;
                }
            }
            if (count < numTickets) {
                System.out.println("Not enough seats available");
            } else {
                System.out.println("Tickets booked successfully");
            }
        }

        public void cancelTicket(int seatNumber) {
            if (seats[seatNumber - 1]) {
                seats[seatNumber - 1] = false;
                System.out.println("Ticket cancelled successfully");
            } else {
                System.out.println("Seat is already available");
            }
        }
    
}