package Kodlama.io.Devs.Kodlama.io.Devs.wepApi.controllers;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracs.LanguageServise;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private LanguageServise languageServise;


    @Autowired
    public LanguagesController(LanguageServise languageServise) {
        this.languageServise = languageServise;
    }


    @GetMapping
    public List<Language> getAll(){
        return languageServise.getAll();
    }

    @GetMapping("/{id}")
    public Language getByid(@PathVariable(name = "id")int id) throws Exception {
       return languageServise.getById(id);
    }

    @PostMapping
    public Language add(@RequestBody Language language) throws Exception {
        return languageServise.add(language);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) throws Exception {
        languageServise.delete(id);
        return ("Silindi");
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable int id,@RequestBody Language language) throws Exception {
        languageServise.update(language, id);
        //spring exeption handler
    }




}
