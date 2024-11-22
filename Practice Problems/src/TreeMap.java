import java.util.*;
public class TreeMap {
//	3. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
//
//	Sample Output : 
//
//	Orginal TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}                                                                      
//
//	Checking the entry for 10:                                             
//
//	Key(s): {10=Red}                                                                                                
//
//	Checking the entry for 70:                                             
//
//	Key(s): {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
	public static void main(String[] args) {
		// Using HashMap because TreeMap is not working properly
		HashMap<Integer, String> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How much key value pair you want to enter: ");
		int no_of_pairs = sc.nextInt();
		for(int i=1; i<=no_of_pairs; i++) {
			System.out.println("Please enter the key and value separated by space: ");
			int key = sc.nextInt();
			String value = sc.nextLine();
			hm.put(key, value);
		}
		
		System.out.println("Enter a entry value : ");
		int entry = sc.nextInt();
		
		Iterator hmIterator = hm.entrySet().iterator();
		System.out.print("Key(s): {");
		while (hmIterator.hasNext()) {
			 
            Map.Entry mapElement= (Map.Entry)hmIterator.next();
            if(entry >= (int)mapElement.getKey()) {
            	
            	System.out.print((int)mapElement.getKey()+"="+mapElement.getValue()+",");
            	
            }
        }
		System.out.print("}");
	}
}
