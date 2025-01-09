package fr.simplon.library.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.simplon.library.model.Livre;
import fr.simplon.library.repository.LivreRepository;


@RestController
@RequestMapping("/livres")
public class LivreController {
private final LivreRepository livreRepository;

public LivreController(LivreRepository livreRepository){
    this.livreRepository = livreRepository;
}
    @PostMapping
    public Livre addNewBook(@RequestBody Livre livre){
        return livreRepository.save(livre);
    }

}
