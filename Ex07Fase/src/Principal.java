import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int totalCompetidores = Integer.parseInt(JOptionPane.showInputDialog("Total compedidores:"));
		int totalClassificados = Integer.parseInt(JOptionPane.showInputDialog("Total Classificados:"));
		Lista l = new Lista();
		
		for(int i=0;i<totalCompetidores;i++) {
			int posicao = Integer.parseInt(JOptionPane.showInputDialog("Posicao:"));
			Posicao a = new Posicao(posicao);
			l.addLista(a);
		}
		
		l.mostratodos();
		
		System.out.println("Saida: "+l.totalColocados(totalClassificados));
	}
	
}
