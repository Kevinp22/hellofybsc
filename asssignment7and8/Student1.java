package asssignment7and8;

public class Student1 implements Comparable<Student1> {
	
	private int rollno;  
	private String name; 
	String s;
	
	public Student1(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		s=rollno +" "+ name;
	}

	@Override
	public int compareTo(Student1 st) {
		// TODO Auto-generated method stub
		return name.compareTo(st.name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
