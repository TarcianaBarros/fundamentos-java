import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args){
        Scanner leTeclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float num1 = leTeclado.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num2 = leTeclado.nextFloat();

        float media = (num1 + num2)/2;
        System.out.println("A média é: " + media);


    }

}
