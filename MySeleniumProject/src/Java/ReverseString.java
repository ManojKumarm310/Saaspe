package Java;

public class ReverseString extends PositiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "code";
		String rev = "";
		
		for(int i= s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		//Reverse num--------------------------------------------------------
		
		int num = 123;
		int r = 0;
		
		while(num!=0) {
			 r = r*10+ num%10;
			num = num/10;
		}
		
		System.out.println(r);
		
		//Factorial of number------------------------------------------------------
		
		int n=5;
		int sum=1;
		
		for(int i=1;i<=n;i++) {
			sum = sum * i;
		}
		System.out.println(sum);
		
		// Even and odd number in array -------------
		
		int[] a = {1,2,3,4,5};
		
		for(int e: a) {
			if(e%2==0) {
				System.out.println("Even number" + e);
			}
		}
		
		for(int o : a) {
			if(o%2!=0) {
				System.out.println("Odd number" + o);
			}
		}
		
		//Even and odd number is a number-------------
		
		int b= 1234567;
		int even =0;
		int odd = 0;
		
		while(b>0) {
			int p =b%10;
			if(p%2==0) {
				even++;
			}else {
				odd++;
			}
			b=b/10;
		}
		System.out.println(even);
		System.out.println(odd);
		
		// Sum of the positive numbers in the list
		
		int pn[] = {1,7,2,-1,-2};
		int psum = 0;
		
		for(int pnum : pn) {
			if(pnum>0) {
				psum = psum + pnum;
			}
			
		//	System.out.println("Sum of positive number" + psum);
			
		}
		
		System.out.println("Sum of positive number" + psum); 
		
		
		
	}

}
