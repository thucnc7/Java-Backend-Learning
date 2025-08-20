import java.util.Vector;

public abstract class  Staff {
    public int SalaryCoefficent ;
    public String Role ;
    public int Id ;
    private int Age;
    protected  String Name ;
    public static Vector<Staff> StaffList = new Vector<>();
    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        if(Age >= 18){
            this.Age = Age;
        }
    }
    public abstract void Do();
}
