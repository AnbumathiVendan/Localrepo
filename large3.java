public class large3 {
	
		public static void main(String[] args)
		{
			int n1=10;
			int n2=30;
			int n3=20;
			int a = (n1>n2)&&(n1>n2)?n1:(n2>n1)&&(n2>n3)?n2:n3;
			System.out.println(a+" largest number");
		}

	}
