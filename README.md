# Calculadora em Java

Calculadora de linha de comando em Java. O programa pede dois números e um
operador, aplica a operação e imprime o resultado.

Projeto de estudo, feito para praticar entrada de dados, tipos primitivos e
controle de fluxo com `switch`.

## Funcionalidades

- Soma (`+`)
- Subtração (`-`)
- Multiplicação (`*`)
- Divisão (`/`)
- Exponenciação (`^`)

## Como executar

Requer o JDK instalado (`java -version` para conferir).

```bash
javac Calculadora.java
java Calculadora
```

O programa é interativo: informe o primeiro número, o segundo número e, por
fim, o operador desejado.

```
Escolha o Primeiro Número:
10
Escolha o Segundo Número:
3
Escolha a Operação(+, -, /, *, ^):
*
```

## Como funciona

- `java.util.Scanner` lê os valores digitados no terminal
- Os operandos são `double`, então o resultado aceita casas decimais
- Um `switch` sobre o caractere do operador seleciona a operação
- A exponenciação usa `Math.pow`

## Tecnologias

- Java
