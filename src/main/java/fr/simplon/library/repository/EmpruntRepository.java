package fr.simplon.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.simplon.library.model.Emprunt;

@Repository
public interface EmpruntRepository extends JpaRepository <Emprunt, Long> {
}
