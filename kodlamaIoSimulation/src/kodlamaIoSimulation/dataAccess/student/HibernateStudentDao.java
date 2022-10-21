package kodlamaIoSimulation.dataAccess.student;

import kodlamaIoSimulation.entities.Student;

public class HibernateStudentDao implements StudentDao{
    @Override
    public void add(Student student) {
        System.out.println("Student added to Hibernate"+ student.getName());
    }

    @Override
    public void delete(Student student) {
        System.out.println("Student deleted to Hibernate"+ student.getName());
    }
}
