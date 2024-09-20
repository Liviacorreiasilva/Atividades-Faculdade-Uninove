public class Main { // Define a classe principal chamada Main, onde  todo o código será executado a partir dessa classe//
    public static void main(String[] args) { //metodo main onde o código dentro deste método será executado quando o programa for iniciado.//
double saldo = 1300; //eclara uma variável chamada saldo do tipo double (armazena números com casas decimais),ela é inicializada com o valor de 1300, que representa o saldo inicial na conta//

System.out.println("O seu saldo de R$ " + saldo + " teve um Reajuste de 1%."); // Imprime uma mensagem no console para o usuario com o saldo e a informacao sobre o reajuste//
System.out.println("Saldo corrigido para: " + saldo * 1.01); //O cálculo saldo * 1.01 multiplica o saldo original (1300) por 1.01 ( aumento de 1%) e exibe o saldo corrigido com o reajuste no console//

      //a variável saldo é concatenada (unida) à string usando o operador + que faz com que apareca no console como 1300.00//

  }
}
