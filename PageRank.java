import javax.swing.*;

public class PageRank{
	
	static String s = JOptionPane.showInputDialog("Tregoni numrin e pikave(kulmeve) të grafit: ");
	static int nrPikave = new Integer(s).intValue();
	static int[][] v = new int[nrPikave][nrPikave];
	static double [][] vF = new double[nrPikave][nrPikave];
	
	public static void main(String[] args){	
		String s3 = JOptionPane.showInputDialog("Numri i lidhjeve mes pikave: ");
		int t1 = new Integer(s3).intValue();
		
		for(int i = 0;i<t1;i ++){
			String pika1 = JOptionPane.showInputDialog("Lidhni pikën numër: ");
			String pika2 = JOptionPane.showInputDialog("me pikën numër: ");
			int p1 = new Integer(pika1).intValue();
			int p2 = new Integer(pika2).intValue();
			v[p1][p2]++;		
		}
		
		for(int i = 0;i<nrPikave;i++){
			for(int j = 0;j<nrPikave;j++){
				int l = shumaERreshtit(i);
				if(l == 0){
					l = 1;
				}
				vF[i][j] = v[i][j]*(90.0/l) + 2;
				System.out.print(vF[i][j] + "      ");
				if(j == nrPikave-1){
					System.out.println();
				}
			}
		}	
		
  	}
	
	public static int shumaERreshtit(int x){
		int rez = 0;
		for(int i = 0;i<nrPikave;i++){
			rez = rez + v[x][i];
		}
		return rez;
	}
}
