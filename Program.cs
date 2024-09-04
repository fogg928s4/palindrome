using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace palindrome
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Write your phrase to check if palindrome: ");
            String phrase = Console.ReadLine();
            
            Console.WriteLine(resolution(phrase));
            Console.ReadKey();
        }

        static String resolution(String p)
        {
            //check if null
            if(p == null) return "Come on type something";

            //else
            //REVERSED INT goes
            String reversed = "", temp = "";
            //no more spacessss
            foreach (char c in p)
            {
                if (c != ' ')
                    temp = temp + c;
            }
            
            for (int i = temp.Length - 1; i >= 0; i--)
            {
                reversed = reversed + temp[i];
            }
            //returns the resolution

            if (reversed != temp)
                return "\nNot palindrome! \n";
            else
                return "\nIT IS A PALINDROME!!!";
            
        }
    }
}
