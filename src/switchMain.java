import java.util.Scanner;

public class switchMain {
	
	public static void calcMinMax(int m[][], int v[][]) {
		Scanner sc = new Scanner(System.in);
		int r1, r2;
		int min, max;
		int min2, max2;
		
		System.out.println("Quale riga vuoi nella prima matrice?");
		r1 = sc.nextInt();
		System.out.println("Quale riga vuoi nella seconda matrice?");
		r2 = sc.nextInt();
		
		min = m[r1][0];
		max = m[r1][0];
		
		for(int i=0; i<m[r1].length; i++) {
			if(min > m[r1][i]) {
				min = m[r1][i];
			}
			if(max < m[r1][i]) {
				max = m[r1][i];
			}
		}
		
		min2 = v[r2][0];
		max2 = v[r2][0];
		
		for(int i=0; i<v[r2].length; i++) {
			if(min2 > v[r2][i]) {
				min2 = v[r2][i];
			}
			if(max2 < v[r2][i]) {
				max2 = v[r2][i];
			}
		}
		
		System.out.println("Prima matrice: Min "+min+" Max "+max);
		System.out.println("Seconda matrice: Min "+min2+" Max "+max2);
		
	}
	public static void mediaRigCol(int m[][], int v[][]) {
		Scanner sc = new Scanner(System.in);
		int r1, r2;
		int somma = 0, somma2 = 0;
		int media, media2;
		
		System.out.println("Quale riga vuoi nella prima matrice?");
		r1 = sc.nextInt();
		System.out.println("Quale riga vuoi nella seconda matrice?");
		r2 = sc.nextInt();
		
		for(int i=0; i<m[r1].length; i++) {
			somma = somma + m[r1][i];
		}
		
		for(int i=0; i<v[r2].length; i++) {
			somma2 = somma2 + v[r2][i];
		}
		
		media = somma / r1;
		media2 = somma2 / r2;
		
		System.out.println("Media prima matrice: "+media);
		System.out.println("Media seconda matrice: "+media2);
	}
	
	public static void carVisMat(int m[][]) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[i][j] = (int)(Math.random() * 50);
			}
		}
	}
	
	public static void stampaMatrice(int m[][]) {
		for (int v[] : m) {
			for (int e : v) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] matrix1, matrix2;
		int cell1, cell2;
		int n;
		
		System.out.println("Inserisci il numero di righe della prima matrice:");
		cell1 = sc.nextInt();
		System.out.println("Inserisci il numero di righe della seconda matrice:");
		cell2 = sc.nextInt();
		
		matrix1 = new int [cell1][cell1];
		matrix2 = new int [cell2][cell2];
		
		carVisMat(matrix1);
		carVisMat(matrix2);
		System.out.println();
		stampaMatrice(matrix1);
		System.out.println();
		stampaMatrice(matrix2);
		System.out.println();
		
		do {
			System.out.println("Inserisci un numero tra 1 e 4");
			n = sc.nextInt();
		} while (n<1 || n>4);
		
		switch(n) {
		case 1:
			calcMinMax(matrix1, matrix2);
			break;
		case 2:
			mediaRigCol(matrix1, matrix2);
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			//System.err.println("Inserire un numero tra 1 e 4");
			break;
		}
		

	}

}
