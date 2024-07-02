import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class Tester {
    
    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
    List<Object> concatenatedList = new LinkedList<>();

    // Add elements from listOne
    for (Object obj : listOne) {
        concatenatedList.add(obj);
    }

    // Add elements from listTwo
    for (Object obj : listTwo) {
        concatenatedList.add(obj);
    }

    return concatenatedList;
}



	public static void main(String args[]) {
		List<Object> listOne = new LinkedList<Object>();
		listOne.add("Hello");
		listOne.add(102);
		listOne.add(25);
		listOne.add(38.5);
		
		List<Object> listTwo = new LinkedList<Object>();
		listTwo.add(150);
		listTwo.add(200);
		listTwo.add('A');
		listTwo.add("Welcome");
		
		List<Object> concatenatedList = concatenateLists(listOne, listTwo);
		
		System.out.println("Concatenated linked list:");
		for (Object value : concatenatedList) {
			System.out.print(value+" ");
		}
	}
}
