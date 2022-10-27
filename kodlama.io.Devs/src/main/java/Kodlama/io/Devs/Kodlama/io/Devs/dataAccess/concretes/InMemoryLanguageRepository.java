package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracs.LanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    private List<Language> languages =new ArrayList<>();

    public InMemoryLanguageRepository() {
        languages.add(new Language(1, "Java"));
        languages.add(new Language(2, "C++"));
        languages.add(new Language(3, "C#"));
        languages.add(new Language(4, "JavaScript"));
        languages.add(new Language(5, "Kotlin"));
        languages.add(new Language(6, "Swift"));

    }



    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language add(Language language) {
        languages.add(language);
        return getById(language.getId());
    }

    @Override
    public void update(Language language, int id) {
        Language language1 = getById(id);
        language1.setName(language.getName());
    }

    @Override
    public void delete(int id) {
        languages.remove(getById(id));
    }

    @Override
    public Language getById(int id) {
        return languages.stream().filter(language -> language.getId()==id).findFirst().get();
    }
}
