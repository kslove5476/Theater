package Theater_main;
import java.util.Scanner;
class theater{
	 boolean[][] seat = new boolean[8][10];
	    char column;
	    int colunmint;
	    int row1;

	    //    A  B  C  D  E  F  G  H
	    // 1 [] [] [] [] [] [] [] []
	    // 2 [] [] [] [] [] [] [] []
	    // 3 [] [] [] [] [] [] [] []
	    // 4 [] [] [] [] [] [] [] []
	    // 5 [] [] [] [] [] [] [] []
	    // 6 [] [] [] [] [] [] [] []
	    // 7 [] [] [] [] [] [] [] []
	    // 8 [] [] [] [] [] [] [] []
	    // 9 [] [] [] [] [] [] [] []
	    // 10 [] [] [] [] [] [] [] []

	    // initialise seat
	    public void initseat(){
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 10; j++) {
	                seat[i][j] = true;
	            }
	        }
	    }

	    // user input
	    public void inputScanner() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("please enter seat colunm A~H :");
	        String colunms = sc.nextLine();
	        column = colunms.charAt(0);// get the first char of the string
	        System.out.println("please enter seat row 1~10 :");
	        row1 = sc.nextInt();
	        sc.close();
	    }

	    // convert column string input into int
	    public void columnconvert() {
	        // int columnconvert = 0;
	        
	        switch (column) {
	            case 'A', 'a':
	                colunmint = 0;
	                break;
	            case 'B', 'b':
	                colunmint = 1;
	                break;
	            case 'C', 'c':
	                colunmint = 2;
	                break;
	            case 'D', 'd':
	                colunmint = 3;
	                break;
	            case 'E', 'e':
	                colunmint = 4;
	                break;
	            case 'F', 'f':
	                colunmint = 5;
	                break;
	            case 'G', 'g':
	                colunmint = 6;
	                break;
	            case 'H', 'h':
	                colunmint = 7;
	                break;
	        }
	    }

	    // change status of selected seat
	    public void selectedseat() {
	        columnconvert();
	        if (seat[colunmint][row1 - 1] == true) {
	            System.out.println("reservation completed!");
	            seat[colunmint][row1 - 1] = false;
	            displayseat();
	        } else {
	            System.out.println("Please try to select other seat.");
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

	    // utilize return & parameter -> make all functions as method and edit main
	    // method to simple
	    // display input seat
	    public void displayinputseat() {
	        System.out.println("your selection is " + column + row1);
	    }

	}

	public class App {
	    public static void main(String[] args) throws Exception {
	    
	    theater theater1 = new theater ();

		//initialize all seats
	    theater1.initseat();
	    //display all seat status.
	    theater1.displayseat();
	    //Choice seat and input seat.
	    theater1.inputScanner();
	    //display your input seat status.
	    theater1.displayinputseat();
	    //select your seat.
	    theater1.selectedseat();

	}
	}

