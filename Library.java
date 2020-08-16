import java.util.*;
class Library
{
    public static void main(String args[]) // main function
    {
        System.out.println("******************************Library Management System**************************************");
        System.out.println("Press 1 : Student");
        System.out.println("Press 2 : Faculty");
        System.out.println("Press 3 : exit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        int c=sc.nextInt();
        switch(c)  // using switch case choose the option
        {
            case 1:
            
            System.out.println("Press 1 : Issue Book");  // operation to perform by student
            System.out.println("Press 2 : Return Book");
            System.out.println("Enter your choice:");
            int c1=sc.nextInt();
            switch(c1)      // nested switch case to choose the operation to be perform
            {
              case 1:
          
              student obj= new student();  // creating obj of child class.
              obj.Detail();             // calling method defined in abstract class
              obj.Issue();
              break;
              
              case 2:
              student obj1=new student();
              obj1.Detail();
              obj1.Return();
              break;
             }
             
             break;
             
             case 2:
             
            System.out.println("Press 1 : Issue Book");  // operation to be performed by faculty
            System.out.println("Press 2 : Return Book");
            System.out.println("Press 3 : add book");
            System.out.println("Enter your choice:");
            int c2=sc.nextInt();
            
            switch(c2)
            {
                case 1:
                Faculty obj=new Faculty();
                obj.Detail();
                obj.Issue();
                break;
                
                case 2:
                Faculty obj1=new Faculty();
                obj1.Detail();
                obj1.Return();
                break;
                
                case 3:
                Faculty obj2=new Faculty();
                obj2.Detail();
                obj2.add();
                break;
            }
            
            case 3:
            System.exit(0);  // termintion of program
       
            
            
              
            
        }
    }
}