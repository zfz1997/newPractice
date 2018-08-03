package myFinal;

public class FinalPractice {
     public static void main(String[] args) {
		 final FinalString finalString=new FinalString("abccc");
		 System.out.println(finalString.getString());
		 finalString.SetString("aaa");
		 System.out.println(finalString.getString());
		 String a=new String("aaa");
		 System.out.println(a);
		 
	}
    
}
class FinalString{
	private  String str="";
	public FinalString(String str) {
		this.str=str;
	}
	public void SetString(String str) {
		this.str=str;
	}
	public String getString() {
		return str;
	}
}