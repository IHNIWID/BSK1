import java.io.*;
import java.util.*;

public class Zad1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(new File("imienazwisko.txt"));
		String text = name.nextLine();
		System.out.println(text);

		int length = text.length();
		char sample[] = new char[length];
		char coded[] = new char[length];
		char decoded[] = new char[length];
		int k = 10;// wiersze
		// int column = length/k;//kolumny
		// int counter = 0;

		for (int i = 0; i < length; i++) {

			char temp = 0;
			temp = text.charAt(i);
			System.out.println(temp);
			System.out.println(text.length());
			sample[i] = temp;

		}

		// CHECK
		/*
		 * for(int i=0; i<k; i++){
		 * 
		 * System.out.println("wiersz"); for(int j=0; j<column; j++){
		 * 
		 * System.out.println(matrix[i][j]);
		 * 
		 * 
		 * } }
		 */

		// System.out.println(matrix[2][3]);
		coded = Code(sample, k, length);
		for (int i = 0; i < length; i++) {
			System.out.print(coded[i]);
		}

		try {
			Thread.sleep(1000); // 1000 milliseconds is one second.
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println();
		decoded = Decode(coded, k, length);
		// check
		for (int i = 0; i < length; i++) {
			System.out.print(decoded[i]);
		}
		//

	}

	public static char[] Code(char tab[], int y, int length) {// x=k, y=column

		char coded[] = new char[length];
		char temp[][] = new char[y][length];
		int counter = 0;
		int mode = 0;

		// check
		/*
		 * 
		 * for(int i=0;i<length/4;i++){ System.out.println(coded[i]); }
		 */
		if (y <= 1 || y >= length) {
			coded = tab;
			System.out.println("BEZ SENSU");
		}

		else {
			for (int i = 0; i < length; i++) {
				if (mode == 0) {// dodajacy
					// System.out.println(counter + " 1u" +" ");
					temp[counter][i] = tab[i];
					System.out.println(temp[counter][i] + "1T");
					counter++;

					if (counter == y) {
						mode = 1;
						counter -= 2;
						i++;
					}
				}

				if (y == 2 && i == length && length % 2 == 0) {// MATKO JAK
																// ŒMIESZNIE ;_;

					mode = 0;

				}

				if (mode == 1) {// odejmujacy
					// System.out.println(counter + " 2u"+" ");
					temp[counter][i] = tab[i];
					System.out.println(temp[counter][i] + "2T");
					counter--;

					if (counter == -1) {
						mode = 0;
						counter += 2;

					}
				}
			}

			counter = 0;

			for (int i = 0; i < y; i++) {

				for (int j = 0; j < length; j++) {
					if (Character.isLetter(temp[i][j]) == true) {

						coded[counter] = temp[i][j];
						System.out.println(coded[counter]);
						counter++;
					}
				}

			}

		}
		return coded;

	}

	public static char[] Decode(char tab[], int k, int length) {

		char decoded[] = new char[length];
		int key;
		int decoder[][] = new int[2][k];
		int space = 0;

		key = (2 * k) - 2;// -2 moze byc -3+1 bo indeks od 0
		System.out.println(key);

		for (int i = 0; i < k; i++) {

			for (int j = 0; j < 2; j++) {

				if (i == 0 || i == k - 1) {
					decoder[j][i] = key;
				} else {
					// System.out.println("WESZLO");
					if (j == 0) {
						decoder[j][i] = key - space;
						System.out.println(decoder[j][i]);
					}
					if (j == 1) {
						decoder[j][i] = 0 + space;
						System.out.println(decoder[j][i] + "U");
					}
				}

			}

			space += 2;
			// tab
		}
		// check
		for (int i = 0; i < k; i++) {
			System.out.println();
			for (int j = 0; j < 2; j++) {
				System.out.print(decoder[j][i]);
			}
		}

		int verse = 0;
		int index = 0;
		int column = 0;
		int adder = 0;

		for (int i = 0; i < length; i++) {

			System.out.println(index + "" + tab[i]);
			decoded[index] = tab[i];
			index += decoder[column][verse];

			if (index >= length) {
				verse++;
				adder++;
				index = adder;
				column = 1;
			}

			column++;
			if (column == 2) {
				column = 0;
			}

		}

		return decoded;

	}
}
