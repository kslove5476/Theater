public class Booking{
    Movie movie;
    int bookingID = 040421;
    String SeatNumb = "A1";
    String time;
    
    Booking(Movie movie, int bookingID, String seatNumb, String time){
        this.movie=movie;
        this.bookingID = bookingID;
        this.SeatNumb = seatNumb;
        this.time = time;
        displaybooking();
    }
    Movie getMovie(){
        return this.movie;
    }
    void setMovie(Movie movie){
        this.movie = movie;
    }
    int getbookingID() {
    	return this.bookingID;
    }
    void setbookingID(int bookingID) {
    	this.bookingID = bookingID;
    }
    String getseatNumb() {
        return this.SeatNumb;
    }
    void setseatNumb(String SeatNumb) {
    	this.SeatNumb = SeatNumb;
    }
    String gettime() {
        return this.time;
    }
    void settime(String time) {
    	this.time = time;
    }
    void displaybooking(){
        System.out.println("================MOVIE TICKET=================");
        System.out.println("bookingID : " + this.bookingID);
        System.out.println("Movie Name : " + this.movie.getname());
        System.out.println("Movie Time : " + this.time);
        System.out.println("=================  DETAILS  =================");
        System.out.println("Room Name : " + this.movie.getroom().getName());
        System.out.println("Seat : " + this.SeatNumb);
        System.out.println("=============================================");
    }
   
}
