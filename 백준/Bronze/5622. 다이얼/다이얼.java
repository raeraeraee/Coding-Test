import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int count = 0;
		
		while(true) {
			int read = System.in.read();
            
			if(read < 'A')
				break;
			else if(read < 'D')
				count += 3;
			else if(read < 'G')
				count += 4;
			else if(read < 'J')
				count += 5;
			else if(read < 'M')
				count += 6;
			else if(read < 'P')
				count += 7;
			else if(read < 'T')
				count += 8;
			else if(read < 'W')
				count += 9;
			else if(read < '[')
				count += 10;
		}
		System.out.print(count);
	}
}