package kodlamaIoSimulation.business;


import kodlamaIoSimulation.entities.Student;

public interface IStudentServise {
    public void add(Student student)throws Exception;
    public void delete(Student student)throws Exception;
}
