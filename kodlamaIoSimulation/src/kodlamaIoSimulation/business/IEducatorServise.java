package kodlamaIoSimulation.business;

import kodlamaIoSimulation.entities.Educator;

public interface IEducatorServise {
    void add(Educator educator) throws Exception;
    void delete(Educator educator)throws Exception;
}
