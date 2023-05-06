
public class Student {
	int rno;
	String name;
	static String clgName;

	public static void main(String[] args) {
		Student s=new Student();
		s.name="Venu";
		s.rno=1234;
		s.clgName="Codegnan";

		System.out.println(s.rno);
		System.out.println(s.name);
		System.out.println(s.clgName);


	}

}
