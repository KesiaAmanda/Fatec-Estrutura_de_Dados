
public class Lista {
	private No head=null, elemento;
	private int total=0;	
	
	public void addFim(Aluno aluno) {
		No novo = new No(aluno);
		
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
	
	public void addInicio(Aluno aluno) {
		No novo = new No(aluno);
		novo.proximo=head;
		head=novo;
	}
	
	private void addMeio(int posicao, Aluno aluno) {
		int cont=0;
		No novo = new No(aluno);
		No aux=this.head;
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
	
	public void addLista(int posicao, Aluno aluno) {
		if(!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Invalida");
		}		
		if (posicao==0) {
			addInicio(aluno);
		}else if (posicao==total) {
			addFim(aluno);
		}else {
			addMeio(posicao, aluno);
		}		
	}
	
	public void remElemento(Aluno aluno) {
		No aux = this.head, prox = head.getProximo();
		while(aux!=null) {
			if(prox.elemento==aluno) {
				aux.setProximo(prox.getProximo());
			}else if (aux.elemento==aluno){
				head=aux.getProximo();
			}
			aux=aux.getProximo();
			prox=prox.getProximo();
		}
	}
	
	public String mostraPrimeiro() {
		return head.elemento.toString();
	}
	
	public String mostraUltimo() {
		return elemento.elemento.toString();
	}
	
	public void mostraTudo() {
		No aux = head;
		while(aux!=null) {
			System.out.println(aux.elemento.toString());
			aux=aux.proximo;
		}
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao>=0 && posicao<=total;
	}
	
}
