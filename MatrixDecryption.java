import javax.swing.JOptionPane;

public class MatrixDecryption {

	public static void main(String[] args) {
		String [][] a = new String [2][2];
		int [][] b = new int[2][2];
		char [][] c = new char[2][2];
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				a[i][j] = JOptionPane.showInputDialog("Numri i rradhës: ");
				b[i][j] = new Integer(a[i][j]).intValue();
			}
		}
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				c[i][j] = (char) (b[i][j] * 3);
				System.out.print(c[i][j]);
			}
		}
	}

}