public class room {
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