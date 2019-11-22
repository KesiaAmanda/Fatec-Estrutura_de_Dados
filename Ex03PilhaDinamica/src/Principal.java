
public class Principal {
	public static void main(String[] args) {
		Livro l1 = new Livro("Livro 1", 2019, 29.99);
		Livro l2 = new Livro("Livro 2", 2017, 15.99);
		Livro l3 = new Livro("Livro 3", 2015, 27.99);
		Livro l4 = new Livro("Livro 4", 2014, 17.99);
		
		Pilha p = new Pilha();
		
		p.PUSH(l1);
		p.PUSH(l2);
		p.PUSH(l3);
		p.PUSH(l4);
		
		System.out.println("===================");
		System.out.println("Topo: \n"+p.TOP());
		
		System.out.println("===================");
		System.out.println("Todos Elementos:");
		p.MostraLivros();
		
		System.out.println("===================");
		System.out.println("Removendo primeiro livro:");
		
		p.POP();
		
		p.MostraLivros();
		
		System.out.println("===================");
		System.out.println("Topo: \n"+p.TOP());
	}
}
