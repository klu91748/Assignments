package Assignment3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

	public static void main(String[] args) {
		try {
			File file = new File("name.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			List<String> list = new ArrayList();
			while ((line=br.readLine()) != null) {
				list.add(line);
			}
			
			for (String str : list) {
				System.out.println(str);
			}
			System.out.println("Capitalizing words:");
			for (int i = 0; i < list.size(); i++) {
				list.add(list.get(0).toUpperCase());
				list.remove(0);
			}
			for (String str : list) {
				System.out.println(str);
			}
			FileWriter fw = new FileWriter(file, true);
			fw.append("\nTOM");
			fw.close();
			System.out.println("Appended to file. Added TOM");
		}catch(Exception e) {
	
		}
	}
}
