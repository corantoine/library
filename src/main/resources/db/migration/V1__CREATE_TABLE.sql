CREATE TABLE livres(
id int AUTO_INCREMENT PRIMARY KEY,
titre VARCHAR(100) NOT NULL,
auteur VARCHAR(100) NOT NULL,
disponible boolean
);

CREATE TABLE emprunteurs(
id int AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(50) NOT NULL,
prenom VARCHAR(50) NOT NULL

);
CREATE TABLE emprunts(
id int AUTO_INCREMENT PRIMARY KEY,
emprunteur_id INT REFERENCES emprunteurs(id),
livre_id INT REFERENCES livres(id)
);

CREATE TABLE genres(
id int AUTO_INCREMENT PRIMARY KEY,
nom_du_genre VARCHAR(50) NOT NULL
);

