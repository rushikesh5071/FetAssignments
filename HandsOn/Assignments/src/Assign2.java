import java.util.ArrayList;
import java.util.Arrays;

public class Assign2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4,5,3,2,2,5,6,0,4,4));
		
		System.out.println(list);
		
		ArrayList<Integer> newList = removeDuplicates(list);
		
		//ArrayList<Integer> removeDuplicates = new ArrayList<Integer>(newList);
		
		System.out.println(newList);
		
		ArrayList<Integer> reverseOrder = reverse(newList);
		
		System.out.println(reverseOrder);
	}

	private static ArrayList<Integer> reverse(ArrayList<Integer> newList) {
     ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = newList.size()-1; i >= 0; i--) {
			result.add(newList.get(i));
		}
		
		return result;
	}
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
    {
  
        // Create a new ArrayList
        ArrayList<Integer> newList = new ArrayList<Integer>();
  
        // Traverse through the first list
        for (Integer element : list) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }

	
}
