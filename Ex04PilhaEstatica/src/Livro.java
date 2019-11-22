
public class Livro {
	String nome;
	int ano;
	double preço;
	
	public Livro(String nome, int ano, double preço) {
		this.nome = nome;
		this.ano = ano;
		this.preço = preço;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAno() {
		return ano;
	}
	
	public double getPreço() {
		return preço;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setPreço(double preço) {
		this.preço = preço;
	}
		
	@Override
	public String toString() {
		return "Nome: "+nome+" Ano: "+ano+" Preço: "+preço;
	}
}
