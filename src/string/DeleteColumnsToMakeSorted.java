package string;

public class DeleteColumnsToMakeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[]= {"zyx","wvu","tsr"};
		System.out.println(new DeleteColumnsToMakeSorted().deleteCols(strs));
		
	}
	
	public int deleteCols(String strs[]) {
		int res=0;
		for(int c=0;c<strs[0].length();c++) {
			for(int r=0;r<strs.length-1;r++) {
				System.out.println(strs[r].charAt(c)+": "+strs[r+1].charAt(c)+"="+(strs[r].charAt(c) > strs[r+1].charAt(c)));
				if(strs[r].charAt(c) > strs[r+1].charAt(c)) {
					res +=1;
					break;
				}
			}
		}
		return res;
	}

}
