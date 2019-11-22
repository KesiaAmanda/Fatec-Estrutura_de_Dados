
public class Lista {
	private Aluno head=null, elemento;
	private int total=0;	
	
	public void addFim(Aluno novo) {
		if(head==null) {
			head=novo;
			elemento=novo;
			total++;
		}else if(elemento.proximo==null){
			elemento.proximo=novo;
			elemento=novo;
			total++;
		}
	}
	
	public void addInicio(Aluno novo) {
		novo.proximo=head;
		head=novo;
	}
	
	private void addMeio(int posicao, Aluno novo) {
		int cont=0;
		Aluno aux=this.head;
		while(cont<=posicao) {
			if(cont==posicao-1) {
				novo.setProximo(aux.getProximo());
				aux.setProximo(novo);
			}
			aux=aux.getProximo();
			cont++;
		}
		total++;
	}
	
	public void addLista(int posicao, Aluno novo) {
		if(!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Invalida");
		}		
		if (posicao==0) {
			addInicio(novo);
		}else if (posicao==total) {
			addFim(novo);
		}else {
			addMeio(posicao, novo);
		}		
	}
	
	public void remElemento(Aluno aluno) {
		Aluno aux = this.head;
		while(aux!=null) {
			if(aux.proximo==aluno) {
				Aluno proximo = aux.getProximo();
				aux.setProximo(proximo.getProximo());
			}else if (aux==aluno){
				head=aluno.getProximo();
			}
			aux=aux.getProximo();
		}
	}
	
	public String mostraPrimeiro() {
		return head.toString();
	}
	
	public String mostraUltimo() {
		return elemento.toString();
	}
	
	public void mostraTudo() {
		Aluno aux = head;
		while(aux!=null) {
			System.out.println(aux);
			aux=aux.proximo;
		}
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao>=0 && posicao<=total;
	}
	
}
