import java.util.Scanner;

public class MailManupulator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter a mail address");
		String mail=scan.next();
	    String finalMail=manupulate(mail);
	    System.out.println(finalMail);
		
	}

	private static String manupulate(String mail) {
		String tempMail = "";
		for(int i=0;i<mail.length();i++) {
			String ch = mail.charAt(i)+"";
			if(ch.equals("@")) {
				ch = "at";
			}
			if(ch.equals(".")) {
				ch = "dot";
			}
			tempMail+=ch;
		}
		return tempMail;
	}

}
