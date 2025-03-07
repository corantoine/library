package fr.simplon.library.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Genre{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomDuGenre;

}

