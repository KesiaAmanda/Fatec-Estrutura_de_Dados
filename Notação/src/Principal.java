import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Informe a notação infixa:");
		System.out.print("Infixa:		"+ entrada +"\nPos-fixa:	");
		System.out.println(Converte(entrada));
	}
	
	//a*(b+c)*d
	//((a+b)*c)+(((d/e)-f)*g)
	//(5*8)-4)+3
	//a*(b+c)*d
	//a*b+c
	//a+b*c
	
	public static char[] Converte(String entrada) {
		char[] vet = entrada.toCharArray();
		int auxsaida =0; 
		boolean priori=false;
		char[] saida = new char[vet.length];
		Pilha p = new Pilha();
		
		for(int i=0;i<vet.length;i++) {
			if (!Operador(vet[i])) {
				saida[auxsaida]=vet[i];
				auxsaida++;
			}else {
				if(vet[i]=='(') priori=true;
				else if(!p.verificaPilha()&&!priori) {
					if(Prioridade(p.TOP())<Prioridade(vet[i])) {
						if(Prioridade(p.TOP())!=1) {
							saida[auxsaida]=p.POP();
							auxsaida++;
						}
					}
				}
				p.PUSH(vet[i]);
			}
			
			if(!p.verificaPilha()) {
					if(vet[i]==')') {
					p.POP();
					if(!p.verificaPilha()) {
						saida[auxsaida]=p.POP();
						auxsaida++;
					}
					priori=false;
				}else if(Prioridade(vet[i])==1) {
					p.POP();
				}
			}
			
		}
		
		while(!p.verificaPilha()) {
			if(Prioridade(p.TOP())==1) {
				p.POP();
			}else{
				saida[auxsaida]=p.POP();
				auxsaida++;
			}
		}
		
		return saida;
	}
	
	public static boolean Operador(char verifica) {
		return verifica == '+'||verifica == '-'||verifica == '*'||verifica == '/'||verifica == '('||verifica == ')'||verifica == '^';
	}
	
	public static int Prioridade(char verifica) {
		if(verifica == '(' || verifica == ')') {
			return 1;
		}else if(verifica == '^') {
			return 2;
		}else if(verifica == '*'|| verifica == '/') {
			return 3;
		}else if(verifica == '+'|| verifica == '-') {
			return 4;
		}else{
			return -1;
		}
	}
}
