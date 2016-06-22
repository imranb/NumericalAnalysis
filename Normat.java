import java.util.*;

public class Normat {
	
	private static Scanner sc = new Scanner(System.in);
		
	public static double[] Vektori(int num) {
		System.out.println("Jep gjatësinë e vektorit " + num);
		int a = sc.nextInt();
		double[] v = new double[a];
		for (int i = 0; i < v.length; i++) {
			System.out.println("Vektori " + num + ": Jep vlerën e " + (i + 1) + "-te");
			v[i] = sc.nextInt();
		}
		return v;
	}
	
	public static double[][] Matrica(int num) {
		System.out.println("Jep numrin e rreshtave te matricës " + num);
		int a = sc.nextInt();
		System.out.println("Jep numrin e shtyllave te matricës " + num);
		int b = sc.nextInt();
		double[][] m = new double[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.println("Matrica " + num + ": Jep vlerën e A[" + i + "][" + j + "]");
				m[i][j] = sc.nextInt();
			}
		}
		return m;
	}
	
	//L2 norma
	public static double l2Norm(double[] v) {
		double result = 0;
		for (int i = 0; i < v.length; i++) {
			result += v[i] * v[i];
		}
		return Math.sqrt(result);
	}
	
	//L-Infinit norma
	public static double lInfinitNorm(double[] v) {
		double max = Math.abs(v[0]);
		
		for (int i = 0; i < v.length; i++) {
			if (Math.abs(v[i]) > max) {
				max = Math.abs(v[i]);
			}
		}
		return max;
	}
	
	//Norma e Frobeniusit
	public static double frobeniusNorm(double[][] m) {
		double result = 0.0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				result += Math.pow(Math.abs(m[i][j]), 2);
			}
		}
		return Math.sqrt(result);
	}
	
public static void main(String[]args){
		
		System.out.println("Shtyp:\n" 
				+ "\n 1 - L2 norma "
				+ "\n 2 - L infinit norma"); 
		
		int input = sc.nextInt();

		if(input == 1) System.out.println("L2 norma: " + l2Norm(Vektori(1)));
		if(input == 2) System.out.println("L infinit norma: " + lInfinitNorm(Vektori(1)));
		if(input == 3) System.out.println("Frobenius norma: " + frobeniusNorm(Matrica(1)));
		
	}

}
