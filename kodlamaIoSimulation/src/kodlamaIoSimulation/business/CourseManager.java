package kodlamaIoSimulation.business;

import kodlamaIoSimulation.core.logging.Logger;
import kodlamaIoSimulation.dataAccess.courses.CourseDao;
import kodlamaIoSimulation.entities.Course;
import kodlamaIoSimulation.entities.Category;

import java.util.List;

public class CourseManager implements ICourseService{
        private List<Course> courses;
        private List<Logger> loggers;
        private CourseDao courseDao;

    public CourseManager(List<Course> courses, List<Logger> loggers, CourseDao courseDao) {
        this.courses = courses;
        this.loggers = loggers;
        this.courseDao = courseDao;
    }

    @Override
    public void add(Course course) throws Exception {
        for(Course newCourse: courses){
            if(newCourse.getName().equals(course.getName())){
                throw new Exception("Please Add new course.");
            }
        }
        if(course.getPrice()<0){
            throw new Exception("Price have to be greater than zero.");
        }
        courses.add(course);
        for (Logger loggerNew: loggers){
            loggerNew.log("New course added: "+ course.getName());
        }
        courses.add(course);
        courseDao.add(course);


    }

    @Override
    public void delete(Course course) throws Exception {
        courseDao.delete(course);
        for(Logger loggerNew:loggers) {
            loggerNew.log("Deleted course : "+ course.getName());
        }

    }
}
