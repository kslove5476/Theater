import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        while(true){
            int selectedMenu=0;
            Manager manager = new Manager();
            
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
                    manager.theater1.displaymovie();
                    break;
            
                case 2:
                    System.out.println("______________    2. Booking Movies      ______________");
                    manager.theater1.displaymovie();
                    //-------------------Select Movie-----------------------
                    int selectedMovieID=0;
                    System.out.println("select movie ID:");
                    try {
                        selectedMovieID = sc.nextInt();
                        System.out.println("Your Movie : ID-"+selectedMovieID);
                    } catch (Exception e) {
                        System.out.println("Please insert right input. Number only allowed(4 digits)(without any characters, Special characters or spacing)");
                        
                    }
                    
                    //-------------------Select Time-----------------------
                    System.out.println("select movie time(dd:dd):");
                    String selectedTime = "";
                    try {
                        sc.nextLine();
                        selectedTime = sc.nextLine();
                        if(selectedTime.matches("\\d{2}:\\d{2}")){
                            System.out.println("Your Movie : ID-"+selectedMovieID+", Time: "+selectedTime);
                        }else{
                            throw new IllegalAccessError();
                        }
                            
                    } catch (Exception e) {
                        System.out.println("Please insert right input.(dd:dd).");
                    }
                    //-------------------Select Seats-----------------------
                    // get selected movie
                    Movie selectedMovie =new Movie();
                    if(manager.movie1.getmovieID() == selectedMovieID){
                        selectedMovie=manager.movie1;
                    }else if(manager.movie2.getmovieID() == selectedMovieID){
                        selectedMovie=manager.movie2;
                    }else if(manager.movie3.getmovieID() == selectedMovieID){
                        selectedMovie=manager.movie3;
                    }else{
                        System.out.println("Something wrong");
                    }
                    
                    // Display Room Seats status
                    selectedMovie.getroom().displayseat();

                    // Row selection
                    System.out.println("select row (1~8):");
                    int selectedrow=0;
                    try {
                        // sc.nextLine();
                        selectedrow = sc.nextInt();
                        // System.out.println("selectedrow="+selectedrow);
                        if(selectedrow<1 || selectedrow >8){ //out of bound case
                            throw new IllegalAccessError();
                        }    
                    } catch (Exception e) {
                        System.out.println("Please insert right input.(just 1 number only).");
                    }

                    // Column selection
                    System.out.println("select column (A~H):");
                    String selectedcolumn="";
                    try {
                        sc.nextLine();
                        selectedcolumn = sc.nextLine();
                        // System.out.println("[debug]selectedcolumn="+selectedcolumn);
                        if(selectedcolumn.equals("A") || 
                        selectedcolumn.equals("B") ||
                        selectedcolumn.equals("C") ||
                        selectedcolumn.equals("D") ||   
                        selectedcolumn.equals("E") || 
                        selectedcolumn.equals("F") || 
                        selectedcolumn.equals("G") ||
                        selectedcolumn.equals("H") || 
                        selectedcolumn.equals("a") || 
                        selectedcolumn.equals("b") || 
                        selectedcolumn.equals("c") || 
                        selectedcolumn.equals("d") || 
                        selectedcolumn.equals("e") || 
                        selectedcolumn.equals("f") || 
                        selectedcolumn.equals("g") ||
                        selectedcolumn.equals("h")){
                            
                        }else{
                            throw new IllegalAccessError();
                        }
                    } catch (Exception e) {
                        System.out.println("Please insert right input.(just 1 character only(A~H)).");
                    }

                    // create seatNumb
                    String selectedseat = new String(selectedcolumn+Integer.toString(selectedrow));

                    // Booking Creation
                    int bookingID = ThreadLocalRandom.current().nextInt(104821, 999999+1);
                    Booking booking = new Booking(selectedMovie, bookingID,selectedseat, selectedTime);
                    break;

                case 3:
                    System.out.println("______________          3. Exit          ______________");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please insert right input. Number only allowed. For example, to select 3. Exit, just insert 3");
                    break;
            }
        }
    }
}
