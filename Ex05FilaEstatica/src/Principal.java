
public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jose", "jose@bol.com");
		Pessoa p2 = new Pessoa("Maria", "maria@bol.com");
		Pessoa p3 = new Pessoa("Rijuuka", "riu@bol.com");
		Pessoa p4 = new Pessoa("Pujhin", "jhin@bol.com");
		
		Fila f = new Fila();
		
		f.EntraFila(p1);
		f.EntraFila(p2);
		f.EntraFila(p3);
		f.EntraFila(p4);
		
		System.out.println("============\nTodos Elementos:");
		
		f.MostraTodos();
		
		System.out.println("============\nSaiu da fila:");
		
		System.out.println(f.saiFila());
		
		System.out.println("============\nTodos Elementos:");
		
		f.MostraTodos();
		
		System.out.println("============\nAltera Elemento:");
		
		f.alteraEmail(p2, "maria_madalena@gmail.com");
		
		f.MostraTodos();
		
		System.out.println("============");
	}
}
