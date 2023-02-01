package collectionSet1;

import java.util.Set;

public class Class {
	
	private String college;
	private String clas;
	private Set<String> students;
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public Set<String> getStudents() {
		return students;
	}
	public void setStudents(Set<String> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Class [college=" + college + ", clas=" + clas + ", students=" + students + "]";
	}
	
	
	
	

}
