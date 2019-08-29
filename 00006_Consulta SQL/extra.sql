CREATE TABLE bandas (id_banda INTEGER PRIMARY KEY, nombre TEXT);

CREATE TABLE discos (id_disco INTEGER PRIMARY KEY, 
  titulo_disco TEXT, 
  anio_de_salida INTEGER,
  id_banda INTEGER,
  FOREIGN KEY (id_banda) REFERENCES bandas(id_banda));
  
CREATE TABLE canciones (id_cancion INTEGER PRIMARY KEY, 
  titulo_cancion TEXT, 
  duracion REAL,
  id_disco INTEGER,
  FOREIGN KEY (id_disco) REFERENCES discos(id_disco));

INSERT INTO bandas VALUES
(1, "Seru Giran"), 
(2, "Sui Generis"),
(3, "Los Piojos");


INSERT INTO discos VALUES 
(1, "Bicicleta", 1980, 1),
(2, "Peperina", 1981, 1),
(3, "Pequeñas anécdotas sobre las instituciones", 1974, 2),
(4, "Verde paisaje del infierno", 2000, 3);

INSERT INTO canciones VALUES
(1, "Canción de Alicia en el país", 4.24, 1),
(2, "A los jóvenes de ayer", 9.29, 1),
(3, "Peperina", 3.40, 2),
(4, "Cinema Verité", 4.53, 2),
(5, "Salir de la melancolía", 2.06, 2),
(6, "Instituciones", 4.51, 3),
(7, "Juan Represión", 3.28, 3),
(8, "Vine hasta aquí", 4.38, 4),
(9, "Morella", 4.12, 4),
(10, "La luna y la cabra", 3.30, 4);

