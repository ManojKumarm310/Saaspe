package ECommerce;

public class StringTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "AutomationTesting";
		String n = "";
		
		for(int i=10;i<s.length();i++) {
			
			n = n+s.charAt(i);
		}
		
		System.out.println(n);

	}

}
