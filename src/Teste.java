
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static final int CODIGO_ASCII = 256;
	
	public static boolean anagrama(String palavraUm, String palavraDois) {
		
		int[] contador = new int[CODIGO_ASCII];
		char[] caracterPalavraUm = palavraUm.toCharArray();
		char[] caracterPalavraDois = palavraDois.toCharArray();
		
		if(caracterPalavraUm != caracterPalavraDois) {
			return false;
		}
		
		for(int i = 0; i < caracterPalavraUm.length; i++) {
			contador[caracterPalavraUm[i]]++;
			contador[caracterPalavraDois[i]]--;
		}
		
		for(int i = 0; i < contador.length; i++) {
			if(contador[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
