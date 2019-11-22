
public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jose", "jose@bol.com");
		Pessoa p2 = new Pessoa("Maria", "maria@bol.com");
		Pessoa p3 = new Pessoa("Rijuuka", "riu@bol.com");
		Pessoa p4 = new Pessoa("Pujhin", "jhin@bol.com");
		Pessoa p5 = new Pessoa("Pujhin", "jhin@bol.com");
		Pessoa p6 = new Pessoa("Pujhin", "jhin@bol.com");
		
		Fila f = new Fila();
		
		f.EntraFila(p1);
		f.EntraFila(p2);
		f.EntraFila(p3);
		f.EntraFila(p4);
		f.EntraFila(p5);
		
		f.MostraTodos();
		
		System.out.println("============");
		
		System.out.println(f.saiFila());
		
		System.out.println("============");
		
		f.MostraTodos();
		
		System.out.println("============");
		f.EntraFila(p6);
		f.MostraTodos();
	}
}
