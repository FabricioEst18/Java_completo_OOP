# ⭐ Estrutura Condicional em Java

Este documento resume o controle de fluxo em Java, abordando como o programa toma decisões baseadas em condições lógicas, além de tratar sobre escopo de variáveis e operadores de atribuição.

---

## 1. Expressões Comparativas e Lógicas

As expressões condicionais são a base da tomada de decisão e sempre resultam em um valor booleano (`true` ou `false`).

### ⚖️ Operadores Comparativos
Utilizados para comparar dois valores:

| Operador | Descrição |
| :---: | :--- |
| `>` | Maior que |
| `<` | Menor que |
| `>=` | Maior ou igual |
| `<=` | Menor ou igual |
| `==` | Igual |
| `!=` | Diferente |

### 🧠 Operadores Lógicos
Utilizados para combinar múltiplas expressões:

| Operador | Nome | Descrição |
| :---: | :--- | :--- |
| `&&` | E (AND) | `true` apenas se **todas** as condições forem verdadeiras. |
| `\|\|` | OU (OR) | `true` se **pelo menos uma** condição for verdadeira. |
| `!` | NÃO (NOT) | Inverte o resultado: `true` vira `false` e vice-versa. |

---

## 2. Estrutura Condicional (`if-else`)

A estrutura fundamental para desviar o fluxo do código baseada em uma condição.

### Sintaxe Básica
```java
if (condicao) {
    // Executa se a condição for verdadeira
} else {
    // Executa se a condição for falsa
}
```

---

## 3. Operadores de Atribuição Cumulativa

São atalhos para atualizar o valor de uma variável baseando-se no valor anterior dela mesma.

| Operador | Exemplo | Equivalente a |
| :---: | :--- | :--- |
| `+=` | `a += b;` | `a = a + b;` |
| `-=` | `a -= b;` | `a = a - b;` |
| `*=` | `a *= b;` | `a = a * b;` |
| `/=` | `a /= b;` | `a = a / b;` |
| `%=` | `a %= b;` | `a = a % b;` |

---

## 4. Estruturas Condicionais Alternativas

### 📋 Switch-Case
Indicado quando se tem várias opções fixas baseadas no valor de uma única variável.

```java
switch (variavel) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    default:
        // código caso nenhum valor coincida
        break;
}
```

### ⚡ Expressão Condicional Ternária
Uma forma compacta de escrever um `if-else` que retorna um valor.

**Sintaxe:**
```java
( condição ) ? valor_se_verdadeiro : valor_se_falso;
```

---

## 5. Escopo e Inicialização

> [!IMPORTANT]
> **Regra de Inicialização:** O compilador Java não permite o uso de variáveis que não foram inicializadas. Certifique-se de atribuir um valor inicial ou garantir que ela receba um valor via entrada de dados antes do uso.

> [!NOTE]
> **Regra de Escopo:** Toda variável criada dentro de uma estrutura (como um bloco `if` ou `switch`) possui **escopo local**. Isso significa que ela só existe e pode ser acessada dentro desse bloco.