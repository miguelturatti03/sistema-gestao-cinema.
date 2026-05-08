package service;
import model.Sessao;
import repository.SessaoRepository;

public class SessaoService {
    private SessaoRepository repository = new SessaoRepository();

    public void registrarVenda(int idSessao, int novosIngressos) throws Exception {
        Sessao sessao = repository.buscarPorId(idSessao);

        // RN02: Validação de Capacidade
        if (sessao.publicoAtual + novosIngressos > sessao.capacidadeCinema) {
            throw new Exception("ERRO: Capacidade da sala excedida!");
        }

        // RN01: Validação de Intervalo (Lógica de negócio)
        // Aqui o sistema validaria se: (Horário Fim + 20min) < Próxima Sessão
        
        sessao.publicoAtual += novosIngressos;
        repository.salvar(sessao);
    }
}
