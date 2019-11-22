
public class Aluno {
	int num;
	String nome;
	
	public Aluno(int num, String nome) {
		this.num = num;
		this.nome = nome;
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
