package controller;
import service.SessaoService;

public class SessaoController {
    private SessaoService service = new SessaoService();

    public String adicionarPublico(int id, int qtd) {
        try {
            service.registrarVenda(id, qtd);
            return "Sucesso: Público registrado!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
