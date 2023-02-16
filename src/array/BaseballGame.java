package array;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operations[]= {"5","2","C","D","+"};
		System.out.println(calPoints(operations));
	}
	public static int calPoints(String[] operations) {

        Stack<Integer> score=new Stack<>();
        
        for(int i=0;i<operations.length;i++){
            if(operations[i]=="+"){
                int n1=score.pop();
                int n2=score.peek();
                score.push(n1);
                score.push(n1+n2);
            }else if(operations[i]=="D"){
                int n1=score.peek();
                score.push(n1*2);
            }else if(operations[i] == "C"){
                score.pop();
            }else{
                score.push(Integer.parseInt(operations[i]));
            }
            
        }
        int res=0;
            if(!score.isEmpty()){
                while(!score.isEmpty()){
                    res +=score.pop();
                }
            }
            return res;
        
    }
}
