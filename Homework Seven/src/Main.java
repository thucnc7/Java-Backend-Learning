import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Room Room1 = new Room();
        Room1.RoomId = "0001";


        Receptionist Recep1 = new Receptionist(0001, 20, "Adam");
        Recep1.Handle(Room1);
        Cleaner cleaner1 = new Cleaner(0002, 39 ,"Negav");
        Management management1 = new Management(0003, 28 , "Lethuc");
        management1.Do();
        }
    }
