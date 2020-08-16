import java.util.*;                          // importing util [package for taking inputs
import java.time.*;                          // Importing time package for displaying time and date of output.
import java.time.format.DateTimeFormatter;
class Faculty extends Person              // Using inheritence for inheriting abstact class person into Faculty class
{
    void Issue()                       // Polymerphism is used here.
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of book");
        int n=sc.nextInt();
        if (n<=5)                        // condition to check no. of books that can be issued
        {
            for(int i=0;i<n;i++)          //loop to enter the detail 
            {
        System.out.println("Book name");
        String Bname=sc.nextLine();        // entering book name
        System.out.println("Book Id");
        int Bnum=sc.nextInt();             // entering book id
         LocalDateTime current = LocalDateTime.now(); // time and date at which book is issued
         System.out.println("current date and time : "+ 
                        current); 
        
            }
        }
        else
        {
            System.out.println("Max limit is 3");
        }
    }
    
    int getid()
    {
        return Bnum;           // Returing book id for checking whether a faculty has issued a book or not
    }
    
    
    void Return()            // Here also we are using Polymerphism.
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of book to be returned"); // Entering no. of book to be returned
        int n=sc.nextInt();
        if(n>=5){                              // condition to check how many books can be returned.
            for(int i=0;i<n;i++)               // loops to enter book detail
            {
            System.out.println("Enter Book Id");
            int Bid =sc.nextInt();
            if ( Bnum==Bid){               // condition to check whether faculty has issued a book or not
                System.out.println("Book Name:"+Bname);
                System.out.println("Book Id :"+Bnum);
                LocalDate date = LocalDate.now();  // Date and time of returning book.
                System.out.println("the current date is "+ date);
                System.out.println("Book detail"+Bname+" "+Bnum+" "+date);
            }
            else{
            System.out.println("Wrong Book id");
            }
        }
            
            
        }
        else{
        System.out.println("Only five books can be return at a time");   // msg printed when no. of books to be returned exceeds.
    }
    
    }
    
    void add()     // method to operate add operation i.e adding of book in library
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of book to be added: "); // entering no. of book to be added 
        int n=sc.nextInt();
        for(int i=0;i<n;i++)   // loop to enter the deatail of books
        {
            System.out.println("Enter book name");
            String Bname=sc.nextLine();
            System.out.println("Enter Authors name");
            String Aname=sc.nextLine();
            System.out.println("Enter the book categories");
            String category=sc.nextLine();
            System.out.println("Book detail"+Bname+" "+Aname+" "+category);
        }
        
        
    }
    
    

}