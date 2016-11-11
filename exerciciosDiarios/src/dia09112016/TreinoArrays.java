package dia09112016;

public class TreinoArrays {
	
	
	
	public TreinoArrays() {
			
		int [] golos = new int [2];
		
		golos [0] = 1;
		golos [1] = 1;
		
		int [] portoBenfica = {1,1};
		
		int [] sportingArouca = {3,0};
		
		int [] maritimoBraga = {1,0};
		
		int [][] jogosGrandes = new int [3][2];
		jogosGrandes[0][0] = portoBenfica[0];
		jogosGrandes[0][1] = portoBenfica[1];
		jogosGrandes[1][0] = sportingArouca[0];
		jogosGrandes[1][1] = sportingArouca[1];
		jogosGrandes[2][0] = maritimoBraga[0];
		jogosGrandes[2][1] = maritimoBraga[1];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.print("[" + jogosGrandes[i][j] + "]");
			}
			System.out.println("\n");
		}
	
	}
	

}
