import java.io.BufferedReader;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException; 

public class Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader file = new FileReader("Untitled 1");
		BufferedReader reader = new BufferedReader(file);
		
		String data;
		
		while ((data = reader.readLine()) != null) {
			System.out.println(data);
		}
		reader.close();
		} 	
		
		catch (IOException error) {
			System.out.println(error);
		}
	}
}