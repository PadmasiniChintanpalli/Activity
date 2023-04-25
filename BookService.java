package bookapplication;
import java.util.Scanner;

public class BookService {
	
	static Book book[] = new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int index = 0;
	public static void createBook()
	{
		System.out.println("Enter book id: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter book name: ");
		String bname = sc.nextLine();
		
		System.out.println("Enter book price: ");
		double price = sc.nextDouble();
		
		book[index] = new Book(id, bname, price);
		index++;
		System.out.println("Book details created successfully!!");
		
	}
	public static void getAllBookDetails()
	{
		for(int i=0; i<index;i++)
		{
			System.out.println("BookId: "+book[i].getBookID());
			System.out.println("BookName: "+book[i].getBookName());
			System.out.println("BookPrice: "+book[i].getBookPrice());
			System.out.println("=================================");
		}
	}
	//get book details based on id.
	public static void getBookDetailsById()
	{
		System.out.println("Enter Id to be searched");
		boolean flag = false;
		int id = sc.nextInt();
		System.out.println();
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookID()==id)
			{
				System.out.println("Book details are:");
				System.out.println("BookId: "+book[i].getBookID());
				System.out.println("BookName: "+book[i].getBookName());
				System.out.println("BookPrice: "+book[i].getBookPrice());
				System.out.println("=================================");
				flag = true;
				break;
			}
			else
			{
				if(flag==false)
				{
					System.out.println("Book not found!!");
				}
			}
		}
	}
	public static void getBookDetailsByName()
	{
		System.out.println("Enter Name to be searched");
		boolean flag = false;
		sc.nextLine();
		String name = sc.nextLine();
		//System.out.println(name);
		//System.out.println("BookName: "+book[0].getBookName());
		//System.out.println();
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookName().equalsIgnoreCase(name))
			{
				System.out.println("Book details are:");
				System.out.println("BookName: "+book[i].getBookName());
				System.out.println("BookId: "+book[i].getBookID());
				System.out.println("BookPrice: "+book[i].getBookPrice());
				System.out.println("=================================");
				flag = true;
				break;
			}
			else if(flag==false){
				System.out.println("Book not found!!");
				
			}
		}
		
	}
	public static void updateBook()
	{
		boolean flag =false;
		System.out.println("Enter the book Id: ");
		int id = sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookID()==id) 
			{
				sc.nextLine();
				System.out.println("Enter the new book name: ");
				String bname = sc.nextLine();
				
				System.out.println("Enter the new price: ");
				double bprice = sc.nextDouble();
				
				book[i].setBookName(bname);
				book[i].setBookPrice(bprice);
				
				flag = true;
				
			}
			if(flag==true)
			{
				System.out.println("Boook details are successfully updated!");
			}
			else
				System.out.println("Book with id " + id+" not found");
			
		}
	}
}
