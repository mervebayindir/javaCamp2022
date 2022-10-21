package kodlamaIoSimulation.dataAccess.student;

import kodlamaIoSimulation.entities.Student;

public interface StudentDao {
    void add(Student student);

    void delete(Student student);
}
