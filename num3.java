import java.util.Scanner;
public class num3 {
    public static void main(String[] args)
    {
        int rows,num=1;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Value of Rows -:");
        rows = s.nextInt();

        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    
}
