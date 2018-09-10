package datastructure;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		/* declare HashMap */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/*Adding elements to HashMap*/
		hmap.put(12, "Hasan");
		hmap.put(2, "Aarti");
		hmap.put(7, "Jahid");
		hmap.put(49, "Mehzabin");
		hmap.put(3, "Satinder");

		/* Retrieve values */
		String var = hmap.get(2);
		System.out.println("Value at index 2 is: " + var);
		String var1 = hmap.get(3);
		System.out.println("Value at index 3 is: " + var1);

		// Add List<String> into a Map.
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		List<String> carList = new ArrayList<String>();
		carList.add("toyota");
		carList.add("bmw");
		carList.add("honda");
		list.put("car", carList);
		System.out.println(list);

		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Bananas");
		fruits.add("Grapes");
		list.put("fruit", fruits);
		System.out.println(list);

		// Each loop to retrieve data
		for (Object str : list.keySet()) {
			System.out.println("KeySet:" + str);
			for (String str1 : list.get(str)) {
				System.out.println("Value: " + str1);
			}
		}
		// while loop with Iterator to retrieve data
		Iterator itr = list.entrySet().iterator();
		System.out.println("While Loop:");
		Iterator iterator = list.keySet().iterator();
		while (iterator.hasNext()) {
			Object kvalues = iterator.next();
			for (String str1 : list.get(kvalues)) {
				System.out.println("Value: " + str1);
			}
		}
		//Connect to MySql Database
		ConnectDB connectDB = new ConnectDB();

		//Create table in the database
		connectDB.createTableFromStringToMySql("use_map", "mapKey", "mapValue");
		for (Object str : list.keySet()) {
			for (String str1 : list.get(str)) {
				List<String> list1 = new ArrayList<String>();
				list1.add(str.toString()); // adds key
				list1.add(str1); // adds value
				// Insert data in the database
				connectDB.InsertDataFromArrayListToMySql(list1, "use_map", "mapKey", "mapValue");
			}
		}
		System.out.println("Reading data from database: ");
		//Reading data from database
		List<String> numbers = connectDB.readDataBase("use_map", "mapKey", "mapValue");
		for (String st : numbers) {
			System.out.println(st);
		}
	}

}