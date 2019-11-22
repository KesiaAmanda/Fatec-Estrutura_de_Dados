
public class Livro {
	String nome;
	int ano;
	double preço;
	Livro anterior;
	
	public Livro(String nome, int ano, double preço) {
		this.nome = nome;
		this.ano = ano;
		this.preço = preço;
	}
	
	public Livro getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Livro anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+" Ano: "+ano+" Preço: "+preço;
	}
}
