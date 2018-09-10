package datastructure;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> arrList = new ArrayList<>();
		//add element to Arraylist
		arrList.add(150);
		arrList.add(200);
		arrList.add(300);
		arrList.add(25);
		arrList.add(90);

		//Print Array List
		System.out.println("Retrieving elements from ArrayList: " + arrList);

		//Using get method to peek the first element
		System.out.println("Peek first element: " + arrList.get(0));

		//remove element from ArrayList
		System.out.println("Remove element at index 1: " + arrList.remove(1));

		//Retrieving elements from ArrayList
		System.out.println("Re-retrieving elements from ArrayList: " + arrList);

		//Using 'forEach' loop
		System.out.println("Use of for-each loop: ");
		for (Integer in : arrList) {
			System.out.println(in);
		}

		//using iterator
		System.out.println("Use of iterator using while loop: ");
		Iterator it = arrList.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.println(i);
		}

		//Sorting ArrayList
		Collections.sort(arrList);
		System.out.println(arrList);
		List list = new ArrayList();
		list = arrList;

		//Connect to MySql Database
		ConnectDB connectDB = new ConnectDB();

		//Create table in the database
		connectDB.createTableFromStringToMySql("array_list","listElement");

		//Insert data in the database
		connectDB.InsertDataFromArrayListToMySql(list,"array_list", "listElement");

		//Read data from database
		List<String> numbers = connectDB.readDataBase("array_list", "listElement");
		for(String st:numbers) {
			System.out.println(st);
		}

	}

}
