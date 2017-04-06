package composite_1;

import java.util.ArrayList;

public class ItemList {
	private ArrayList<IItem> list;
	
	public ItemList() {
		list = new ArrayList<>();
	}
	
	public void add(IItem item) {
		list.add(item);
	}
	
	public void printAllItems() {
		for(int i = 0; i < list.size(); i++) {
			list.get(i).print();
		}
	}
}
