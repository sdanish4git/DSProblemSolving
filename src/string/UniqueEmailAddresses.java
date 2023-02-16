package string;

import java.util.HashSet;

public class UniqueEmailAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emails[] = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(new UniqueEmailAddresses().numUniqueEmails(emails));
	}
	
	public int numUniqueEmails(String[] emails) {
        HashSet<String> hs=new HashSet<>();
        
        for(int i=0;i<emails.length;i++) {
        	String email=emails[i];
        	int index=email.indexOf("@");
        	String front=email.substring(0,index);
        	int plusIndex=front.indexOf("+");
        	if(plusIndex>0) {
        		front=email.substring(0,plusIndex);
        	}
        	front=front.replaceAll("\\.","");
        	hs.add(front+email.substring(index));
        }
        return hs.size();
        
    }

}
