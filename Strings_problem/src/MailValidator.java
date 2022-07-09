import java.util.Scanner;

public class MailValidator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string of mail id's");
		
		String sentence = scan.nextLine();
		
		String[] mailId = getArray(sentence);
		
		//String[] mailId = getMailId(array);
		
		for(int i=0;i<mailId.length;i++) {
			System.out.println(mailId[i]);
		}
		scan.close();
	}

	private static String[] getMailId(String[] array) {
		String[] mailId = new String[0];
		for(int i=0;i<array.length;i++) {
			String mail = array[i];
			boolean flag=validate(mail);
			if(flag) {
				mailId = getDynamicArray(mailId);
				mail = manupulate(mail);
				mailId[mailId.length-1] = mail;
			}
		}
		return mailId;
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

	private static boolean validate(String mail) {
		int countOfAt = 0;
		int countOfDot=0;
		for(int i=0;i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				countOfAt++;
			}
			if(mail.charAt(i)=='.') {
				countOfDot++;
			}
		}
		if(countOfAt==1 && countOfDot>0) {
			return true;
		}else {
		return false;
		}
	}

	private static String[] getDynamicArray(String[] mailId) {
		String[] temp = new String[mailId.length+1];
		for(int i=0;i<mailId.length;i++) {
			temp[i]=mailId[i];
		}
		return temp;
	}

	private static String[] getArray(String sentence) {
		int count=1;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				count++;
			}
		}
		String[] array = new String[count];
		
		int index=0;
		String temp = "";
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				array[index]=temp;
				index++;
				temp="";
			}else {
				temp+=sentence.charAt(i);
			}
		}
		array[index] = temp;
		 array=getMailId(array);
		 return array;
	}

}
