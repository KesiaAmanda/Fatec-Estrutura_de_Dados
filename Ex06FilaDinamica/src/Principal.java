
public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jose", "jose@bol.com");
		Pessoa p2 = new Pessoa("Maria", "maria@bol.com");
		Pessoa p3 = new Pessoa("Rijuuka", "riu@bol.com");
		Pessoa p4 = new Pessoa("Pujhin", "jhin@bol.com");
		Pessoa p5 = new Pessoa("Caju", "caju@bol.com");
		Pessoa p6 = new Pessoa("Candy", "candy@bol.com");
		
		Fila f = new Fila();
		
		System.out.println("============\nTodos Elementos:");
		
		f.EntraFila(p1);
		f.EntraFila(p2);
		f.EntraFila(p3);
		f.EntraFila(p4);
		f.EntraFila(p5);
		
		f.MostraTodos();
		
		System.out.println("============\nRemovendo da Fila:");
		
		System.out.println(f.saiFila());
		
		System.out.println("============\nTodos Elementos:");
		
		f.MostraTodos();
		
		System.out.println("============\nAdicionando outro Elemento:");
		f.EntraFila(p6);
		f.MostraTodos();
		
		System.out.println("============\nAlterando Elemento:");
		f.AlteraElemento(p3, "barra_da_rijuuka@gmail.com");
		f.MostraTodos();
		
	}
}
