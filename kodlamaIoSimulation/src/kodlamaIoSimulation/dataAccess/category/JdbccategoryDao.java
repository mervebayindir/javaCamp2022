package kodlamaIoSimulation.dataAccess.category;

import kodlamaIoSimulation.entities.Category;

public class JdbccategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Category added to JDBC");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Category deleted to JDBC");
    }

}
