package movies;

public class Ticket {
    int theChairNumber ;
    Showtime showTime ;
    static final float ticketPrice = 20;
    public Ticket(int theChairNumber ,Showtime showTime){
        this.theChairNumber = theChairNumber ;
        this.showTime = showTime ;
    }
}
