import java.lang.reflect.Array;

public class Room {
    public String RoomId;
    public static String[] RoomTypeList = new String[]{"President", "Luxary", "Standard", "Econo"};
    public static Integer[] RoomPriceList = new Integer[]{10000,1000,100,10};
    public int RoomType;
    public Room(String RoomId , int RoomType){
        this.RoomId =RoomId;
        this.RoomType = RoomType;
    }
    public Room(){

    }
}
