# ⭐ Estrutura Sequencial

Este documento resume os fundamentos da manipulação de dados em Java, cobrindo armazenamento em memória, boas práticas de nomenclatura, entrada/saída de dados e funções matemáticas.

---

## 1. Variáveis e Memória

### 🧠 Como funcionam os Bits?
A memória do computador armazena dados em bits (0 ou 1).
* **Capacidade:** Cada bit oferece 2 possibilidades de valores.
* **Cálculo (Exemplo `byte`):** Um byte possui 8 bits.
  $$2^8 = 256 \text{ possibilidades}$$
* **Distribuição:** Como o Java suporta números negativos, esse intervalo de 256 possibilidades é dividido: metade para valores negativos e metade para positivos.

### 📝 Nomenclatura de Variáveis (Boas Práticas)
Para manter o código profissional e evitar erros de compilação:
1. **Não comece com dígitos:** Use letras ou `_`.
2. **Sem espaços:** Variáveis não podem conter espaços vazios (use `_` ou camelCase).
3. **Sem acentos:** Não utilize acentos (á, é, í) ou til (~).
4. **Padrão Camel Case:** A primeira palavra é minúscula e as seguintes iniciam com maiúscula.
    * *Correto:* `salarioDoFuncionario`, `qtdProdutos`.
    * *Errado:* `salario funcionario`, `5minutos`.

---

## 2. Saída de Dados

Para exibir dados formatados no console, utilizamos o `printf` (*print formatted*).

| Marcador | Tipo de Dado |
| :--- | :--- |
| `%f` | Ponto flutuante (double/float) |
| `%d` | Inteiro (int) |
| `%s` | Texto (String) |
| `%n` | Quebra de linha |

**Exemplo Prático de Concatenação:**
```java
String nome = "Maria";
int idade = 31;
double renda = 4000.0;

// Saída formatada
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
```

#### 🌍 Configuração de Locale (Ponto vs Vírgula)
O Java costuma seguir a configuração do seu sistema operacional (Brasil = vírgula para decimais). Para garantir que o separador decimal seja sempre o ponto (`.`), adicione esta linha no início do método `main`:

```java
import java.util.Locale;
// ...
Locale.setDefault(Locale.US);
```

---

## 3. Entrada de Dados (Scanner)

Para ler dados digitados pelo usuário, utilizamos a classe `Scanner`.

**Inicialização:**
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

### 📥 Comandos de Leitura
| Comando | Descrição |
| :--- | :--- |
| `sc.next()` | Lê uma `String` (até o primeiro espaço). |
| `sc.nextInt()` | Lê um número inteiro. |
| `sc.nextDouble()` | Lê um número de ponto flutuante. |
| `sc.nextLine()` | Lê a linha inteira (incluindo espaços). |

### ⚠️ A Armadilha do Buffer (Problema do `nextLine`)
Quando você usa um comando de leitura numérica (como `nextInt`) e logo após usa um `nextLine`, o "Enter" que você apertou após o número fica "preso" no buffer. O `nextLine` acaba lendo esse "Enter" vazio e pula a leitura desejada.

**Solução:** Adicionar um `nextLine()` extra para limpar o buffer.

```java
int x = sc.nextInt();
sc.nextLine();           // <-- Limpeza de buffer obrigatória aqui
String s = sc.nextLine(); // Agora a leitura funcionará corretamente
```

---

## 4. Processamento de Dados (Casting)

O **Casting** é a conversão explícita de um tipo de dado para outro. É necessário quando o compilador não consegue converter automaticamente ou para evitar perda de precisão.

**Exemplo Prático:**
```java
int a = 5;
int b = 2;

// Sem o (double), o Java faria uma divisão inteira (resultado seria 2.0)
double resultado = (double) a / b;

System.out.println(resultado); // Imprime 2.5
```

---

## 5. Funções Matemáticas

A classe `Math` fornece métodos estáticos para operações complexas.

| Função | Sintaxe | Descrição |
| :--- | :--- | :--- |
| **Raiz Quadrada** | `Math.sqrt(x)` | Calcula a raiz quadrada de `x`. |
| **Potenciação** | `Math.pow(x, y)` | Calcula `x` elevado a `y`. |
| **Valor Absoluto** | `Math.abs(x)` | Remove o sinal negativo. |

**Exemplo:**
```java
double x = 3.0;
double y = 4.0;
double z = -5.0;

double A = Math.sqrt(x);   // Raiz
double B = Math.pow(x, y); // Potência
double C = Math.abs(z);    // Valor Absoluto (vira 5.0)
```