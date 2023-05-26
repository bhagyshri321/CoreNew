package in.imp.String;

public final class StringImmutable{
	
	private final int Id;
	private final String name;
	
	public StringImmutable(int i, String j) {
		Id= i;
		name= j;
	}
	
	public int getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	
	
	
	public static void main(String[] args) {
		StringImmutable s= new  StringImmutable(4,"Ram");
		System.out.println("Id= "+s.getId()+" "+"Name= "+s.getName());
	}
}
	
	
	

