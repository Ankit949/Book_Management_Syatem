import java.util.*;                // importing util [package for taking inputs
import java.time.*;                // Importing time package for displaying time and date of output.
import java.time.format.DateTimeFormatter;
class student extends Person        // Using inheritence for inheriting abstact class person into student class
{
   void Issue()                      // method name issue for issuing book
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of book");
        int n=sc.nextInt();
        if (n<=3)                // condition on how many books can be issued at a time.
        {
            for(int i=0;i<n;i++)       // loop for entering detail of all the books issued.
            {
            System.out.println("Book name");
            String Bname=sc.nextLine();                       // Entering book name.
            System.out.println("Book Id"); 
            int Bnum=sc.nextInt();                           // Entering Book id
            LocalDateTime current = LocalDateTime.now();    // Displaying date and time at which book is issued.
            System.out.println("current date and time : "+ current); 
            System.out.println("Book detail"+Bname+" "+Bnum+" "+current);
            }
        }
        else
        {
            System.out.println("Max limit is 3");
        }
    }
    
    int getid()     // method to return a book id.
    {
        return Bnum;
    }
    
    
    void Return()                // method to perform the return operation
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of book to be returned");
        int n=sc.nextInt();
        if(n>=3){             // condition to check how many books student have to return
            for(int i=0;i<n;i++)    // Loops to enter the detail of books
            {
            System.out.println("Enter Book Id");
            int Bid =sc.nextInt();
            if ( Bnum==Bid){                    // Condition to check whether student has issued that book or not.
                System.out.println("Book Name:"+Bname);
                System.out.println("Book Id :"+Bnum);
                LocalDate date = LocalDate.now(); 
                System.out.println("the current date is "+ date);
            }
            else{
            System.out.println("Wrong Book id");      // message printed when Bnum is not equal to Bid.
            }
        }
            
            
        }
        else{
        System.out.println("Only three books can be return at a time"); // Messahge printed when no. of books to be return exceed 3.
    }
        
        
    }
    
   
}
    
    
    
    
    
    
