import java.util.Scanner;
public class num1 {
    public static void main(String[] args)
    {
        int rows;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter value of Rows -:");
        rows = s.nextInt();

        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }
    
}
