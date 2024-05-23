import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {    
        Condicoes co = new Condicoes();
        Scanner terminal = new Scanner(System.in);

        while (co.resultado == 0){
        System.out.println("Digite o parâmetro 1: ");
		int parametro1 = terminal.nextInt();

        System.out.println("Digite o parâmetro 2: ");
		int parametro2 = terminal.nextInt();

        co.validacao(parametro1, parametro2);
        }

        System.out.println("Parâmetro 1: " + co.parametro1);
        System.out.println("Parâmetro 2: " + co.parametro2);
        System.out.println("O resultado da subtração dos parâmetros é: " + (co.resultado - 1) + ", contando...");
        
        for (int i = 1; i < co.resultado; i++) {
			System.out.println(i);	
		}
        }
}

