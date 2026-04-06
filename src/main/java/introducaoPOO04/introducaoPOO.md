# ☕ Classes, Atributos e Métodos em Java

Este repositório contém anotações e exemplos práticos sobre os fundamentos da Programação Orientada a Objetos (POO) em Java, focando na transição do pensamento estruturado para o orientado a objetos.

## 1. O Conceito de Classe e Objeto

Uma **Classe** é um projeto ou modelo que define o que um objeto de determinado tipo pode conter e fazer. Um **Objeto** é uma instância real desse modelo.

### 📌 Diferença de Alocação (Memória)

| Tipo de Memória | Descrição |
|-----------------|-----------|
| Stack | Onde são criadas as variáveis locais (ex: nome do objeto). |
| Heap | Onde os objetos são criados dinamicamente (usando o comando `new`). |

## 2. Estrutura de uma Classe

Para representar uma entidade (como um Triângulo ou um Produto), definimos **atributos** (dados) e **métodos** (comportamentos).

### Exemplo: Classe Triangle

```java
public class Triangle {
    // Atributos
    public double a;
    public double b;
    public double c;

    // Método para calcular a área (Delegação de responsabilidade)
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
```

## 3. Membros Estáticos (static)

Membros estáticos são membros que pertencem à classe, e não a um objeto específico. Podem ser chamados sem a necessidade de criar uma instância.

### 📌 Características

- **Constantes**: Geralmente declaradas como `public static final` (ex: PI).
- **Métodos Utilitários**: Funções que realizam cálculos baseados apenas nos parâmetros de entrada.
- **Acesso**: Chamados diretamente pelo nome da classe: `Calculadora.metodo()`.

## 4. 📝 Exemplos Práticos e Exercícios

Seguindo o material do Prof. Nelio Alves, os seguintes cenários foram implementados:

### A. Problema do Triângulo
Comparação de áreas entre dois triângulos utilizando a Fórmula de Heron.
**Foco**: Aprender a usar o `new` para instanciar objetos.

### B. Gestão de Stock
Leitura de dados de um produto (Nome, Preço, Quantidade).
**Foco**: Uso do método `toString()` para exibir dados formatados.

### C. Conversor de Moeda (Membros Estáticos)
Um programa para calcular o valor a ser pago em reais por uma compra em dólares, aplicando 6% de IOF.
**Foco**: Aplicação de métodos `static`.

## 5. 🛠️ Comandos e Sintaxe Importante

| Recurso | Sintaxe / Exemplo |
|---------|-------------------|
| Instanciação | `Triangle x = new Triangle();` |
| Acesso a Atributo | `p1.name = "TV";` |
| Invocar Método | `double area = x.area();` |
| Sobrescrita | `@Override public String toString() { ... }` |