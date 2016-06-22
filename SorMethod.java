import javax.swing.*;
public class SorMethod {
	
	static int n = new Integer(JOptionPane.showInputDialog("Numri i ekuacioneve: ")).intValue();
    static int k = 1;
	static int N = new Integer(JOptionPane.showInputDialog("Numri maksimal i iterimeve: ")).intValue();
    static double w = new Double(JOptionPane.showInputDialog("W (omega): ")).doubleValue();
    static double TOL = 1E-3;
    
	static double a[][] = new double[n][n];
	static double b[]  = new double [n];
	static double x0[] = new double[n];
	
	static double x[] = new double[n]; 	
	
	
	public static void main(String[] args) {
		
		double [] x0 = {0,0,0};
		double [][] a = {{10, -1, 0}, {-1, 10, -2}, {0, -2, 10}};
		double [] b = {9, 7, 6};
		
		while (k<=N){
			for(int i=0;i<n;i++){
				x[i] = (1-w)*x0[i]+ (w*(-shuma(i)+b[i]))/a[i][i];
			}

			if(norma(x,x0)<TOL){
				for(int p = 0;p<n; p++){
					System.out.println("x[" + p + "] = " + x[p] );
				}
				System.exit(0);
			}
			
			k++;
			for(int i = 0;i<n;i++){
				x0[i] = x[i];
			}
		}
		System.out.println("Procedura dështoi.");
	}

	public static double shuma(int i){
		double shuma = 0;
		for (int j = 0; j<n;j++){
			if(j<i){
				shuma = shuma + a[i][j] * x[j];
			}else if(i>j){
				 shuma = shuma + a[i][j] * x0[j];
			}
		}
		
		return shuma;
	}
	
	   public static double norma(double[] y, double[] x)
	    {
	        double max = 0;
	        for(int i=0;i<y.length;i++)
	        {   if(Math.abs(y[i] - x[i]) > max)
	            {
	                max = Math.abs(y[i] - x[i]);
	            }
	        }
	        return max;
	    }
}

