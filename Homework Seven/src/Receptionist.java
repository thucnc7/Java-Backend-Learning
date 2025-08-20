import javax.management.relation.Role;
import javax.xml.transform.Source;
import java.util.Vector;

public class Receptionist extends Staff implements Human {

    // Static Variable
    static int SalaryCoefficient = 2 ;

    //

    Vector<Room> RoomList = new Vector<>();
    void Handle(Room RoomId){
        RoomList.add(RoomId);
    }

    public Receptionist(int Id ,int Age ,String Name){
        this.setAge(Age);
        this.Id = Id;
        this.Name = Name;
        StaffList.add(this);
        Role = "Receptionist";
    }
    void Show(){
            System.out.printf("Reception %s is in charge of rooms : ", super.Name);
        for(Room R : RoomList){
            System.out.printf("Room %s ,",R.RoomId);
        }
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
