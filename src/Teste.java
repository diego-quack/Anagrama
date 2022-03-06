import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com a primeira palavra: ");
		String palavraUm = input.next();
		System.out.print("Entre com a segunda palavra: ");
		String palavraDois = input.next();
		System.out.println(anagrama(palavraUm, palavraDois));
		
		input.close();

	}
	
	private static final int CODIGO_ASCII = 256;
	
	public static String anagrama(String palavraUm, String palavraDois) {
		
		String anagrama = "É um anagrama";
		String naoAnagrama = "Não é um anagrama";
		
		int[] contador = new int[CODIGO_ASCII];
		char[] caracterPalavraUm = palavraUm.toCharArray();
		char[] caracterPalavraDois = palavraDois.toCharArray();
		
		if(caracterPalavraUm.length != caracterPalavraDois.length) {
			return naoAnagrama;
		}
		
		for(int i = 0; i < caracterPalavraUm.length; i++) {
			contador[caracterPalavraUm[i]]++;
			contador[caracterPalavraDois[i]]--;
		}
		
		for(int i = 0; i < contador.length; i++) {
			if(contador[i] != 0) {
				return naoAnagrama;
			}
		}
		return anagrama;
	}

}
