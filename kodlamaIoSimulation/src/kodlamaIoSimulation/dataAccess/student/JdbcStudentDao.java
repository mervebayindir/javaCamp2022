package kodlamaIoSimulation.dataAccess.student;

import kodlamaIoSimulation.entities.Student;

public class JdbcStudentDao implements StudentDao{
    @Override
    public void add(Student student) {
        System.out.println("Student added to Jdbc"+ student.getName());
    }

    @Override
    public void delete(Student student) {
        System.out.println("Student deleted to Jdbc"+ student.getName());

    }
}
