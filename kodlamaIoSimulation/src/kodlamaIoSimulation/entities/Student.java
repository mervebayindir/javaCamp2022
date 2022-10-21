package kodlamaIoSimulation.entities;

public class Student extends BasePersonEntities{
    String university;

    public Student(int id,String name,String lastName,String emailAdress,String telephoneNumber,String university) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.emailAdress = emailAdress;
        this.telephoneNumber = telephoneNumber;
        this.university = university;
    }
}
