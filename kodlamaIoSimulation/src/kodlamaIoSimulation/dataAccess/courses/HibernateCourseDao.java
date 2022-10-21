package kodlamaIoSimulation.dataAccess.courses;

import kodlamaIoSimulation.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Course added to Hibernate");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course deleted to Hibernate");
    }
}
