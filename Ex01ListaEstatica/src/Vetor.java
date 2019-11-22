import java.util.Arrays;

public class Vetor {
	private Object[] alunos = new Object[2];
	private int tamanho=0;
	
	public void adiciona(Aluno aluno) {
		garantaEspaco();
		alunos[tamanho]=aluno;
		tamanho++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao Inválida");
		}
		garantaEspaco();
		for(int i = tamanho-1; i>=posicao; i--) {
			alunos[i+1]=alunos[i];
		}
		alunos[posicao]=aluno;
		tamanho++;
	}
	
	
	public Aluno pega(int posicao) {
		if (!verificaPosicao(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida.");
		}
		return (Aluno) alunos[posicao];
	}
	
	public void remove(int posicao) {
		if (!verificaPosicao(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida.");
		}
		for(int i = posicao;i<tamanho-1;i++) {
			alunos[i]=alunos[i+1];
		}
		alunos[tamanho-1]=null;
		tamanho--;
	}
	
	public boolean contem(Aluno aluno) {
		for(int i=0;i<tamanho;i++) {
			if(alunos[i]==aluno) return true;
		}
		return false;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public void garantaEspaco() {
		if(tamanho == alunos.length) {
			Object[] novaArray = new Object[alunos.length+10];
			for(int i = 0; i<tamanho; i++) {
				novaArray[i]=alunos[i];
			}
			this.alunos=novaArray;
		}
	}
	
	private boolean verificaPosicao(int posicao) {
		return posicao>=0 && posicao<tamanho;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao>=0 && posicao<=tamanho;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
