import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
		int num1, num2, soma, subt12, subt21 ,mult ,resto;
		double div;
		
		System.out.print("Digite o primeiro número: ");
		
		Scanner leitor = new Scanner(System.in);
		
		num1 = leitor.nextInt();
		
		System.out.println("Digite o segundo número: ");
		
		num2 = leitor.nextInt();
		
		soma = num1 + num2;
		subt12 = num1 - num2;		
        subt21 = num2 - num1;
        mult = num1*num2;
        resto = num1%num2;
        div = num1/(double)num2;
        
        System.out.println("Soma="+soma+"\nSubtração="+subt12+" OU"+" Subtração="+subt21+"\nMultiplicação="+mult+"\nDivisão="+div+"\nResto="+resto);
        
       
        
        }

}