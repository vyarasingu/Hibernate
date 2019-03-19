package beans;

public class HardwareEmployee extends Employee
{
	private int wh;
	
	
	public HardwareEmployee() {
		super();
	}
	
	
	public HardwareEmployee(int id, String name, String email, int salary, int wh) {
		super(id, name, email, salary);
		this.wh = wh;
	}


	public int getWh() {
		return wh;
	}

	public void setWh(int wh) {
		this.wh = wh;
	}
	
	
}
