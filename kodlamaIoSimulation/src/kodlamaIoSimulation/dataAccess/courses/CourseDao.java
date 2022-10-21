package kodlamaIoSimulation.dataAccess.courses;


import kodlamaIoSimulation.entities.Course;

public interface CourseDao {
    void add(Course course);
    void delete(Course course);
}
