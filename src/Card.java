
public class Card {
	
	private int value;
	private String name;
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
		
	}
	public void describe() {
		System.out.println(toString());
		
	}
	public int getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	
    @Override
    public String toString() {
    	return Card.class.getSimpleName() + " [name= " + name + ", value= " + value + "]";
    	
    }
}
