import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int i = in.nextInt();

    //first loop is for number of rows
    for (int a = 1; a <= i; a++)
    {

      //second loop is for the length of each row
      for (int b = 1; b <= a; b++)
      {
        System.out.print("*");
      }
      
      System.out.println();
    }

    /* for inverted triangle
    for (int a = 1; a >= i; a--)
    {
      for (int b = 1; b <= a; b++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    */
  }
}
