CREATE TABLE IF NOT EXISTS cinemas (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    capacidade INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS filmes (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    titulo TEXT NOT NULL,
    duracao INTEGER NOT NULL,
    genero TEXT
);

CREATE TABLE IF NOT EXISTS sessoes (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_filme INTEGER,
    id_cinema INTEGER,
    horario DATETIME,
    publico_atual INTEGER DEFAULT 0,
    FOREIGN KEY (id_filme) REFERENCES filmes(id),
    FOREIGN KEY (id_cinema) REFERENCES cinemas(id)
);
