package matriz;

import java.util.Scanner;
import java.util.Locale;

public class matriz {
	public static void main(String args[]) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m,n,f;
		
		System.out.println("Lines: ");
		m = sc.nextInt();
		
		System.out.println("Columns: ");
		n = sc.nextInt();
		
		int [][]mat = new int[m][n];
		
		System.out.println("Matriz: ");//digitar matriz;
		
		for(int i = 0; i < mat.length;i++)
			for(int j = 0;j < mat[i].length;j++)
				mat[i][j] = sc.nextInt();
		
		System.out.println("what number do you want to find the position ? ");
		f = sc.nextInt();
		
		for(int i = 0; i < mat.length;i++)//encotrar o numero pedido e indicar os numeros que estão em volta dele na matriz
			for(int j = 0;j < mat[i].length;j++)
				if(mat[i][j] == f) {
					System.out.println("positions: "+ i +","+j);
					
					
					if(j > 0)
						System.out.println("Left :" + mat[i][j-1]);
					if(j != mat[i].length - 1)
						System.out.println("Right :" + mat[i][j+1]);
					if(i > 0)
						System.out.println("Up :" + mat[i-1][j]);
					if(i != mat.length-1)
						System.out.println("Down :" + mat[i+1][j]);
				}
		
		
		sc.close();
		
	}
}
