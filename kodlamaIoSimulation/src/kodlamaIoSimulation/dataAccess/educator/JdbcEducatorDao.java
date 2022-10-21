package kodlamaIoSimulation.dataAccess.educator;

import kodlamaIoSimulation.entities.Educator;

public class JdbcEducatorDao implements EducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Educator added to Jdbc");
    }

    @Override
    public void delete(Educator educator) {
        System.out.println("Educator deleted to JDBC");

    }
}
