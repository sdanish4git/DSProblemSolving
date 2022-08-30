package leetcode.easy;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11", b = "1";
		
		int i=a.length()-1;
		int j=b.length()-1;
		StringBuilder sb=new StringBuilder();
		int carry=0;
		while(i>=0 || j>=0) {
			int sum=carry;
			if(i>=0) sum+=a.charAt(i)-'0';
			if(j>=0) sum +=b.charAt(j)-'0';
			carry=sum>1?1:0;
			sb.append(sum%2);
			i--;
			j--;
		}
		if(carry!=0) sb.append(carry);
		System.out.println(sb.reverse().toString());
	}

}
