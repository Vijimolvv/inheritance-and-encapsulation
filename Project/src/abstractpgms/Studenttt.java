package abstractpgms;

public class Studenttt extends rankx {
	public void totalmark(String name,int id,int m1,int m2,int m3,int m4) {
	System.out.println("name  "+name);
	System.out.println("id   "+id);
	System.out.println("mark1   "+m1);
	System.out.println("mark1   "+m2);
	System.out.println("mark1   "+m3);
	
	System.out.println("mark1   "+m4);
	int sum=m1+m2+m3+m4;
	double avg=sum/4;
	System.out.println("sum  "+sum);
	System.out.println("average   "+avg);
	if(sum>300)
	{
		System.out.println("rank 1");
	}
		else if (sum>250&&sum<280)
		{
			System.out.println("rank 2");
		}
		else
		{
			System.out.println("Failed");
		}
	}
	



	}
