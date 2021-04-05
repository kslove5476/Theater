import java.util.Scanner;

class Theater {
    int theaterID = 0001;
    String name = "CGV Sydney";
    String phoneNumber = "0499-502-201";
    Movie [] movielist = new Movie[20];
    int currentMovies=0;

    
    //constructor is the method with same name of class
    Theater(int ID, String name, String phonenumb){
        this.theaterID = ID;
        this.name = name;
        this.phoneNumber = phonenumb;
    }
    
    int getID(){
        return this.theaterID;
    }    
    void setID(int input){
        this.theaterID = input;
    }   
    String getName(){
        return this.name;
    }
    String setName(){
        return this.name;
    }   
    String getphonenumb() {
    	return this.phoneNumber;
    }
    String setphonenumb() {
    	return this.phoneNumber;
    }

    void displaymovie(){
        System.out.println("ID       roomname       moview name       time1       time2       time3");
        for(int i = 0 ; i < currentMovies ; i++){
            int moviewID =movielist[i].getmovieID();
            String moviewname = movielist[i].getname();
            String roomname = movielist[i].getroomname();
            String movietime1 = movielist[i].gettime1();
            String movietime2 = movielist[i].gettime2();
            String movietime3 = movielist[i].gettime3();

           System.out.println(moviewID +"    "+ moviewname+"    "+movietime1+"    "+movietime2+"    "+movietime3+"    ");
        }
    }

    void addmovie(Movie movie)
    {
        this.movielist[currentMovies]=movie;
        this.currentMovies++;
    }
}

class room {
    Theater masterTheater;

    String name;
    int roomID;
    
    String[][] seats = new String[8][8];
	char column;
	int colunmint;
	int row1;

	//       A  B  C  D  E  F  G  H
	//    1 [] [] [] [] [] [] [] []
	//    2 [] [] [] [] [] [] [] []
	//    3 [] [] [] [] [] [] [] []
	//    4 [] [] [] [] [] [] [] []
	//    5 [] [] [] [] [] [] [] []
	//    6 [] [] [] [] [] [] [] []
	//    7 [] [] [] [] [] [] [] []
	//    8 [] [] [] [] [] [] [] []
    //    9 [] [] [] [] [] [] [] []
    //    10 [] [] [] [] [] [] [] []

    room(Theater masterTheater, String name, int roomID) {
        setTheater(masterTheater);
        setName(name);
        setID(roomID);
        initseats();
        //displayseat();
    }

    public void initseats() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                seats[i][j] = "[0]";
            }
	    }
    }

	public void displayseat() {
        System.out.println(" Welcome to " + this.name + "(" + this.roomID + ") room");
		System.out.println("   A  B  C  D  E  F  G  H "); // display column
	    for (int i = 0; i < 8; i++) {
            System.out.print(i+1+" ");            
		    for (int j = 0; j < 8; j++) {
                System.out.print(seats[i][j]);
		}
        System.out.println();
	    }
    }

    Theater getTheater(){
        return this.masterTheater;
    }
    void setTheater(Theater masterTheater){
        this.masterTheater = masterTheater;
    }
    int getID(){
        return this.roomID;
    }    
    void setID(int input){
        this.roomID = input;
    }   
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name =name;
    }
    

}
class Movie{
    int movieID = 0101;
    String name = "Frozen";
    String time1 = "09:30";
    String time2 = "12:30";
    String time3 = "15:30";
    room room;

    Movie(room room, int movieID, String name,String time1, String time2, String time3){
        this.movieID = movieID;
        this.name = name;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3; 
        this.room = room;
        addtoMoviewList();
    }

    int getmovieID() {
    	return this.movieID;
    }
    void setmovieID(int movieID) {
    	this.movieID = movieID;
    }
    String getname() {
    	return this.name;
    }
    void setname(String name) {
    	this.name=name;
    }
    String gettime1() {
    	return this.time1;
    }
    void settime1(String time1) {
    	this.time1=time1;
    }
    String gettime2() {
    	return this.time2;
    }
    void settime2(String time2) {
    	this.time2=time2;
    }
    String gettime3() {
    	return this.time3;
    }
    void settime3(String time3) {
    	this.time3=time3;
    }
    room getroom() {
    	return this.room;
    }
    void setroom(room room) {
    	this.room=room;
    }

    void addtoMoviewList(){
        Theater myTheater = room.getTheater();
        myTheater.addmovie(this);
    }
}

class Booking{
    Movie movie;
    int bookingID = 040421;
    String SeatNumb = "A1";
    
    Booking(Movie movie, int bookingID, String seatNumb){
        this.movie=movie;
        this.bookingID = bookingID;
        this.SeatNumb = seatNumb;
    }
    Movie getMovie(){
        return this.movie;
    }
    void setMovie(Movie movie){
        this.movie=movie;
    }
    int getbookingID() {
    	return this.bookingID;
    }
    void setbookingID(int bookingID) {
    	this.bookingID=bookingID;
    }
    String getseatNumb() {
        return this.SeatNumb;
    }
    void setseatNumb(String SeatNumb) {
    	this.SeatNumb=SeatNumb;
    }
   
}

