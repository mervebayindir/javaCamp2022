package kodlamaIoSimulation.business;

import kodlamaIoSimulation.core.logging.Logger;
import kodlamaIoSimulation.entities.Student;
import kodlamaIoSimulation.dataAccess.student.StudentDao;
import java.util.List;

public class StudentManager implements IStudentServise{
    private List<Student> students;
    private List<Logger> loggers;
    private StudentDao studentDao;

    public StudentManager(List<Student> students, List<Logger> loggers, StudentDao studentDao) {
        this.students = students;
        this.loggers = loggers;
        this.studentDao = studentDao;
    }

    @Override
    public void add(Student student) throws Exception {

        students.add(student);
        studentDao.add(student);
        for(Logger loggerNew:loggers) {
            loggerNew.log("Added new student: "+ student.getName());
        }

    }

    @Override
    public void delete(Student student) throws Exception {
        studentDao.delete(student);
        for(Logger loggerNew:loggers) {
            loggerNew.log("Deleted new student: "+ student.getName());
        }
    }
}
