package Terminal;

import java.util.Scanner;

import Animais.Peixe;
import Animais.Gato;
import Animais.Cachorro;
import Animais.Passaro;

public class AnimalTerminal {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Peixe peixe = new Peixe();
		Gato gato = new Gato();
		Passaro passaro = new Passaro();
		Cachorro cao = new Cachorro();
		
		System.out.println("\nEscolha entre: ");
		System.out.println("Gato[1] - Cachorro[2] - Pássaro[3] - Peixe [4]\n");
		
		int opcao = scan.nextInt();
		
		switch (opcao) {
		
		case 1:{
		gato.EmiteSom();
		gato.MoverAnimal();
		System.out.println();
		break;
		}
		case 2:{
			cao.EmitirSom();
			cao.MoverAnimal();
			System.out.println();
	    break;
		}
		case 3:{
			passaro.EmitirSom();
			passaro.MoverAnimal();
			System.out.println();
		break;	
		}
		case 4:{
			peixe.EmitirSom();
			peixe.MoverAnimal();
			System.out.println();
		break;
		}
  }
 }
}
