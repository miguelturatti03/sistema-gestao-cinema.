package repository;
import model.Sessao;

public class SessaoRepository {
    public Sessao buscarPorId(int id) {
        // Aqui viria o SELECT * FROM sessoes no SQLite
        // Retornando uma sessão fictícia para teste (ID 1, Cap: 100, Atual: 50)
        return new Sessao(id, 100, 50);
    }

    public void salvar(Sessao sessao) {
        // Aqui viria o UPDATE sessoes SET publico_atual = ...
        System.out.println("Banco de Dados: Público atualizado para " + sessao.publicoAtual);
    }
}
