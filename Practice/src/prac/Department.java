package prac;

public class Department {
	private int dno;
	private String dname;
	private String dloc;
	
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return dloc;
	}
	public void setLoc(String loc) {
		this.dloc = loc;
	}
	@Override
	public String toString() {
		return "[dno=" + dno + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
	
}
