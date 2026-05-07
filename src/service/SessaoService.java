# A camada Service aplica as Regras de Negócio (RN)
def registrar_publico(sessao_id, quantidade_nova):
    # 1. Busca os dados no banco via Repository
    sessao = sessao_repository.buscar_por_id(sessao_id)
    cinema = cinema_repository.buscar_por_id(sessao.cinema_id)
    
    # 2. Aplica a Regra de Negócio RN02 (Capacidade)
    if (sessao.publico_atual + quantidade_nova) > cinema.capacidade:
        print("Erro: A sala não suporta essa quantidade de pessoas!")
        return False
    
    # 3. Se estiver ok, manda o Repository salvar
    sessao.publico_atual += quantidade_nova
    sessao_repository.atualizar(sessao)
    return True
