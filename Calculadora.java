import java.util.Scanner;
import java.lang.Math;

    public class Calculadora {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double n1, n2, result;
            char operacao;

            System.out.println("Escolha o Primeiro Número: ");
            n1 = scanner.nextDouble();

            System.out.println("Escolha o Segundo Número: ");
            n2 = scanner.nextDouble();

            System.out.println("Escolha a Operação(+, -, /, *, ^):");
            operacao = scanner.next().charAt(0);

            switch (operacao) {
                case '+':
                    result = n1 + n2;
                    break;

                case '-':
                    result = n1 - n2;
                    break;

                case '/':
                    result = n1 / n2;
                    if (n2 == 0) {
                        System.out.println("Não é possível dividir por zero!");
                        return;
                    }
                    break;

                case '*':
                    result = n1 * n2;
                    break;

                case '^':
                    result = Math.pow(n1, n2);
                    break;

                default:
                    System.out.println("Operação Inválida!");
                        return;

            }

            System.out.println("O resultado é: " + result);


        }
    }