package asssignment7and8;

import java.util.*;

public class StudentSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add(new Student1(5,"Krishna"));
		l.add(new Student1(2,"Govindaa"));
		l.add(new Student1(4,"Madhava"));
		l.add(new Student1(1,"Achyutha"));
		l.add(new Student1(3,"Vasudev"));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}

}