public class App {
    public static void main(String[] args) throws Exception {
        int selectedMenu=0;
        
        //System Manager can add theater, room, moview //
        Theater theater1 = new Theater(1000, "Sydney", "0404-434-112");
        room room_1th_1= new room(theater1,"lion",1001);
        room room_1th_2= new room(theater1,"rabbit",1002);
        Movie movie1 = new Movie(room_1th_1, 1020, "Avengers", "9:30", "12:30", "15:30");
        Movie movie2 = new Movie(room_1th_1, 1030, "Lord of Rings", "11:30", "15:30", "18:00");
        Movie movie3 = new Movie(room_1th_2, 1040, "Frozen", "15:00", "14:30", "17:00");
        ////////////////

        System.out.println("--------------------------------------------------------");
        System.out.println("______________ Wellcome to Moview Cinema ______________");
        System.out.println("______________    1. Display Movies      ______________");
        System.out.println("______________    2. Booking Movies      ______________");
        System.out.println("______________          3. Exit          ______________");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please select menu (number only): ");

        Scanner sc = new Scanner(System.in);
        try {
            selectedMenu = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please insert right input. Number only allowed. For example, to select '3.' Exit, just insert '3'");
        }

        switch (selectedMenu) {
            case 1:
                System.out.println("______________    1. Display Movies      ______________");
                theater1.displaymovie();
                break;
        
            case 2:
                System.out.println("______________    2. Booking Movies      ______________");
                break;

            case 3:
                System.out.println("______________          3. Exit          ______________");
                System.exit(0);
                break;

            default:
                System.out.println("Please insert right input. number only allowed. For example, to select 3. Exit, just insert 3");
                break;
        }
        
    
    }
}


    // theater theater1 = new theater();
    // theater theater2 = new theater();

	// //initialize all seats
    // theater1.initseat();
    // //display all seat status.
    // theater1.displayseat();
    // //Choice seat and input seat.
    // theater1.inputScanner();
    // //display your input seat status.
    // theater1.displayinputseat();
    // //select your seat.
    // theater1.selectedseat();

// class theater{
//     boolean[][] seat = new boolean[8][10];
//     char column;
//     int colunmint;
//     int row1;

//     //    A  B  C  D  E  F  G  H
//     // 1 [] [] [] [] [] [] [] []
//     // 2 [] [] [] [] [] [] [] []
//     // 3 [] [] [] [] [] [] [] []
//     // 4 [] [] [] [] [] [] [] []
//     // 5 [] [] [] [] [] [] [] []
//     // 6 [] [] [] [] [] [] [] []
//     // 7 [] [] [] [] [] [] [] []
//     // 8 [] [] [] [] [] [] [] []
//     // 9 [] [] [] [] [] [] [] []
//     // 10 [] [] [] [] [] [] [] []

//     // initialise seat
//     public void initseat(){
//         for (int i = 0; i < 8; i++) {
//             for (int j = 0; j < 10; j++) {
//                 seat[i][j] = true;
//             }
//         }
//     }

//     // user input
//     public void inputScanner() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("please enter seat colunm A~H :");
//         String colunms = sc.nextLine();
//         column = colunms.charAt(0);// get the first char of the string
//         System.out.println("please enter seat row 1~10 :");
//         row1 = sc.nextInt();
//         sc.close();
//     }

//     // convert column string input into int
//     public void columnconvert() {
//         // int columnconvert = 0;
        
//         switch (column) {
//             case 'A', 'a':
//                 colunmint = 0;
//                 break;
//             case 'B', 'b':
//                 colunmint = 1;
//                 break;
//             case 'C', 'c':
//                 colunmint = 2;
//                 break;
//             case 'D', 'd':
//                 colunmint = 3;
//                 break;
//             case 'E', 'e':
//                 colunmint = 4;
//                 break;
//             case 'F', 'f':
//                 colunmint = 5;
//                 break;
//             case 'G', 'g':
//                 colunmint = 6;
//                 break;
//             case 'H', 'h':
//                 colunmint = 7;
//                 break;
//         }
//     }

//     // change status of selected seat
//     public void selectedseat() {
//         columnconvert();
//         if (seat[colunmint][row1 - 1] == true) {
//             System.out.println("reservation completed!");
//             seat[colunmint][row1 - 1] = false;
//             displayseat();
//         } else {
//             System.out.println("Please try to select other seat.");
//         }
//     }
    //show seat yog
//     public void displayseat() {
//         System.out.println("   A   B   C   D   E   F   G   H "); // display column
//         for (int i = 0; i < 10; i++) {
//             System.out.print(i + 1 + " "); // display row
//             for (int j = 0; j < 8; j++) {
//                 if (seat[j][i]) {
//                     System.out.print("[o] ");
//                 } else {
//                     System.out.print("[x] ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     // utilize return & parameter -> make all functions as method and edit main
//     // method to simple
//     // display input seat
//     public void displayinputseat() {
//         System.out.println("your selection is " + column + row1);
//     }

// }