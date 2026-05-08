1. Requisitos Funcionais (O que o sistema faz)
RF01: Cadastrar filmes com duração, gênero e elenco.

RF02: Cadastrar sessões vinculando filme e cinema.

RF03: Registrar o público presente em cada sessão.

RF04: Emitir relatório de totalização de público por filme.

2. Regras de Negócio (As restrições)
RN01 (Intervalo): Deve haver um intervalo de 20 minutos entre sessões na mesma sala para limpeza.

RN02 (Capacidade): O público registrado não pode ser maior que a capacidade total da sala.

### Mapeamento de Implementação
- **Camada Model:** Localizada em `src/model/`, define as entidades do banco.
- **Camada Repository:** Localizada em `src/repository/`, responsável pela persistência no SQLite.
- **Camada Service:** Localizada em `src/service/`, onde residem as Regras de Negócio (RN01 e RN02).
- **Camada Controller:** Localizada em `src/controller/`, intermediando a View e o Service.
