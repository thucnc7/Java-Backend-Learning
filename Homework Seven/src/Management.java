public class Management extends Staff implements Human {
    public Management(int Id ,int Age ,String Name){
        this.setAge(Age);
        this.Id = Id;
        this.Name = Name;
    }

    @Override
    public void Do(){
        for(Staff Member : StaffList){
            System.out.printf("%s -> Role : %s \n" , Member.Name , Member.Role );
        }
    }
    @Override
    public void Showinfo(){

    }
}
