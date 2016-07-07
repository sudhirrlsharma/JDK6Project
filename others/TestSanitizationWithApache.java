import org.apache.commons.lang.StringEscapeUtils;


public class TestSanitizationWithApache {

	public static void main(String[] args) {
		sanitization1();
		sanitization2();
		
	}
	
	

	public static void sanitization1(){
		String unescapeValue = StringEscapeUtils.escapeJavaScript("javascript:alert('hi')");
		System.out.println(unescapeValue);
		
	}
	
	
	public static void sanitization3(){
		String unescapeValue = StringEscapeUtils.escapeJavaScript("javascript:alert(\"hi\")");
		System.out.println(unescapeValue);
		
	}
	
	
	public static void sanitization2(){
		String unescapeValue = StringEscapeUtils.escapeJavaScript("<javascrit>alert('hi')</javascript>");
				System.out.println(unescapeValue);
		
	}
}
