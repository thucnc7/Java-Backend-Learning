import javax.management.relation.Role;
import javax.xml.transform.Source;
import java.util.Vector;

public class Receptionist extends Staff implements Human {

    // Static Variable
    static int SalaryCoefficient = 2 ;
    public static Vector<Receptionist> ReceptionistList = new Vector<>();
    //

    public Vector<Room> RoomList = new Vector<>();
    void Handle(Room RoomId){
        RoomList.add(RoomId);
    }

    public Receptionist(int Id ,int Age ,String Name){

        this.setAge(Age);
        this.Id = Id;
        this.Name = Name;
        this.JobId = 2;
        StaffList.add(this);
        ReceptionistList.add(this);

        Role = "Receptionist";
    }
    void Show(){
            System.out.printf("Reception %s is in charge of rooms : ", super.Name);
        for(Room R : RoomList){
            System.out.printf("Room %s ,",R.RoomId);
        }
    }

    public Integer Salary(){
        int salary = 0;
        for(Room Roomid : RoomList){
            salary += Room.RoomPriceList[Roomid.RoomType - 1];
        }
        return salary;
    }
    @Override
    public void Do(){
        System.out.println("Im just doing my job bro !!! Stop annoying me !!!");
    }

    @Override
    public void Showinfo(){
        System.out.println("My name is " + Name);
        System.out.println("My ID is : " + Id);
        System.out.printf("Iam %d years old \n " ,getAge() );
        Show();
    }
}
