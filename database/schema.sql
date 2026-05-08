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
    diretor TEXT,
    elenco TEXT
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

-- Exemplo de dados para teste no final do schema.sql
INSERT INTO cinemas (nome, capacidade) VALUES ('Cine Centro', 100);
INSERT INTO filmes (titulo, duracao, genero, diretor) VALUES ('Interstellar', 169, 'Ficção', 'Christopher Nolan');
INSERT INTO sessoes (id_filme, id_cinema, horario, publico_atual) VALUES (1, 1, '2023-12-01 19:00:00', 0);
