package fr.simplon.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.simplon.library.model.Livre;

public interface LivreRepository extends JpaRepository <Livre, Long> {
}
