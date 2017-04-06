package composite_1;

public class Demo {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("NC", "11784", "4/4", 100);
		Wine w2 = new Wine("Pinot", "2016", "South Fork", "Merlot", 12, 150);
		ItemList list = new ItemList();
		list.add(t1);
		list.add(w2);
		list.printAllItems();
	}

}
