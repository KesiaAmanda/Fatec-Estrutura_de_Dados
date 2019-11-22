
public class Principal {
	public static void main(String[] args) {
		Aluno a1 = new Aluno(1,"Maria");
		Aluno a2 = new Aluno(5,"Camilla");
		Aluno a3 = new Aluno(7,"Rijuuka");
		Aluno a4 = new Aluno(2,"Miriam");
		
		Lista l = new Lista();
		
		l.addFim(a1);
		l.addFim(a2);
		l.addFim(a3);
		
		l.mostraTudo();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
				
		l.remElemento(a2);
		l.remElemento(a4);
		
		l.mostraTudo();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Primeiro elemento: " + l.mostraPrimeiro());
		
		System.out.println("Ultimo elemento: " + l.mostraUltimo());
	}
}
