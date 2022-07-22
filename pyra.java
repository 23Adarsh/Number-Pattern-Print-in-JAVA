import java.util.Scanner;
public class pyra{
    public static void main(String[] args)
    {
        int rows;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter value of Rows -:");
        rows = s.nextInt();

        for(int i=rows;i>0;i--)
        {
            for(int j=rows;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

    

