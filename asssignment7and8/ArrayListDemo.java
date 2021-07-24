package asssignment7and8;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student();
		s.addNames();
		s.printNames();
		s.setNames();
		s.printNames();
		s.searchName("Sahil");
		s.searchName(0);
		s.removeName("Sahil");
		s.printNames();
	}

}
