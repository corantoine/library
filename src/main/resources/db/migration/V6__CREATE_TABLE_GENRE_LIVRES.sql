CREATE TABLE genre_livres (
    id INT AUTO_INCREMENT PRIMARY KEY,
    livre_id INT,
    genre_id INT,
    FOREIGN KEY (livre_id) REFERENCES livres(id),
    FOREIGN KEY (genre_id) REFERENCES genres(id)
);