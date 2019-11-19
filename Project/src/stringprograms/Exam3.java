package stringprograms;

public class Exam3 {

	public static void main(String[] args) {
		static int[] max_min(int[] y, int n)
	    {
	        int temp[] = new int[n];
	        int small_num = 0, large_num = n-1;
	        boolean x = true;
	        for (int i=0; i < n; i++)
	        {
	            if (x)
	                temp[i] = y[large_num--];
	            else
	                temp[i] = y[small_num++];
	            x = !x;
	        }
	        return temp;
	    }
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int n1[] = new int[a];
	        for(int i = 0; i < a; i++)
	        {
	            n1[i] = sc.nextInt();
	        }
	        int res[];
	        res = max_min(n1,n1.length);
	        System.out.println(Arrays.toString(res));

	}

}
