
public class Fila {
	private final int MAX = 5;
	private Pessoa[] filaPessoa = new Pessoa[MAX];
	private int total=0;
	
	public void EntraFila(Pessoa nova) {
		if(verificaFila()) {
			throw new IllegalArgumentException("Fila Cheia");
		}
		filaPessoa[total]=nova;
		total++;
	}
	
	public Pessoa saiFila(){
		if(filaVazia()) {
			throw new IllegalArgumentException("Fila Vazia");
		}
		Pessoa aux = filaPessoa[0];
		for(int i=0;i<total;i++) {
			filaPessoa[i]=filaPessoa[i+1];
		}
		total--;
		return aux;
	}
	
	private boolean verificaFila() {
		return total==MAX;
	}
	
	private boolean filaVazia() {
		return filaPessoa[0]==null;
	}
	
	public void MostraTodos() {
		for(int i=0;i<total;i++) {
			System.out.println(filaPessoa[i].toString());
		}
	}
}
