
public class Principal {
	public static void main(String[] args) {
		Lista l = new Lista();
		
		l.addLista(10);
		l.addLista(20);
		l.addLista(30);
		
		System.out.println(l.melhorTempo());
	}
}
