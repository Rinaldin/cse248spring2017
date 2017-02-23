package mixedBag;

public class Instructor {
	private String name;
	private Rank rank;

	public Instructor(String name, Rank rank) {
		super();
		this.name = name;
		this.rank = rank;
	}
	
	// overloaded constructor makingn deep copy
	public Instructor(Instructor i){
		this.name = i.name;
		this.rank = i.rank;
	}
	
	public Instructor shallowCopy(Instructor i) {
		return i;
	}
	
	public Instructor deepCopy(Instructor i) {
		return new Instructor(i);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", rank=" + rank + "]";
	}

	

}
