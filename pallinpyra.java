import java.util.Scanner;
public class pallinpyra {
  public static void main(String[] args)
  {
    int rows;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter value of Rows -:");
    rows = s.nextInt();

    for(int i=1;i<rows;i++)
    {
        for(int j=1;j<rows-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=i;j>0;j--)
        {
            System.out.print(j);
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
  }

    
}
