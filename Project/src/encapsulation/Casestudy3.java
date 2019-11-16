package encapsulation;

public class Casestudy3 {
	
	
	
	int price;
	int p;int i=1,j=0;
	String name;
	String g;
	int age;
	double total=0,sum=0;
	public int getPrice() {
	return price;
	}
	public void setPrice(int price) {
	this.price = price;
	}
	public int getP() {
	return p;
	}
	public void setP(int p) {
	this.p = p;
	}
	public int getI() {
	return i;
	}
	public void setI(int i) {
	this.i = i;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getG() {
	return g;
	}
	public void setG(String g) {
	this.g = g;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public void ticket(int p, int price) {
	
	System.out.printf("TICKET DETAILS ARE....\n");
	System.out.printf("NO: OF PASSENGERS:%d\n",p);
	System.out.printf("PRICE OF TICKET:%d\n",price);
	}
	double ticket1(int age, String g,int p,int price) {

	j++;total=0;
	double m=.25,o=.10,q=.50;
	if(age<16)
	{
	total=(double)sum+(price-(price*q));
	sum=total;
	return total;
	}
	else if(g.contentEquals("F")==true&&age>=16)
	{
	total=sum+(price-price*o);
	sum=total;
	return total;
	}
	else if(age>64)
	{
	total=sum+(price-price*m);
	sum=total;
	return total;
	}
	else
	{
	total=sum+price;
	sum=total;
	return total;
	}





	}}
	
	


