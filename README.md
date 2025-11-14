# Soluções - Padrões de Projeto (Factory Method e Strategy)

Este repositório contém as implementações em Java para um conjunto de exercícios. O objetivo é demonstrar o uso prático dos padrões **Factory Method** e **Strategy** para resolver problemas comuns de design de software.

---

## Questão 1: Sistema de Logística (Padrão Factory Method)

### O Desafio

A Questão 1 descreve um sistema de logística que precisa criar diferentes tipos de relatórios (diário, semanal, emergencial). Cada relatório tem regras de criação, fontes de dados e formatos distintos. O requisito principal era:

> "projetar o sistema de forma que a criação dos relatórios possa ser **estendida com novos tipos no futuro**, sem alterar o núcleo do sistema."

### A Solução: Padrão Factory Method

O padrão **Factory Method** foi utilizado para resolver este problema.



#### Por que este padrão?

O Factory Method é um padrão de criação que resolve o problema de criar objetos sem especificar a classe exata do objeto que será criado. Ele "delega" a responsabilidade da instanciação para subclasses (as "fábricas").

1.  **Desacoplamento:** O núcleo do sistema (o "Cliente") e a classe abstrata `CriadorRelatorio` não sabem qual relatório concreto está sendo criado. Eles operam apenas com a interface `Relatorio`.
2.  **Extensibilidade (Princípio do Aberto/Fechado):** Este é o ponto-chave. Para adicionar um novo `RelatorioEmergencial`, **não modificamos nenhum código existente**. Nós apenas adicionamos duas novas classes:
    * `RelatorioEmergencial.java` (o novo Produto)
    * `CriadorRelatorioEmergencial.java` (a nova Fábrica)
3.  **Isolamento da Lógica:** A lógica complexa de *como* construir um `RelatorioDiario` (conectar à fonte X, priorizar métrica Y) fica totalmente encapsulada dentro do `CriadorRelatorioDiario`.

#### Componentes Principais no Projeto

* **Produto (Interface):** `Relatorio`
* **Produtos Concretos:** `RelatorioDiario`, `RelatorioSemanal`
* **Criador (Abstrato):** `CriadorRelatorio` (contém o método abstrato `criarRelatorio()`)
* **Criadores Concretos:** `CriadorRelatorioDiario`, `CriadorRelatorioSemanal` (implementam `criarRelatorio()` e retornam um produto específico)

---

## Questão 2: Análise de Investimentos (Padrão Strategy)

### O Desafio

A Questão 2 descreve uma plataforma que precisa calcular o perfil de risco de um cliente usando diferentes abordagens (agressivo, moderado, conservador). Cada abordagem é uma fórmula diferente. O requisito principal era:

> "O software deve permitir que o método de cálculo seja **escolhido dinamicamente em tempo de execução**... sem alterar o fluxo principal de análise."

### A Solução: Padrão Strategy

O padrão **Strategy** foi a escolha ideal para este cenário.



#### Por que este padrão?

O Strategy é um padrão comportamental que permite que você defina uma "família de algoritmos" (as fórmulas de cálculo), coloque cada um em sua própria classe, e torne seus objetos intercambiáveis.

1.  **Encapsulamento de Algoritmos:** Cada fórmula (agressiva, moderada, etc.) é movida para sua própria classe que implementa a interface `EstrategiaCalculoRisco`.
2.  **Intercambialidade:** A classe principal (`AnalisadorDeRisco`) não contém a lógica das fórmulas. Ela apenas *tem uma* (`has-a`) referência à interface `EstrategiaCalculoRisco`.
3.  **Seleção Dinâmica:** Este é o ponto-chave. Usando o método `setEstrategia()`, podemos **trocar o algoritmo de cálculo a qualquer momento** (em tempo de execução), sem precisar de `if/else` complexos no fluxo principal. O `AnalisadorDeRisco` (o "Contexto") continua executando seu método `executarAnalise()` da mesma forma, sem saber qual fórmula está sendo usada.

#### Componentes Principais no Projeto

* **Strategy (Interface):** `EstrategiaCalculoRisco` (define o método `calcular()`)
* **Estratégias Concretas:** `CalculoRiscoAgressivo`, `CalculoRiscoModerado`, `CalculoRiscoConservador`
* **Contexto:** `AnalisadorDeRisco` (a classe que guarda uma referência à *Strategy* e a utiliza, permitindo a troca com `setEstrategia()`)

---

## Como Executar

1.  Clone este repositório.
2.  Abra o projeto em sua IDE Java preferida (IntelliJ, Eclipse, VS Code).
3.  Localize os arquivos `Main.java` de cada questão.
4.  Execute o `Main` da Questão 1 para ver o **Factory Method** em ação.
5.  Execute o `Main` da Questão 2 para ver o **Strategy** em ação.
