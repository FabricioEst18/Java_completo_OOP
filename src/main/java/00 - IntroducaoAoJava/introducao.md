# 🚀 Introdução ao Ecossistema Java

Este documento contém os fundamentos teóricos abordados no início do curso, essenciais para entender como o Java funciona, suas versões e a estrutura básica de desenvolvimento.

---

## 📅 Versões e Edições do Java

O Java evoluiu de uma linguagem de nicho para o padrão do mercado corporativo.

### O que é Java SE?
**SE (Standard Edition)** é a Edição Padrão. É a plataforma base para criar aplicativos em desktops e servidores, oferecendo os recursos essenciais da linguagem.

### O conceito de LTS
> 💡 **LTS (Long Term Support):** Significa Suporte de Longo Período.
* As empresas preferem versões **LTS**, pois garantem estabilidade e menos esforço de atualização constante.
* **Dica:** Busque sempre utilizar versões com selo LTS para projetos profissionais.

### Edições da Plataforma
* **Java ME (Micro Edition):** Dispositivos embarcados, móveis e IoT. [Documentação](http://www.oracle.com/technetwork/java/javame)
* **Java SE (Standard Edition):** Core da linguagem, desktop e servidores. [Documentação](http://www.oracle.com/technetwork/java/javase)
* **Java EE (Enterprise Edition):** Aplicações corporativas complexas. [Documentação](http://www.oracle.com/technetwork/java/javaee)

---

## 🏗️ Funcionamento: JDK vs JVM

O Java resolveu problemas históricos de linguagens como C e C++, como o gerenciamento manual de memória (ponteiros) e a falta de portabilidade.

### JVM (Java Virtual Machine)
É a Máquina Virtual necessária para executar sistemas Java.
* **Portabilidade:** Você compila o código uma vez e ele roda em qualquer SO que tenha a JVM instalada.
* **Linguagem Híbrida:** O Java não é puramente compilado nem interpretado. Ele gera um **Bytecode**, que é pré-compilado para ser executado pela JVM.

### JDK (Java Development Kit)
É o conjunto de ferramentas que os desenvolvedores usam para criar, compilar e depurar aplicativos. Se a JVM é necessária para *rodar*, o JDK é necessário para *desenvolver*.

---

## 🧩 Estrutura de uma Aplicação Java

O Java é estritamente Orientado a Objetos. A unidade lógica básica é a **Classe**.

> 💡 **Regra de Ouro:** Todo código em Java tem que estar obrigatoriamente dentro de classes.

### Níveis de Organização
1. **PACKAGE (Pacotes):** Agrupamento LÓGICO de classes relacionadas (Ex: um pacote `entities` para as classes Produto e Cliente). Serve para organizar o projeto.
2. **MÓDULO (Java 9+):** Agrupamento lógico de pacotes relacionados.
3. **RUNTIME:** Agrupamento físico.
4. **APLICAÇÃO:** O conjunto final de todos os módulos relacionados.

---

## 🛠️ Guia de Instalação do JDK

Siga o tutorial específico para o seu Sistema Operacional:

| Sistema | Link do Tutorial |
| :--- | :--- |
| **Windows** | [Assistir no YouTube](https://www.youtube.com/watch?v=QekeJBShCy4) |
| **Linux** | [Assistir no YouTube](https://www.youtube.com/watch?v=Sv0EwYPLw8w&list=PLNuUvBZGBA8mcAF-YX7RJhA26TBLdG5yk&index=3) |
| **MacOS** | [Guia no GitHub](https://github.com/devsuperior/sds2/tree/master/instalacao/mac#java-11-on-macos) |

---
**Nota Histórica:** Criada pela *Sun Microsystems* em 1990 e adquirida pela *Oracle* em 2010.