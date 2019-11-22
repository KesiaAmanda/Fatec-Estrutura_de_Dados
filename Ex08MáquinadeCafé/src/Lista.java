
public class Lista {
	private int[] andares = new int[3];
	private int total = 0;
	
	public void addLista(int pessoas) {
		andares[total]=pessoas;
		total++;
	}
	
	public int melhorTempo() {
		int[] nova = new int[3];
		nova[0]=andares[1]+(andares[2]*2);
		nova[1]=andares[0]+andares[2];
		nova[2]=(andares[0]*2)+andares[1];
		
		if (nova[0]<=nova[1] && nova[0]<=nova[2]) {
			return nova[0]*2;
		}else if(nova[1]<=nova[2]) {
			return nova[1]*2;
		}else {
			return nova[2]*2;
		}
	}
}
