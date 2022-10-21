package kodlamaIoSimulation.business;

import kodlamaIoSimulation.core.logging.Logger;
import kodlamaIoSimulation.entities.Category;
import kodlamaIoSimulation.dataAccess.category.CategoryDao;
import java.util.List;

public class CategoryManager implements ICategoryServise{
    private List<Category> categories;
    private List<Logger> loggers;
    private CategoryDao categoryDao;

    public CategoryManager(List<Category> categories, List<Logger> loggers,CategoryDao categoryDao) {
        this.categories = categories;
        this.loggers = loggers;
        this.categoryDao = categoryDao;
    }

    @Override
    public void add(Category category) throws Exception {
        for(Category newCategory:categories) {
            if(newCategory.getName().equals(category.getName())){
                throw new Exception("Please add new course.");
            }
        }
        categories.add(category);
        categoryDao.add(category);


        for (Logger loggerNew: loggers){
            loggerNew.log("New category added: "+ category.getName());
        }


    }

    @Override
    public void delete(Category category) throws Exception {
        categoryDao.delete(category);
        for(Logger loggerNew:loggers) {
            loggerNew.log("Deleted category: "+ category.getName());
        }

    }
}
