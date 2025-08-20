import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Room Room1 = new Room("0001",2);
        Room Room2 = new Room("0002",1);
        Room Room3 = new Room("0003",4);
        Receptionist Recep1 = new Receptionist(0001, 20, "Adam");
        Receptionist Recep2 = new Receptionist(0002, 18, "Huong");
        Recep1.Handle(Room1);
        Recep1.Handle(Room2);
        Recep2.Handle(Room3);
        Cleaner cleaner1 = new Cleaner(0002, 39 ,"Negav");
        Management management1 = new Management(0003, 28 , "Lethuc");
        management1.Do();
        management1.PayrollCalculation();
        }
    }
