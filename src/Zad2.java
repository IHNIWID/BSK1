
public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 6;
		int tabfi[] = { 1,2,3,4,5,6 };
		//char word[] = { 'c', 'r', 'y', 'p', 't', 'o', 'g', 'r', 'a', 'p', 'h', 'y' };
		char word[] ={'j','a','k','u','b'};
		int temp[] = {1,2,3,4,5,6 };

		int check = word.length;
		
		
		if(check%d!=0){			
			int temp1=check%d;
			check+=d-temp1;				
		}
		char upword[]=new char[check];
		char result[] = new char[check];
		System.out.println(check);
		for(int i=0;i<check;i++){
			if(i>=word.length){
				upword[i]='X';
			}
			else{
				upword[i]=word[i];
			}
			
		}
		
		char decoded[] = new char[check];
		
		int counter = 0;
		System.out.println(check);

		for (int i = 0; i < check; i++) {
			
			result[i] = upword[temp[counter] - 1];
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
