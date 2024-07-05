import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Tester {
    
    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
        // Create a HashSet to store elements from listOne
        HashSet<Integer> set = new HashSet<>();
        set.addAll(listOne); // Add all elements of listOne to set
        
        // Create a LinkedList to store common elements
        LinkedList<Integer> result = new LinkedList<>();
        
        // Iterate through listTwo and check for common elements
        for (Integer num : listTwo) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
    }
    
    public static void main(String args[]){
        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(12);
        listOne.add(21);
        listOne.add(1);
        listOne.add(53);
        
        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(11);
        listTwo.add(21);
        listTwo.add(25);
        listTwo.add(53);
        listTwo.add(47);
        
        System.out.println("Common elements: " + findCommonElements(listOne, listTwo));
    }
}
