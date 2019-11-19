package stringprograms;

public class Stringbufer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("hello");
		
		s.append("face");
		System.out.println(s);
		s.insert(6, "for");
		System.out.println(s);
		s.delete(0, 5);
		System.out.println(s);
		s.replace(5, 8,"welcome");
		System.out.println(s);
		s.deleteCharAt(7);
		System.out.println(s);
	}

	}


