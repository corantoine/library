CREATE TABLE emprunts (
id INT AUTO_INCREMENT PRIMARY KEY,
emprunteur_id INT,
livre_id INT,
FOREIGN KEY (emprunteur_id) REFERENCES emprunteurs(id),
FOREIGN KEY (livre_id) REFERENCES livres(id)
);