
public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char keyword[] = {'T','R','A','N','S','P','O','S','I','T','I','O','N'};
		char keyword[] = {'C','O','N','V','E','N','I','E','N','C','E'};
		String word = new String("HEREISASECRETMESSAGEENCIPHEREDBYTRANSPOSITION");
		char tableword[]=new char[word.length()];
		int length=keyword.length;
		int lengthmsg=word.length();//dlugosc slowa = ilosc kolumn
		int verse = lengthmsg/length;
		int counter=0;
		char rawsample[][]=new char [verse+1][length];
		char result[][]=new char [length][verse+1];
//		int adder=0;
		int key[] = new int [length];
		
		for (int i = 0; i < word.length(); i++) {

			char temp = 0;
			temp = word.charAt(i);
			tableword[i] = temp;
			System.out.println(tableword[i]);

		}
		
		for(int i=0; i<25; i++){
			for(int j=0;j<length;j++){
				if(keyword[j]=='A'+i){
					key[j]=counter;
					counter++;
				}
			}
		}
		
		counter=0;
		for(int i=0;i<verse+1;i++) {
			
			for(int j=0;j<length;j++){
				if(counter<lengthmsg){
					rawsample[i][j]=tableword[counter];
					counter++;
					}
				System.out.print(rawsample[i][j]);
			}
			System.out.println();
			
		}
		System.out.println(verse);
//		for(int i=0; i<length; i++){System.out.println(key[i]);}
		
		for(int i=0;i < length;i++){
			int temp=key[i];
			for(int j=0;j<verse+1;j++){
				result[temp][j]=rawsample[j][i];
				System.out.print(result[temp][j]);
			}
			System.out.println();
			
		}
	}

}
