
public class Pilha {
	private char elementos[] = new char[10];
	private int total = 0;
	
	public void PUSH(char novo) {
		GarantaEspaco();
		elementos[total]=novo;
		total++;
	}
	
	public char POP() {
		if(verificaPilha()) {
			throw new IllegalArgumentException("Pilha Vazia!");
		}
		char aux = elementos[total-1];
		elementos[total-1]=Character.MIN_VALUE;
		total--;
		return aux;
	}
	
	public char TOP() {
		return elementos[total-1];
	}
		
	public boolean verificaPilha() {
		return elementos[0]==Character.MIN_VALUE;
	}
	
	private void GarantaEspaco() {
		if(total==elementos.length) {
			char novaArray[] = new char[elementos.length+5];	
			
			for(int i=0;i<total;i++) {
				novaArray[i]=elementos[i];
			}
			elementos=novaArray;
		}
	}
}
