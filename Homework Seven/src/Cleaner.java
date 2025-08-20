
public class Cleaner extends Staff implements Human{


    public Cleaner(int Id ,int Age ,String Name){
        this.setAge(Age);
        this.Id = Id;
        this.Name = Name;
        StaffList.add(this);
        this.Role = "Cleaner";
        this.JobId = 3;

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
    }
}
