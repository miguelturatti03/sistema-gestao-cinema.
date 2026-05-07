package model;

public class Sessao {
    public int id;
    public int capacidadeCinema;
    public int publicoAtual;
    
    // Construtor simples
    public Sessao(int id, int capacidade, int atual) {
        this.id = id;
        this.capacidadeCinema = capacidade;
        this.publicoAtual = atual;
    }
}
