package beans;

public class GoodStudent {
	private int id;
	private String name;
	private String email;
	private int marks;
	
	
	public GoodStudent() {
		super();
	}
	public GoodStudent(int id, String name, String email, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

