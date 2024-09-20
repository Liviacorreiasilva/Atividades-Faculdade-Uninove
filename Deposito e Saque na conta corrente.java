public class Main{
    
    public static void main(String[] args) {
        // System.out.println("Lívia");
        // System é para imprimir uma linha dentro do sistema
        // System.out.println("Correia");
        // System.out.println("da Silva");

        // System.out.println("Lívia" + "" + Correia);
        // Podemos "juntar" os textos (LiviaCorreia),
        // usando as "" aspas juntas e também
        // usamos o símbolo + para isso...
        // Para separar o texto (Livia Correia),
        // usamos as " " aspas separadas e também o
        // símbolo + para isso..

        //-----------------------------------------------------------//
        // Vamos criar abaixo um objeto a partir da Classe ContaCorrente

        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(50.00);
        System.out.println("Saldo:" + c1.saldo());
        // c1 é uma variável que receberá um objeto novo

        c1.depositar(150.00);
        System.out.println("Saldo:" + c1.saldo());

        c1.sacar(50.00);
        System.out.println("Saldo:" + c1.saldo());

        Contido multiplicar = new Contido();
        System.out.println(multiplicar.multiplicar(10, 2));
    }
}

// Tarefa abaixo: Criar um Método para realizar

class ContaCorrente { // isso é a classe
    // Esses abaixo serão os atributos da classe (string e Double)
    String numero;
    String correntista;
    double saldo;
    double limite;

    // Esses abaixo serão os métodos da classe
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        // ou você pode escrever --> this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    public double saldo() {
        return this.saldo;
    }
}

// Por fim, vamos criar uma classe para multiplicação de números inteiros

class Contido {
    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }
}
// FIM:
