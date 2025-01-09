package fr.simplon.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.simplon.library.model.Emprunteur;

@Repository
public interface EmprunteurRepository extends JpaRepository <Emprunteur, Long> {
}
