import java.util.Scanner
public class Menu 
{
  public static void main(String[] args) 
  {
    int userOption;
    int a,b ,c ,d;

    Scanner input = new Scanner(System.in);

    a= -9 + (int) (Math.random() * (9-(-9)+1)) ;
    b= -9 + (int) (Math.random() * (9-(-9)+1));
    c= -9 + (int) (Math.random() * (9-(-9)+1));
    d= -9 + (int) (Math.random() * (9-(-9)+1));
    System.out.println("value: "+a);
     System.out.printf("%12d", c);
    System.out.printf("%5d", a);
    System.out.printf("%10d %n", c);
    System.out.printf("%6s", "___");
    System.out.printf("%10s %n", "___");
    System.out.printf("%5d", b);
    System.out.printf("%10d", d);

    do 
      {
        System.out.println("______________");
        System.out.println("Operations: " );
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("\nOption: ");

        userOption = input.nextInt();
       
        if(userOption < 1 || userOption > 4);
        System.out.println("Wrong option, Try again!");
        
          
      }
      while(userOption > 4 || userOption < 1);

    switch (userOption)
      {
        case 1: //addition  
          int resultadd = ((a*d)+(b*c))/b*d;
          System.out.println(result);
          
          break;
        
        case 2: //subtraction
          int resultsub = ((a*d)-(b*c))/b*d;
          System.out.println(resultsub);
          break;
        
        case 3: //multiplication
          int resultmulti = (a*c)/(b*d);
          System.out.println(resultmulti);
          break;
        
        case 4: //division
          int resultdivide = (a*d)/(b*c);
          System.out.println(resultdivide);
          break;
        
        default:
          System.out.println("Wrong option, Try again!");
              

        }
  }
}
              

        }
  }
}
