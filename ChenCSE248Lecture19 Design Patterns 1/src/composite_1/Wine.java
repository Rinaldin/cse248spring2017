package composite_1;

public class Wine implements IItem{
	private String producer;
	private String vintage;
	private String region;
	private String variety;
	private int abv;
	private double price;

	public Wine(String producer, String vintage, String region, String variety, int abv, double price) {
		super();
		this.producer = producer;
		this.vintage = vintage;
		this.region = region;
		this.variety = variety;
		this.abv = abv;
		this.price = price;
	}

	@Override
	public void print() {
		System.out.println("Wine format");
	}

}
