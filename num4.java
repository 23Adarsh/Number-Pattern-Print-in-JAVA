import java.util.Scanner;
public class num4 {
    public static void main(String[] args)
    {
        int rows;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Value of Rows -:");
        rows = s.nextInt();

        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum = i+j;
                if(sum%2==0)
                {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
                
            }System.out.println();
           
        }
    }
    
}
