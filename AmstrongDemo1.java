import java.util.*;public class AmstrongDemo1{
	public static void main(String ar[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		int sa = n;
		int sum = 0;
		while(n>0){
			int num = n%10;
			n = n/10;
			sum = sum+(num*num*num);
		}
		if(sa==sum){
			System.out.println("It is Amstrong Number");
		}else{
			System.out.println("It is not Amstrong Numbser");
		}
	}
}