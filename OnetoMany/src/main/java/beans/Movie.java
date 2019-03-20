package beans;

public class Movie {

	private int mid;
	private String mname;
	private Actor actor;
	
	public Movie() {
		super();
	}

	public Movie(int mid, String mname, Actor actor) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.actor = actor;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	
}
