package kodlamaIoSimulation.business;

import kodlamaIoSimulation.entities.Category;


public interface ICategoryServise {
    public void add(Category category)throws Exception;
    public void delete(Category category)throws Exception;

}
