        import java.util.Scanner;

        public class Calculadora {
            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                    //declara o scanner

            double n1, n2, result;
            char operacao;

            System.out.println("Primeiro Número:");
            n1 = scanner.nextDouble();
            System.out.println("Segundo número:");
            n2 = scanner.nextDouble();
            System.out.println("Operação:");
            operacao = scanner.next().charAt(0);

            result = 0;

            switch(operacao){
                case'+':
                    result = n1+n2;
                break;

                case'-':
                    result = n1-n2;
                break;

                case'/':
                    result = n1/n2;
                break;

                case'*':
                    result = n1*n2;
                break;

                default: //se não for nenhuma das opções retorna pro começo
                    System.out.println("Operação Inválida!");
                    return;


            }
                if (operacao == '/' && n2 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                    return;
                }
            System.out.println("O resultdo é:"+ result);
            }
    }
