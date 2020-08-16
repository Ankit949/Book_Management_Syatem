import java.util.*;                           //importing java.util.Scanner for taking inputs
abstract class Person                    // Abstract class Person . It will be used as a superclass for all subclasses.
{
    static String Bname;                // Static variable so that we can use access it whenever we want in our code.
    static int Bnum;
    void Detail(){                      // method named Detail for taking name and registration number of student.
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    String name=sc.nextLine();              // Taking input from user.
    System.out.println("Enter your Registration Number:");
    int Reg=sc.nextInt();                  // Taking input from user.
}
    
    
    
}