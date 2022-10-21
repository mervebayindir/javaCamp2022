package kodlamaIoSimulation.entities;

public class Educator extends BasePersonEntities{
    String lastName;


    public Educator(int id,String name,String lastName,String emailAdress,String telephoneNumber) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.emailAdress = emailAdress;
        this.telephoneNumber = telephoneNumber;
    }
}
