package Kodlama.io.Devs.Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracs.LanguageServise;
import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracs.LanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageMenager implements LanguageServise {
    private LanguageRepository languageRepository;


    public LanguageMenager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;

    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language add(Language language) throws Exception {
        if(isIdExist(language.getId())) throw new Exception("İd tekrar edemez.");
        if(isNameExist(language))throw new Exception("İsim tekrar edemez");
        return languageRepository.add(language);

    }

    @Override
    public void update(Language language,int id) throws Exception {
        if(!isIdExist(language.getId())) throw new Exception("İd bulunamadı");
        if(isNameExist(language))throw new Exception("İsim tekrar edemez");
        languageRepository.update(language,id);
    }

    @Override
    public void delete(int id) throws Exception {
        if(!isIdExist(id)) throw new Exception("İd bulunamadı.");
        languageRepository.delete(id);

    }

    @Override
    public Language getById(int id) throws Exception {
        if(!isIdExist(id))throw new Exception("id bulunamadı");
        return languageRepository.getById(id);
    }

    public boolean isNameExist(Language language){
        for(Language language1: getAll()){
            if(language.getName().equalsIgnoreCase(language1.getName())){
                return true;
            }
        }return false;

    }
    public boolean isIdExist(int id){
        for (Language language1: getAll()){
            if (language1.getId()==id){
                return true;
            }
        }return false;

    }
}
