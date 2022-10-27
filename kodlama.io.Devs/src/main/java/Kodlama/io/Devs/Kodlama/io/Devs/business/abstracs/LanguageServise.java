package Kodlama.io.Devs.Kodlama.io.Devs.business.abstracs;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageServise {

    List<Language> getAll();
    public Language add(Language language) throws Exception;
    public void update(Language language, int id ) throws Exception;
    public void delete(int id) throws Exception;
    public Language getById(int id)throws Exception;


}
