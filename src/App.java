import java.util.Scanner;

class Theater {
    int theaterID = 10109;
    String name = "CGV Sydney";
    String phoneNumber = "0499-502-201";
    
    //constructor is the method with same name of class
    Theater(int ID, String name, String phonenumb){
        theaterID = ID;
        name = name;
        phonenumb = phoneNumber;
    }
    
    int getID(){
        return this.theaterID;
    }

    String getName(){
        return this.name;
    }

    void setID(int input){
        theaterID = input;
    }
    
}

class room{
    String[][] seats = new String[8][10];
}
class Movie{
    int MovieID = 1;
    String Name = "Default Movie Name";
    String Time1 = "00:00";
    String Time2 = "00:00";
    String Time3 = "00:00";

    Theater theater;

    //make constructor
    //constructor implementation is recommendation

}

class Booking{
    //make constructor
    //constructor implementation is recommendation
}

public class App {
    public static void main(String[] args) throws Exception {
    
    Theater theater1 = new Theater(19192, "CGV_Melb", "0404-411-221");

    int a = theater1.getID();    
        System.out.println(a);
    theater1.setID(10108);
    
    // reference
    Movie movie1 = new Movie();
    System.out.println(movie1.theater.theaterID);


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