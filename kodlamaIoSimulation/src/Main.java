import kodlamaIoSimulation.core.logging.DataBaseLogger;
import kodlamaIoSimulation.core.logging.EmailLogger;
import kodlamaIoSimulation.core.logging.Logger;
import kodlamaIoSimulation.entities.Category;
import kodlamaIoSimulation.entities.Course;
import kodlamaIoSimulation.entities.Educator;
import kodlamaIoSimulation.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Logger> loggers = new ArrayList<>();

        List<Course> courses = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        List<Educator> educators = new ArrayList<>();

        loggers.add(new EmailLogger());
        loggers.add(new DataBaseLogger());

        Educator educator = new Educator(1,"Engin","Demiroğ","engindemirog@gmail.com","0511211111");
        Student student = new Student(1,"Mert","Topal","merrt.topal@gmailcom","05112113111","Maltepe University");
        Course course = new Course(1,"Java Development","Entry level java development",9500);
        Category category = new Category();
        category.setId(1);
        category.setName("paid courses");

        Logger logger = new DataBaseLogger();
        logger.log("AABBCCDD");


    }
}
