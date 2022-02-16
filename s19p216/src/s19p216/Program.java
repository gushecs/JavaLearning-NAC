package s19p216;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			Map<String,Integer> candidates = new LinkedHashMap<>();
			
			while (line!=null) {
				
				String[] candidate = line.split(",");
				int votes = Integer.parseInt(candidate[1]);
				if (candidates.containsKey(candidate[0])) {
					candidates.put(candidate[0], candidates.get(candidate[0])+votes);
				} else {
					candidates.put(candidate[0], votes);
				}
				line = br.readLine();
				
			}
			
			for (String key : candidates.keySet()) {
				System.out.println(key+": "+candidates.get(key));
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			sc.close();
		}

	}

}
