import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while(true){
            int selectedMenu=0;
            Manager manager = new Manager();
            
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
                    manager.theater1.displaymovie();
                    break;
            
                case 2:
                    System.out.println("______________    2. Booking Movies      ______________");
                    manager.theater1.displaymovie();
                    //-------------------Select Movie-----------------------
                    int slectedMovieID=0;
                    System.out.println("select movie ID:");
                    try {
                        slectedMovieID = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Please insert right input. Number only allowed(4 digits).");
                    }
                    if(slectedMovieID.matches(slectedMovieID)){
                        System.out.println("Your Movie : ID-"+slectedMovieID+);
                    }else{
                    	System.out.println("Please insert right input. For example, '0101'. Number only allowed, without any characters, Special characters or spacing");
                    }

                    //-------------------Select Time-----------------------
                    System.out.println("select movie time(dd:dd):");
                    String slectedTime;
                    try {
                        sc.nextLine();
                        slectedTime = sc.nextLine();
                        if(slectedTime.matches("\\d{2}:\\d{2}")){
                            System.out.println("Your Movie : ID-"+slectedMovieID+", Time: "+slectedTime);
                        }else{
                            throw new IllegalAccessError();
                        }
                            
                    } catch (Exception e) {
                        System.out.println("Please insert right input.(dd:dd).");
                    }
                    //-------------------Select Seats-----------------------
                    Movie selectedMovie = new Movie;
                    selectMovie.getroom().display();
                    system.out.println("select row:");
                    system.out.println("select column:");
                    Booking booking = new Booking(int bookingID, Movie movie, String seatNumb, String time);
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
