package IMP_Programes;

public class Occurence_of_specific_char {

	public static void main(String[] args) {
		String name="sumitshinde";
		int a=name.length();//11
		int b=name.replace("i", "").length();//9
		int c=a-b;//2
		System.out.println("i"+c);//2

	}

}
