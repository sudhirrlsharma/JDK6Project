import org.owasp.esapi.ESAPI;


public class TestSanitizationWithOwasp {
	public static void main(String[] args) {
		sanitization1();
		sanitization2();
		
	}
	
	
	public static void sanitization1(){
		String unescapeValue =ESAPI.encoder().encodeForHTMLAttribute ("javascript:alert('hi')"); 
		System.out.println(unescapeValue);
		
	}
	
	public static void sanitization2(){
		String unescapeValue =ESAPI.encoder().encodeForHTMLAttribute ("<javascrit>alert('hi')</javascript>"); 
		System.out.println(unescapeValue);
		
	}

}
