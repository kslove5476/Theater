import java.util.Scanner;

class Theater {
    int theaterID = 0001;
    String name = "CGV Sydney";
    String phoneNumber = "0499-502-201";
    
    //constructor is the method with same name of class
    Theater(int ID, String name, String phonenumb){
        theaterID = ID;
        name = Name;
        phonenumb = PhoneNumber;
    }
    
    int getID(){
        return this.theaterID;
    }    
    void setID(int input){
        theaterID = input;
    }   
    String getName(){
        return this.name;
    }
    String setName(){
        return this.name;
    }   
    int getphonenumb() {
    	return this.phonenumb;
    }
    int setphonenumb() {
    	return this.phonenumb;
    }
}

class room{
    String[][] seats = new String[8][10];
	char column;
	int colunmint;
	int row1;

	      A  B  C  D  E  F  G  H
	   1 [] [] [] [] [] [] [] []
	   2 [] [] [] [] [] [] [] []
	   3 [] [] [] [] [] [] [] []
	   4 [] [] [] [] [] [] [] []
	   5 [] [] [] [] [] [] [] []
	   6 [] [] [] [] [] [] [] []
	   7 [] [] [] [] [] [] [] []
	   8 [] [] [] [] [] [] [] []
       9 [] [] [] [] [] [] [] []
       10 [] [] [] [] [] [] [] []

	public void initseat(){
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 10; j++) {
			seat[i][j] = true;
		}
	}
}
}
	public void displayseat() {
		System.out.println("   A   B   C   D   E   F   G   H "); // display column
	for (int i = 0; i < 10; i++) {
		System.out.print(i + 1 + " "); // display row
			for (int j = 0; j < 8; j++) {
	if (seat[j][i]) {
			System.out.print("[o] ");
		} else {
			System.out.print("[x] ");
			}
		}
			System.out.println();
		}
	}

class Movie{
    int movieID = 0101A;
    String name = "Frozen";
    String time1 = "09:30";
    String time1 = "12:30";
    String time3 = "15:30";

    Movie(int movieID, String name,String time1, String time2, String time3){
        movieid = MovieID;
        name = Name;
        time1 = Time1;
        time2 = Time2;
        time3 = Time3; 
    }

    int getmovieID() {
    	return this.movieID;
    }
    int setmovieID() {
    	return this.getmovieID();
    }
    String getname() {
    	return this.name;
    }
    String setname() {
    	retun this.name;
    }
    String gettime1() {
    	return this.gettime1();
    }
    String settime1() {
    	return this gettime1();
    }
    String gettime2() {
    	return this.gettime2();
    }
    String settime2() {
    	return this.settime2;
    }
    String gettime3() {
    	return this.gettime3();
    }
    String settime3() {
    	return this.settime3;
    }
}

class Booking{
    int bookingID = 040421;
    String moviename = "Frozen";
    int theaterID = 0001;
    int roomID = 01;
    String phonenumber = "0499-502-201";
    String time = "09:30";
    String SeatNumb = "A1";
    
    Booking(int bookingID, String moviename,int theaterID, int roomID, 
    		String phonenumber,  String time, String seatNumb){
        bookingid = BookingID;
        moviename = MovieName;
        theaterID = TheaterID;
        roomID = RoomID;
        phonenumber = PhoneNumber;
        time = Time;
        seatNumb = SeatNumb;
    }

    int getbookingID() {
    	return this.bookingID;
    }
    int setbookingID() {
    	return this.setbookingID();
    }
    String getmoviename() {
    	return this.moviename();
    }
    String setmoviename() {
    	retun this.getmoviename();
    }
    int gettheaterID() {
    	return this.theaterID;
    }
    int settheaterID() {
    	return this.gettheaterID()
    }
    int getroomID() {
    	return this.roomID;
    }
    int setroomid() {
    	return this.getroomID;
    }
    String getphonenumber() {
    	return this.phonenumber;
    }
    String setmoviename() {
    	return this.getphonenumber();
}
    String gettime() {
    	return this.time;
    }
    String settime() {
    	return this.gettime;
}
    String getseatNumb() {
    	return this.SeatNumb;
    }
    String settime() {
    	return this.getseatNumb();
}
}
public class App {
    public static void main(String[] args) throws Exception {
    
    Theater theater1 = new Theater(19192, "CGV_Melb", "0404-411-221");

    int a = theater1.getID();    
        System.out.println(a);
    theater1.setID(0001);
    
    // reference
    Movie movie1 = new Movie();
    System.out.println(movie1.theater.theaterID);
    
    Booking booking1 = new Booking();
     int b = bookingID.getseatnumb;
     	System.out.println(b);
     booking1.getseatnumb("A1");	


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

}
}



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