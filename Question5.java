import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number: "); 
	  int n = sc.nextInt(),c;
	  int[] a = new int[n];
	  int[] b = new int[n];
	  System.out.println("Enter "+n+" integers");

    //promts user for integers
	  for(int i = 0; i < n; i++) 
	  {
      //adds integers to an array
		  a[i] = sc.nextInt();
	  }


	  for(int i = 0; i < n; i++) 
	  {
      //let c be the number count
      c = 1;

      for(int j = i + 1; j < n; j++)
      {
        //checks if number equals to another number
	      if(a[i] == a[j])
        {
          c++;
        }              
	    }
      
      //stores number count in another array
      b[i] = c;
    }

    //let m be a random number count
    int m = b[0];
    for(int i = 1; i < n; i++) 
	  {
      //checks if there are other numbers with a higher count
	    if(b[i] >= m)
      {
        m = b[i];
      }
	  }  

    System.out.println("Mode:"); 
	  for(int i = 0; i < n; i++) 
	  {
      //selects the number with the highest count
      if(b[i] == m)
      {
        System.out.println(a[i]);   
      }
    }
  }
}
