
public class Aluno {
	int num;
	String nome;
	Aluno proximo;
	
	public Aluno(int num, String nome) {
		this.num = num;
		this.nome = nome;
	}
	
	public Aluno getProximo() {
		return proximo;
	}
	
	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return Integer.toString(num)+": "+nome;
	}
}
