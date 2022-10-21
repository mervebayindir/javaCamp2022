package kodlamaIoSimulation.dataAccess.category;

import kodlamaIoSimulation.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Category added to Hibernate");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Category deleted to Hibernate");
    }

}
