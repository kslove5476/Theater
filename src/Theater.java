public class Theater {
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
    
    void displaymovie(){
        String format = "%-10s%-12s%-20s%-10s%-10s%-10s%n";
        System.out.printf(format, "ID","roomname","movie name","time1","time2","time3");
        for(int i = 0 ; i < currentMovies ; i++){
            int moviewID =movielist[i].getmovieID();
            String roomname = movielist[i].getroom().getName();
            String moviewname = movielist[i].getname();
            String movietime1 = movielist[i].gettime1();
            String movietime2 = movielist[i].gettime2();
            String movietime3 = movielist[i].gettime3();
            System.out.printf(format, moviewID,roomname,moviewname,movietime1,movietime2,movietime3);
        }
    }

    void addmovie(Movie movie)
    {
        this.movielist[currentMovies]=movie;
        this.currentMovies++;
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
}