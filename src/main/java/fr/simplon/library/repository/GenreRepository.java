package fr.simplon.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.simplon.library.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository <Genre, Long> {
}
