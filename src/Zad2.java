
public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 4;
		int tabfi[] = { 3, 1, 4, 2 };
		char word[] = { 'c', 'r', 'y', 'p', 't', 'o', 'g', 'r', 'a', 'p', 'h', 'y' };
		int temp[] = { 3, 1, 4, 2 };

		int check = word.length;
		char result[] = new char[check];
		char decoded[] = new char[check];

		int counter = 0;
		System.out.println(check);

		for (int i = 0; i < check; i++) {
			result[i] = word[temp[counter] - 1];
			temp[counter] += d;
			counter++;
			if (counter % d == 0) {
				counter = 0;
			}
			System.out.print(result[i]);

		}

		counter = 0;
		for (int i = 0; i < check; i++) {
			decoded[tabfi[counter] - 1] = result[i];
			tabfi[counter] += d;
			counter++;
			if (counter % d == 0) {
				counter = 0;
			}

		}
		System.out.println();
		for (int i = 0; i < check; i++) {
			System.out.print(decoded[i]);
		}
	}

}
