import javax.swing.JOptionPane;

public class MatrixEncryption {

	public static void main(String[] args) {
		String [][] a = new String [2][2];
		char [][] b = new char [2][2];
		int [][] c = new int[2][2];
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				a[i][j] = JOptionPane.showInputDialog("Shkronja e rradhës: ");
				b[i][j] = a[i][j].charAt(0);
			}
		}
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				c[i][j] = (int) (b[i][j] / 3);
				System.out.print(c[i][j] + "   ");
			}
		}
	}

}
