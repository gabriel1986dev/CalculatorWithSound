import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class CalculatorWithSound 
{
	public static void main (String [] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException 
	{
		Scanner in = new Scanner (System.in);	
			System.out.println("Digite:\n1 - se voce que usa a calculadora com música, e\n2 - sem música: ");
		int play  = in.nextInt();	
	
		if (play == 1) 
		{
		File file = new File ("Song");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
			System.out.println("Digite o primeiro número: ");
		double number0 = in.nextDouble();
			System.out.println("Digite:\n+ para somar,\n- para subtrair,\n* para multiplicar e \n/ para dividir: ");
		char operation = in.next().charAt(0);
			System.out.println("Digite o segundo número: ");
		double number1 = in.nextDouble();
				
		switch(operation) {
			case '+':
			double addition = number0 + number1;
				System.out.println("A somar de: "+number0+" mais o número: "+number1+" é: "+addition);
			break;
			case '-':
			double subtraction = number0 - number1;
				System.out.println("A subtração do número: "+number0+" menos o número: "+number1+" é: "+subtraction);
			break;
			case '/':
		if (number1 != 0) 
		{
			double division = number0 / number1;
				System.out.println("A divisão do número: "+number0+" dividido por o número: "+number1+" é: "+division);
		}
		else
		{
				System.out.println("Não é possivel dividir por 0");
		}
			break;
			case '*':
			double multiplication = number0 + number1;
				System.out.println("A multiplicação de: "+number0+" multiplicado por o número: "+number1+" é: "+multiplication);
			break;
			default:
				System.out.println("Operação invalida.");
		}
		}
		else if (play == 2) 
		{
				System.out.println("Digite o primeiro número: ");
			double number0 = in.nextDouble();
				System.out.println("Digite:\n+ para somar,\n- para subtrair,\n* para multiplicar e \n/ para dividir: ");
			char operation = in.next().charAt(0);
				System.out.println("Digite o segundo número: ");
			double number1 = in.nextDouble();
				
		switch(operation) {
			case '+':
			double addtion = number0 + number1;
				System.out.println("A somar de: "+number0+" mais o número: "+number1+" é: "+addtion);
			break;
			case '-':
			double subtraction = number0 - number1;
				System.out.println("A subtração de: "+number0+" menos o número: "+number1+" é: "+subtraction);
			break;
			case '/':
		if (number1 != 0) 
		{
			double division = number0 / number1;
				System.out.println("A divisão do número: "+number0+" dividido por o número: "+number1+" é: "+division);
		}
		else
		{
				System.out.println("Não é possivel dividir por 0");
		}
			break;
			case '*':
			double multiplication = number0 + number1;
				System.out.println("A multiplicação de: "+number0+" multiplicado por o número: "+number1+" é: "+multiplication);
			break;
			default:
				System.out.println("Operação invalida.");					
		}
		}
		else 
		{
				System.out.println("Opção invalida.");		
		}
	}			
}




		
		

	


