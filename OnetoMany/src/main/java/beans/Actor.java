package beans;

import java.util.Set;

public class Actor {

	private int aid;
	private String aname;

	
	
	public Actor() {
		super();
	}





	public Actor(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}


	
	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getAname() {
		return aname;
	}


	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
}
