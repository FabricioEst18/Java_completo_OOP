# ⭐ Estruturas Repetitivas em Java

Este documento resume as estruturas de controle de repetição (loops) em Java, detalhando quando usar cada uma, suas sintaxes e regras de execução.

---

## 1. Estrutura `while` (Enquanto)

É uma estrutura de controle que repete um bloco de comandos **enquanto** uma condição for verdadeira.

### 📌 Características
- **Quando usar:** Quando **não se sabe previamente** a quantidade de repetições que será realizada.
- **Regra de execução:**
  - **Condição Verdadeira:** Executa o bloco e volta ao teste da condição no topo.
  - **Condição Falsa:** Pula o bloco e encerra a repetição ("pula fora").

### Sintaxe
```java
while (condicao) {
    // comando 1
    // comando 2
}
```

---

## 2. Estrutura `for` (Para)

É uma estrutura que repete um bloco de comandos para um certo intervalo de valores. É a mais indicada para **contagens**.

### 📌 Características
- **Quando usar:** Quando se sabe previamente a quantidade de repetições ou o intervalo de valores (ex: de 1 a 10).

### Componentes do `for`
| Componente | Descrição |
| :---: | :--- |
| **Início** | Executa apenas na primeira vez (declaração e inicialização da variável). |
| **Condição** | Testada antes de cada iteração. Se falsa, o loop para. |
| **Incremento** | Executado após cada repetição do bloco de comandos. |

### Sintaxe
```java
for (inicio; condicao; incremento) {
    // comando 1
    // comando 2
}
```

---

## 3. Estrutura `do-while` (Faça-Enquanto)

Diferente das outras, o bloco de comandos executa **pelo menos uma vez**, pois a condição é verificada apenas no final.

### 📌 Características
- **Regra:** Se a condição for verdadeira ao final, o fluxo retorna ao `do`. Se for falsa, encerra.
- **Uso comum:** Quando você precisa que o código rode primeiro para depois perguntar ao usuário se ele deseja repetir (ex: menus ou validações).

### Sintaxe
```java
do {
    // comando 1
    // comando 2
} while (condicao);
```

---

## 4. 📋 Quadro Comparativo

| Estrutura | Uso Principal | Verificação da Condição |
| :---: | :--- | :--- |
| `while` | Quantidade indeterminada | No início (Teste antes) |
| `for` | Quantidade determinada / Contagem | No início (Teste antes) |
| `do-while` | Execução obrigatória de ao menos 1 vez | No final (Teste depois) |

---

## 5. ⚡ Operadores de Atribuição Cumulativa

Muito utilizados dentro de loops para **acumuladores** e **contadores**:

| Operador | Exemplo | Equivalente a |
| :---: | :--- | :--- |
| `+=` | `soma += x;` | `soma = soma + x;` |
| `-=` | `valor -= 10;` | `valor = valor - 10;` |
| `++` | `i++;` | `i = i + 1;` |
| `--` | `i--;` | `i = i - 1;` |

---

## 6. 🐞 Como Utilizar o Debug no Eclipse

Essencial para observar o comportamento dos loops e o valor das variáveis a cada "volta":

### Passos
1. **Breakpoint:** `Run > Toggle Breakpoint` (ou clique duplo na margem esquerda da linha)
2. **Iniciar Debug:** Botão direito na classe > `Debug as > Java Application`

### Comandos Principais
| Atalho | Função |
| :---: | :--- |
| `F6` | Executa a linha atual (passo a passo) |
| `F8` | Retoma a execução normal até o próximo breakpoint |
| `F5` | Entra dentro de um método (Step Into) |

---

## 7. 📝 Exemplo Prático: Celsius para Fahrenheit

Este exemplo ilustra bem o uso do `do-while` para repetir um cálculo baseado na vontade do usuário:

```java
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp == 's');

        sc.close();
    }
}
```

---

> [!NOTE]
> **Dica:** Use `break` para sair de um loop prematuramente e `continue` para pular para a próxima iteração sem executar o resto do bloco.
