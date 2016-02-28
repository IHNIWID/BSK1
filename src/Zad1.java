import java.io.*;
import java.util.*;

public class Zad1 {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub		
		Scanner name = new Scanner(new File ("imienazwisko.txt"));
		String text = name.nextLine();
		System.out.println(text);
		
		int length = text.length();
		char sample[] = new char [length];
		int k = 2;//wiersze
		int column = length/k;//kolumny		
		int counter = 0;
		
		for(int i=0;i<length;i++){
			
			char temp=0;
			temp=text.charAt(i);
			System.out.println(temp);
			System.out.println(text.length());
			sample[i]=temp;
			
		}
		
		
				
		//CHECK
		 /*for(int i=0; i<k; i++){
			
				System.out.println("wiersz");
			for(int j=0; j<column; j++){
				
				System.out.println(matrix[i][j]);
				
				
			}
		}*/
		
		//System.out.println(matrix[2][3]);
		Code(sample, k, length);
		
	}

	public static char[] Code(char tab[], int y, int length){//x=k, y=column
		
		char coded[]= new char[length];
		char temp[][]= new char [y][length];		
		int counter=0;
		int mode=0;
		
		//check
		/*
		 * 
		 * for(int i=0;i<length/4;i++){
		 * System.out.println(coded[i]);
		 * }
		 */
		if(y<=1||y>=length){
			coded=tab;
			System.out.println("BEZ SENSU");
		}	
		
		else{
		for(int i = 0;i<length;i++){
			if(mode==0){//dodajacy
				//System.out.println(counter + " 1u" +"  ");
				temp[counter][i]=tab[i];
				System.out.println(temp[counter][i] + "1T");
				counter++;
				
					if(counter==y){
						mode=1;
						counter-=2;
						i++;
					}
			}
			
			if(y==2 && i==length && length%2==0){//MATKO JAK ŒMIESZNIE ;_;
			
				mode=0;
				
			}
			
			if(mode==1){//odejmujacy
				//System.out.println(counter + " 2u"+"  ");
				temp[counter][i]=tab[i];
				System.out.println(temp[counter][i] + "2T");
				counter--;
				
					if(counter==-1){
						mode=0;
						counter+=2;
						
					}
			}
		}
		
		counter=0;
		
		for(int i=0;i<y;i++){
			
			for(int j=0;j<length;j++){
				if(Character.isLetter(temp[i][j])==true){
					
					coded[counter]=temp[i][j];		
					System.out.println(coded[counter]);
					counter++;
				}
			}
			
		}
		
	}
		return coded;
	
	}
}
