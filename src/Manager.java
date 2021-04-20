public class Manager {

    public Theater theater1;
    public room room_1th_1;
    public room room_1th_2;
    public Movie movie1;
    public Movie movie2;
    public Movie movie3;

    Manager(){
        //System Manager can add theater, room, moview //
        theater1 = new Theater(1000, "Sydney", "0404-434-112");
        room_1th_1= new room(theater1,"lion",1001);
        room_1th_2= new room(theater1,"rabbit",1002);
        movie1 = new Movie(room_1th_1, 1020, "Avengers", "09:30", "12:30", "15:30");
        movie2 = new Movie(room_1th_1, 1030, "Lord of Rings", "11:30", "15:30", "18:00");
        movie3 = new Movie(room_1th_2, 1040, "Frozen", "15:00", "14:30", "17:00");
    }
}
