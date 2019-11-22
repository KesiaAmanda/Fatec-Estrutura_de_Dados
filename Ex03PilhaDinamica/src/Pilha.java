
public class Pilha {
	private Livro topo, anterior;
	
	public void PUSH(Livro livro) {
		if(anterior==null) {
			anterior=livro;
		}else{
			topo=livro;
			topo.setAnterior(anterior);
			anterior=topo;
		}
	}
	
	public void POP() {
		topo=topo.getAnterior();
		anterior=topo;
	}
	
	public Livro TOP() {
		return topo;
	}
	
	public void MostraLivros() {
		Livro aux = topo;
		
		while(aux!=null) {
			System.out.println(aux.toString());
			aux=aux.getAnterior();
		}
	}
}
