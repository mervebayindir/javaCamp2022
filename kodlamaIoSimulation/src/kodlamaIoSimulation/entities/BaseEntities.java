package kodlamaIoSimulation.entities;

public class BaseEntities {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public BaseEntities setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BaseEntities setName(String name) {
        this.name = name;
        return this;
    }
}
