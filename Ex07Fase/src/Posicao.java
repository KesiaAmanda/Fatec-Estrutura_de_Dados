
public class Posicao {
	int posicao;
	Posicao proximo;
	
	public Posicao(int posicao) {
		this.posicao = posicao;
	}
	
	public void setProximo(Posicao proximo) {
		this.proximo = proximo;
	}
	
	public Posicao getProximo() {
		return proximo;
	}
	
	@Override
	public String toString() {
		return Integer.toString(posicao);
	}
	
	public boolean equals(Posicao prox) {
		if(prox==null) return false;
		return posicao==prox.posicao;
	}
}
