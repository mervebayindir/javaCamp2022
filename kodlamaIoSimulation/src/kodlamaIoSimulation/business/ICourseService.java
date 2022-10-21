package kodlamaIoSimulation.business;
import kodlamaIoSimulation.entities.Course;
public interface ICourseService {
    public void add(Course course)throws Exception;
    public void delete(Course course)throws Exception;

}
