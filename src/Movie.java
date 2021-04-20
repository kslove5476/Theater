public class Movie{
    int movieID = 0101;
    String name = "Frozen";
    String time1 = "09:30";
    String time2 = "12:30";
    String time3 = "15:30";
    room room;

    Movie(){
        
    }

    Movie(room room, int movieID, String name,String time1, String time2, String time3){
        this.movieID = movieID;
        this.name = name;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3; 
        this.room = room;
        addtoMoviewList();
    }
    void addtoMoviewList(){
        Theater myTheater = room.getTheater();
        myTheater.addmovie(this);
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

    
}