package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracs;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface LanguageRepository {
    List<Language> getAll();
    public Language add(Language language);
    public void update(Language language, int id);
    public void delete(int id);
    public Language getById(int id);

}
