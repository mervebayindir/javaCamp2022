package kodlamaIoSimulation.dataAccess.educator;

import kodlamaIoSimulation.entities.Educator;

public class HibernateEducatorDao implements EducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Educator added to Hibernate");

    }

    @Override
    public void delete(Educator educator) {
        System.out.println("Educator deleted to Hibernate");
    }
}
