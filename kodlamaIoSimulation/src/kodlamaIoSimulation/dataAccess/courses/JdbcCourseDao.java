package kodlamaIoSimulation.dataAccess.courses;

import kodlamaIoSimulation.entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Course added to Jdbc");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course deleted to Jdbc");
    }
}
