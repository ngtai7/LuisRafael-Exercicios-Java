import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		
		String nome, cidade;
		int idade;
		
		System.out.println("Digite seu nome: ");
		Scanner leitor = new Scanner(System.in);
		
		nome = leitor.next();
		
		System.out.println("Bem vindo "+nome);
		System.out.println("Digite a sua idade: ");
		
		idade = leitor.nextInt();
		
		System.out.println("Digite o nome de sua cidade: ");
		cidade = leitor.next();
		System.out.println("Nome:" + nome +"\nIdade:" + idade + "\nCidade:" + cidade);

	}

}
