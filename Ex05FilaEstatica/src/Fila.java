
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
	
	public void alteraEmail(Pessoa pessoa, String email) {
		for(int i = 0; i<total;i++) {
			if(filaPessoa[i].equals(pessoa)) {
				filaPessoa[i].setEmail(email);
				i=total;
			}
		}
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
