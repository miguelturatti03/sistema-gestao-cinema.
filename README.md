# Sistema de Gestão de Cinema

## 📋 Requisitos
- [link para os requisitos](./docs/requisitos.md)

## 📊 Modelagem (UML)
```mermaid 
---
title: Diagrama de Classes (Domínio)
---
classDiagram
    class Cinema {
        +String nome
        +int capacidade
    }
    class Filme {
        +String titulo
        +int duracao
        +String diretor
        +String elenco
    }
    class Sessao {
        +DateTime horario
        +int publicoAtual
    }
    Cinema "1" -- "*" Sessao
    Filme "1" -- "*" Sessao
```
```mermaid
---
title: Diagrama de Sequência (Registrar Público)
---
sequenceDiagram
    participant V as View
    participant C as SessaoController
    participant S as SessaoService
    participant R as SessaoRepository
    
    V->>C: adicionarPublico(id, qtd)
    C->>S: registrarVenda(id, qtd)
    S->>R: buscarPorId(id)
    R-->>S: retorna Sessao
    Note over S: Valida Capacidade (RN02)
    S->>R: salvar(sessao)
    R-->>S: confirmação
    S-->>C: sucesso
    C-->>V: exibe "Público registrado!"
```

## 💻 Como Executar
1. Clone o repositório
2. Execute o comando `python main.py` ou `java Main`

