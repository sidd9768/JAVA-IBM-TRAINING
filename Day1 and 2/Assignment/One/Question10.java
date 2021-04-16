
public class Question10 {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		int a = 2;
		boolean flag = true;
		while (num > a) {
			if (num % a == 0) {
				flag = false;
				break;
			}
		a++;
		}
		if(flag) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}

	}

}
