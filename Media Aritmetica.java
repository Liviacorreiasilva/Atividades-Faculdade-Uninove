public class Main { //Declaração da Classe Principal para inicar o programa//
    public static void main(String[] args) { //Este é o método que será executado quando o programa iniciar porque ele contém o código principal
    // declara as variaveis//
        int media_987; //Declaracao de variáveis inteiras que armazenarão as médias dos dois conjuntos de números (9, 8, 7) e (4, 5, 6).
        int media_456;
        double media_geral; //Declara uma variável flutuante (numeros decimais) que vai armazenar a média geral das duas médias calculadas//
        
        //declara os valores á variavel//
        media_987 = (9 + 8 + 7) / 3; //Soma os números 9, 8 e 7, e divide o resultado por 3, calculando a média. O valor calculado será armazenado em media_987.
        media_456 = (4 + 5 + 6) / 3;
        media_geral = (media_987 + media_456) / 2; //Calcula a média entre media_987 e media_456; o resultado será em formato decimal por serem variaveis do tipo double(flutuante.//
        
      //imprime  o resultado das operacoes para o usuario//
        System.out.println("Média entre 9, 8 e 7: " + media_987);
        System.out.println("Média entre 4, 5 e 6: " + media_456);
        System.out.println("Média das médias....: " + media_geral);
    }
}
