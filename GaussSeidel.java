public class GaussSeidel {
   
	static int N = 5; 	//nr i iteracioneve
    static double TOL = 0.001;	//toleranca
    static int n = 3;   //nr i ekuacioneve

    static double[][] a = {{ 3, -1, 1}, 
				           { 3, 6, 2 },
				           { 3, 3, 7 }} ;
    
   static double[] b = { 1, 0, 4 }; 	 //gjymtyrët e lira
	static double x0[] = {1, 1, 1, 1}; 	  //vlerat fillestare x0
   static double x[] = new double[n]; 	
	static int k = 1;
   
	public static void Gauss(double[][] A, double[] B, int N, double TOL, double[] x0) {
		while (k <= N) {
			for (int i = 0; i < n; i++) {
				x[i] = (B[i] - sum1(i) - sum2(i) ) / A[i][i];
				x0[i] = x[i];
				System.out.print(x[i] + " -- ");
				if ((i+1)%n == 0) {
					System.out.println();
				}
			}
			k++;
		}
	}

   public static double sum1(int A){
		double sum = 0;
		for (int j = 0; j < A; j++) {
					sum += a[A][j] * x[j];
				}
		return sum;
	}

	public static double sum2(int A){
		double sum = 0;
		for (int c = A+1; c < n; c++) {
					sum += a[A][c] * x0[c];
				}
      return sum;
	}
   

	public static void main(String[] args) {
		Gauss(a, b, N, TOL, x0);
	}

}
