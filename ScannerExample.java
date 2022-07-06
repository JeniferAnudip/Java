import java.util.Scanner;
class ScannerExample
{
	public static void main(String[] a)
	{
		System.out.println("PRODUCT DETAILS:");
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter the Product ID:");
		int productId=s.nextInt();
		System.out.println("Enter the Product Name:");
		String productName=s.next();
		System.out.println("Enter the payment Status(Y/N)");
		char paidStatus=s.next().charAt(0);
		System.out.println("Product ID:"+productId);
		System.out.println("Product Name:"+productName);
		System.out.println("Paid Status:"+paidStatus);
				


	}


}
