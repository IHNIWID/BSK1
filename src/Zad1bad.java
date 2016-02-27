import java.io.*;
import java.util.*;

public class Zad1bad {


	static int[] seed={1,4,3,2};
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			//File file = new File ("imienazwisko.txt");			
		Scanner name = new Scanner(new File ("imienazwisko.txt"));
		String text = name.nextLine();
		System.out.println(text);
		
		int length = text.length();
		char sample[] = new char [length];
		int k = 3;//wiersze
		int column = length/k;//kolumny		
		int counter = 0;
		
		for(int i=0;i<length;i++){
			
			char temp=0;
			temp=text.charAt(i);
			System.out.println(temp);
			System.out.println(text.length());
			sample[i]=temp;
			
		}
		
		char matrix[][] = new char [k][column]; 
		
		for(int i=0; i<k; i++){
			
			for(int j=0; j<column; j++){
				
				matrix[i][j]=sample[counter];
				counter++;
				
				
			}
		}
				
		//CHECK
		 /*for(int i=0; i<k; i++){
			
				System.out.println("wiersz");
			for(int j=0; j<column; j++){
				
				System.out.println(matrix[i][j]);
				
				
			}
		}*/
		
		//System.out.println(matrix[2][3]);
		Code( matrix, k, column, length);
		
	}

	public static char[] Code(char tab[][], int x, int y, int length){//x=k, y=column
		
		char coded[]= new char[length];		
		int used_seed=0;
		int counter=0;
		
		for(int i=0; i<y; i++){
			
			used_seed=seed[i]-1;
			
			for(int j=0;j<x;j++){
				
					coded[counter]=tab[j][used_seed];
					counter++;
					System.out.println(coded[counter-1]);
				
			}
		}
		
		return coded;
	
	}
}
