//Esta linha importa a classe Scanner, que permite a leitura de entrada do usuário (números e texto) a partir do console//
import java.util.Scanner; 

public class Main { //Define a classe Main que é o ponto de entrada do programa ao executar.//
    public static void main(String[] args) {  //  Define o método principal, onde o código começa a ser executado//
        Scanner scanner = new Scanner(System.in); //Criacao do objeto Scanner que será usado para capturar a entrada do usuário a partir do console//

        System.out.println("Calculadora Simples"); //System.out.println imprimem no console o texto para orientar o usuário.//
        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Digite o número da operação desejada: "); //Essa linha exibe um prompt para o usuário inserir o número da operação desejada.//
        int escolha = scanner.nextInt(); //Essa linha captura a escolha do usuário (um número inteiro) e armazena na variável escolha//

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble(); //Essa linha captura a escolha do usuário de numero flutuante (um número decimal) e armazena na variável num1//


        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;  //Inicia a variável resultado que armazenará o resultado da operação//

        switch (escolha) { //estrutura swich para escolher as opcoes. o swich avalia a variável escolha e executa o bloco//
            case 1: // Se a escolha do usuario for 1, sera realizado a adição de num1 e num2, armazena o resultado da soma em resultado, e imprime no console.//
                resultado = num1 + num2;
                System.out.println("O resultado da adição é: " + resultado);
                break; //vai interromper  o fluxo do switch para que ele não continue executando os outros casos//
        }
        switch (escolha) { //repeticao para as outras operacoes, entao cada switch realiza a operação correspondente à escolha do usuário//
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da subtracao é: " + resultado);
                break;
        }
        switch (escolha) {
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da Multiplicação é: " + resultado);
                break;
        }
        switch (escolha) {
            case 4:
                resultado = num1 / num2;
                System.out.println("O resultado da divisão é: " + resultado);
                break;
        }
    }
}
