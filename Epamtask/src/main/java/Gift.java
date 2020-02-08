import java.util.Scanner;

public class Gift extends Sweets{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the how many choclates u want to order");
		int n=s.nextInt();
		System.out.println("Enter the how many sweets u want to order");
		int n4=s.nextInt();
	
		System.out.println("Enter the range of candies");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int a[]=new int[n];
		int a1[]=new int[n4];
		System.out.println("Enter the how many choclates weights");
      int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		choclates c=new choclates();
		int s1=c.weight(a);
		int s2=c.count(a,n1,n2);
		System.out.println("Enter the how many sweets weights");
	      //int i;
			for(i=0;i<n4;i++)
			{
				a1[i]=s.nextInt();
			}
			Sweets c1=new Sweets();
			int s11=c1.weight(a);
			int s12=c1.count(a,n1,n2);
		System.out.println("the weight of the gift box is "+(s1+s11));
		System.out.println("The total caniesof the gift box is "+(s2+s12));
		
	}
	

}
