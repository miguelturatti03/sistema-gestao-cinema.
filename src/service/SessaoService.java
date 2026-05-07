package service;
import model.Sessao;
import repository.SessaoRepository;

public class SessaoService {
    private SessaoRepository repository = new SessaoRepository();

    public void registrarVenda(int idSessao, int novosIngressos) throws Exception {
        Sessao sessao = repository.buscarPorId(idSessao);

        // REGRA DE NEGÓCIO: Não pode vender mais que a capacidade
        if (sessao.publicoAtual + novosIngressos > sessao.capacidadeCinema) {
            throw new Exception("ERRO: Capacidade da sala excedida!");
        }

        sessao.publicoAtual += novosIngressos;
        repository.salvar(sessao);
    }
}
