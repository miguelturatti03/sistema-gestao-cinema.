# Sistema de Gestão de Cinema

## 📋 Requisitos
- [link para os requisitos](./docs/requisitos.md)

## 📊 Modelagem (UML)
```mermaid 
graph TD
    A[Início] --> B{Possui Vaga?}
    B -- Sim --> C[Registrar Público]
    B -- Não --> D[Erro: Sala Lotada]
    C --> E[Fim]
```
```mermaid 
useCaseDiagram
    actor "Funcionário/Admin" as Admin
    actor "Espectador" as Esp

    Admin --> (Cadastrar Filme/Sessão)
    Admin --> (Registrar Público Diário)
    Admin --> (Gerar Relatórios de Público)
    
    Esp --> (Consultar Filmes e Elenco)
    Esp --> (Verificar Horários de Sessões)
```
```mermaid 
classDiagram
    direction LR
    class Cinema {
        +String nome
        +String endereco
        +int capacidadeTotal
    }
    class Filme {
        +String titulo
        +int duracaoMinutos
        +String genero
        +String diretor
    }
    class Sessao {
        +DateTime horario
        +int publicoRegistrado
    }

    Cinema "1" --> "*" Sessao : possui
    Filme "1" --> "*" Sessao : exibido em
```
```mermaid 
sequenceDiagram
    participant V as View (Console/UI)
    participant C as Controller
    participant S as Service (Regras de Negócio)
    participant R as Repository (SQLite)

    V->>C: Solicita registro de público (idSessao, qtd)
    C->>S: validarERegistrar(idSessao, qtd)
    S->>R: buscarSessao(idSessao)
    R-->>S: retorna dados da Sessão
    Note over S: Verifica se (público + qtd) < capacidade
    S->>R: salvarAlteracao()
    R-->>S: confirmação
    S-->>C: sucesso
    C-->>V: exibe mensagem de sucesso
```

## 💻 Como Executar
1. Clone o repositório
2. Execute o comando `python main.py` ou `java Main`

