package bookapplication;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		BookService bService = new BookService();
		Scanner sc = new Scanner(System.in);
		do 
		{
		System.out.println("Welcome to Book Management System.");
		System.out.println("Press:\n1) to Create a book.\n"+"2) To get all book details.\n"
		+"3) To get book details by Id\n"+"4) To get book details by name.\n"+
				"5) To update book details.\n"+"6) To exit.");
		System.out.println("===================================");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			bService.createBook();
			//BookService.createBook();		
			System.out.println();
			break;
			
		case 2:
			bService.getAllBookDetails();
			System.out.println();
			break;
			
		case 3:
			bService.getBookDetailsById();
			System.out.println();
			break;
			
		case 4:
			bService.getBookDetailsByName();
			System.out.println();
			break;
		case 5:
			bService.updateBook();
			System.out.println();
			break;
		
		case 6:
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid input!!");
		}
		}while(true);
		
	}

}
