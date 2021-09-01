import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args){
        Scanner leTeclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leTeclado.next();
        System.out.println("olá," + nome);
    }
}
