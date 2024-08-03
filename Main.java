/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner ler = new Scanner(System.in);
	   String senha = "BATATA";
	   
	   for (int i = 0; i < 3 ; i++){
	     //senha
	    System.out.printf("Digite a senha: ");
	    String tentativa = ler.nextLine();
        
	  	 if (senha.equals(tentativa) == true ){
	     System.out.print("Congratuleitiosn ");
	     //Nome
	    System.out.printf("Digite teu nome: ");
        String nome = ler.nextLine();
        int tamanho = nome.length();

	   System.out.printf("Olá, "+ nome +" seu nome tem " + tamanho + " caracteres, a primeira letra do seu nome é: " + nome.charAt(0));
	   break;
	  	 }else{
	       System.out.println("Errou hahaahahah ");
	   }
	    
	}

	   
	   
	  
	}
}