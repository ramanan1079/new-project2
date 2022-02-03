import java.io.*;
import java.util.Scanner;

class Kavinmark{
	public static void main(String args[]){



        int mark1,mark2,mark3,mark4,mark5;
	String name,rollno;

	Scanner s =new Scanner(System.in);
	System.out.println("enter the name: ");
	name =s.nextLine();
	System.out.println("enter the rollno; ");
	rollno =s.nextLine();

	System.out.println("enter the mark 1 : ");
	mark1=s.nextInt(); 
	System.out.println("enter the mark 2 : ");
	mark2=s.nextInt();
	System.out.println("enter the mark 3 : ");
	mark3=s.nextInt();
  
          if(mark1>0 && mark1<100)
          {
            if(mark1>50)
            {System.out.println("Mark  "+ mark1+  "  pass ");}
             else
              {System.out.println("Mark "+ mark1+  " Fail");}
           }
          else
            {
               System.out.println("Invalid marks");
                System.exit(10);
             }
	 if(mark2>0 && mark2<100)
          {
            if(mark2>50)
            {System.out.println("Mark  "+ mark2+  "  pass ");}
             else
              {System.out.println("Mark "+ mark2+  " Fail");}
           }
          else
            {
               System.out.println("Invalid marks");
                System.exit(10);
             }
 if(mark3>0 && mark3<100)
          {
            if(mark3>50)
            {System.out.println("Mark  "+ mark3+  "  pass ");}
             else
              {System.out.println("Mark "+ mark3+  " Fail");}
           }
          else
            {
               System.out.println("Invalid marks");
                System.exit(10);
             }



      
	
	System.out.println(" total: " + (mark1+mark2+mark3));
}
}