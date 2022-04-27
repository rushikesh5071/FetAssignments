import java.util.*;

public class Assign1 {
	
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		   
		System.out.println("Enter the number of values to be stored  in Map");
	
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int valueAdd = i+1;
			
			System.out.println("Enter value for entry number"+valueAdd+":");
			
			int value = sc.nextInt();
			
			if(map.containsValue(value)) {
				
				System.out.println("Value already present cannot be added to Map, enter unique value");
				
				i--;
			}
			else 
				map.put(i, value);
		}
		
		System.out.println("Map elements:");
		
		System.out.println(map.values());
		
		System.out.println("Map elements in descending order:");
		
		System.out.println(map.descendingMap().values());
   }
 }


