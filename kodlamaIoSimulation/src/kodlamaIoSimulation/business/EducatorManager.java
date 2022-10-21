package kodlamaIoSimulation.business;

import kodlamaIoSimulation.core.logging.Logger;
import kodlamaIoSimulation.entities.Educator;
import kodlamaIoSimulation.dataAccess.educator.EducatorDao;
import java.util.List;

public class EducatorManager implements IEducatorServise{
    private List<Educator> educators;
    private List<Logger>loggers;
    private EducatorDao educatorDao;

    @Override
    public void add(Educator educator) throws Exception {

        educators.add(educator);
        educatorDao.add(educator);

        for(Logger loggerNew:loggers) {
            loggerNew.log("Added new educator: "+ educator.getName());
        }
    }

    @Override
    public void delete(Educator educator) throws Exception {
        for(Logger loggerNew:loggers) {
            loggerNew.log("Deleted educator: "+ educator.getName());
        }

    }
}
