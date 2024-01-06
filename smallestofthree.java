
public class smallestofthree {
    public static void main(String[] args) {
        int num1 = 1 ;
        int num2 = 10;
        int num3 = 2;
        if (num1 < num2)
        {
            if (num1 < num3)
            {
                System.out.println("1 is smallest among three");;
            }
            else
            {
                System.out.println("2 is smallest among three");
            }
        }
        else 
        {
            if (num2 < num3)
            {
                System.out.println("10 is smallest among three");

            }
            else
            {
                System.out.println("2 is smallest among three");
            }
        }
    }
}
