import java.util.Scanner;


class Palindrome
    {
        public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in); 
            
            System.out.print("Write your phrase to check if palindrome: ");
            String phrase = scanner.nextLine();

            System.out.println(resolution(phrase));
  
        }

        static String resolution(String p)
        {
            //check if null
            if(p == null) return "Come on, type something";

            //else
            //REVERSED INT goes
            String reversed = new String("");
            String temp = new String("");
            
            //no more spacessss
            System.out.println(p.length());

            for (int j = 0; j < p.length(); j++)
            {
                if (p.charAt(j) != ' ')
                    temp = temp + p.charAt(j);
            }
            //System.out.println(temp+" a");
            for (int i = temp.length() - 1; i >= 0; i--)
            {
                reversed = reversed + temp.charAt(i);
            }
            //returns the resolution
            //System.out.println(reversed );


            if (!(reversed.equals(temp)))
                return "\nNot palindrome! \n";
            else
                return "\nIt is a palindrome!!! :3";
            
        }
}
