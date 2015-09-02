
package opencode.java8features.streams;


public class Tag {
	
	public enum TYPE{
		NEWS, SPORTS
		
	}
	
	private String name;
	
	private int count;
	
	private TYPE type;
	
	public Tag(String name, int count, TYPE type) {
		this.name = name;
		this.count = count;
		this.type = type;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the type
	 */
	public TYPE getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TYPE type) {
		this.type = type;
	}
	
	@Override
	public String toString(){
		return "{name:"+name+", count:"+count+"}";
	}
	
}
