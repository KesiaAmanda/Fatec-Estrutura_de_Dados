
public class No {
	No proximo;
	Aluno elemento;
	
	public No(Aluno elemento) {
		this.elemento = elemento;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	public No getProximo() {
		return proximo;
	}
}
