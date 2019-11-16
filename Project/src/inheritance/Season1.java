package inheritance;

public class Season1 extends Season2{
	public void tariff(int p, int da, String r, double t,int mon,int dis) {
		
		System.out.println(r);
		double sum=(p*da*t);
		double sum1=sum-((sum*dis)/100);
		System.out.println("Total Tariff:"+sum1);
	

}}
