
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println ("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		Double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		//Digite True ou False
		System.out.println("Você tem pet?");
		Boolean temPet = scan.nextBoolean();
		
		if(temPet == true) {
			
			System.out.println ("Sim");
		} 
		
		else {
			
			System.out.println("Não");
		}
		

	}

}
