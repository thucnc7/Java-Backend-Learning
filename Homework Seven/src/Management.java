public class Management extends Staff implements Human {
    public Management(int Id ,int Age ,String Name){
        this.setAge(Age);
        this.Id = Id;
        this.Name = Name;
        this.JobId = 1;

    }

    @Override
    public void Do(){
        for(Staff Member : StaffList){
            System.out.printf("%s -> Role : %s \n" , Member.Name , Member.Role );
        }
    }
    public void PayrollCalculation(){
        for(Receptionist ReceptionistPerson : Receptionist.ReceptionistList ){
            System.out.printf("Receptionist %s`s salary is : %d \n " , ReceptionistPerson.Name , ReceptionistPerson.Salary() );
        }
    }
    @Override
    public void Showinfo(){

    }
}
