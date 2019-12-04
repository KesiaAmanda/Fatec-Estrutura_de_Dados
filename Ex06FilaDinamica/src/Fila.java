
public class Fila {
	private final int MAX = 5;
	private Pessoa head, proxima; 
	private int total=0;
	
	public void EntraFila(Pessoa nova) {
		if(filaCheia()) {
			throw new IllegalArgumentException("Fila Cheia");
		}
		if(filaVazia()) {
			head=nova;
			proxima=head;
		}else{
			proxima.setProxima(nova);
			proxima=nova;
		}
		total++;
	}
	
	public Pessoa saiFila() {
		Pessoa aux = head;
		head=head.getProxima();
		total--;
		return aux;
	}
	
	public void AlteraElemento(Pessoa pessoa, String email) {
		Pessoa aux = head;
		while(aux!=null) {
			if(aux.equals(pessoa)) {
				aux.setEmail(email);
				aux=null;
			}
			if(aux!=null) aux=aux.getProxima();
		}
	}
	
	public boolean filaVazia() {
		return head==null;
	}
	
	public boolean filaCheia() {
		return total==MAX;
	}
	
	public void MostraTodos() {
		Pessoa aux = head;
		while(aux!=null) {
			System.out.println(aux.toString());
			aux=aux.getProxima();
		}
	}
}
