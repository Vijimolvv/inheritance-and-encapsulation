package inheritance;

public class Season extends Season2{
	public void tariff(int p, int da, String r, double t,int mon,double peak1) {
		
		System.out.println(r);
		double sum=(p*da*t);
		double sum1=sum+((sum*peak1)/100);
		System.out.println("Total Tariff:"+sum1);

	}
}
