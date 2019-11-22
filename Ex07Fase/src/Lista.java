
public class Lista {
	private Posicao head;
	
	public void addLista(Posicao novo) {
		if(head==null) {
			head=novo;
		}else if(novo.posicao>head.posicao){
			Posicao aux = head;
			while(aux!=null) {
				if(novo.posicao<=aux.posicao) {
					novo.setProximo(aux.getProximo());
					aux.setProximo(novo);
					break;
				}else if(aux.getProximo()==null){
					aux.setProximo(novo);
					break;
				}
				aux=aux.getProximo();
			}
		}else if(novo.posicao<=head.posicao) {
			novo.setProximo(head);
			head=novo;
		}
	}
	
	public void mostratodos() {
		Posicao aux = head;
		while(aux!=null) {
			System.out.println(aux.toString());
			aux=aux.getProximo();
		}
	}
	
	public int totalColocados(int Total) {
		Posicao aux = head;
		int colocados=1;
		for(int i=0;i<Total;i++) {
			if(aux.equals(aux.getProximo())) {
				while(aux.equals(aux.getProximo())) {
					colocados++;			
					aux=aux.getProximo();
				}
			}else colocados++;
			if(aux.getProximo()==null) break;
		}
		return colocados;
	}
}
