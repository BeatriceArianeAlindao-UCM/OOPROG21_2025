// Application lists valid shipping codes
// A, C, T, or H
// Then prompts the user for a code
// Application accepts a shipping code
// and determines if it is valid

import java.util.*;

public class DebugEight1
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);

      char userCode;
      String entry;
      boolean found = false; // FIX: Start as false. Only becomes true when match is found.

      char[] okayCodes = {'A', 'C', 'T', 'H'};
      System.out.println("Enter shipping code for this delivery.");
      System.out.print("Valid codes are: ");

      // FIX: Loop should run through all codes, not just 2
      for(int x = 0; x < okayCodes.length; ++x)
      {
         System.out.print(okayCodes[x]);

         if(x != (okayCodes.length - 1))
            System.out.print(", ");
      }

      System.out.print(" >> ");

      entry = input.nextLine();

      // FIX: charAt(1) was wrong—users enter ONE character, so use charAt(0)
      userCode = entry.charAt(0);

      // Check if userCode matches any valid code
      for(int i = 0; i < okayCodes.length; ++i)
      {
         // FIX: '=' replaced with '==' for comparison
         if(userCode == okayCodes[i])
         {
            found = true;   // We found a match
         }
      }

      // FIX: Logic reversed. If found = true → good code
      if(found)
         System.out.println("Good code");
      else
         System.out.println("Sorry, code not found");
   }
}
