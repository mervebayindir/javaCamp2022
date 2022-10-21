package kodlamaIoSimulation.entities;

public class Course extends BaseEntities{
    String description;
    int price;

    public String getDescription() {
        return description;
    }

    public Course setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Course setPrice(int price) {
        this.price = price;
        return this;
    }

    public Course(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;

    }
}
