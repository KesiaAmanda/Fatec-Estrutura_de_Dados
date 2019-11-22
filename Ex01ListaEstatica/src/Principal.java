
public class Principal {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Maria");
		Aluno a2 = new Aluno("Camilla");
		Aluno a3 = new Aluno("Rijuuka");
		
		Vetor v = new Vetor();
		
		v.adiciona(a1);
		v.adiciona(a2);
		
		System.out.println(v);
		
		System.out.println(v.contem(a1));
		System.out.println(v.contem(a3));
		
		System.out.println(v.pega(1));
		
		v.remove(1);
		
		System.out.println(v);
		
		v.adiciona(a3);
		
		System.out.println(v);
		
		v.adiciona(a2);
		
		System.out.println(v);
		
		Aluno a4 = new Aluno("Miriam");
		
		v.adiciona(3,a4);
		
		System.out.println(v);
		
		v.remove(3);
		
		System.out.println(v);
	}
}
