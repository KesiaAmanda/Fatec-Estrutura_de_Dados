
public class Pilha {
	private Livro livros[] = new Livro[2];
	private int total = 0;
	
	public void PUSH(Livro novo) {
		GarantaEspaco();
		livros[total]=novo;
		total++;
	}
	
	public String POP() {
		if(verificaPilha()) {
			throw new IllegalArgumentException("Pilha Vazia!");
		}
		Livro aux = livros[total-1];
		livros[total-1]=null;
		total--;
		return aux.toString();
	}
	
	public String TOP() {
		return livros[total-1].toString();
	}
	
	public void MostraLivros() {
		for(int i=total-1;i>=0;i--) {
			System.out.println(livros[i].toString());
		}
	}
	
	
	public boolean verificaPilha() {
		return livros[0]==null;
	}
	
	private void GarantaEspaco() {
		if(total==livros.length) {
			Livro novaArray[] = new Livro[livros.length+5];	
			
			for(int i=0;i<total;i++) {
				novaArray[i]=livros[i];
			}
			livros=novaArray;
		}
	}
}
