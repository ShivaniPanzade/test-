package single_inheritance;

public class Child_class extends Parent_class{
	float d=5.5f;

	public static void main(String[] args) {
		Child_class student=new Child_class();
		System.out.println(student.c);
		student.school();
		System.out.println(student.d);
		

	}

}
