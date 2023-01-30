package forloop;

public class Perfect {
	

	public static void main(String[] args) {
		int sum=0;
		long n=28;
		int i=1;
		while(i<=n/2) {
		if(n%i==0) {
		
		sum+=i;
		}
			
		
			i++;
		}
		
		if(sum==n) {
		
System.out.println("it is perfect");
	}

}
}