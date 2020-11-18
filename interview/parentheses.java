#Implement an algorithm to print all valid (e.g., properly opened and closed)
#combinations of n-pairs of parentheses. EXAMPLE: input: 3 (e.g., 3 pairs of parentheses) 
#output: ()()(), ()(()), (())(), ((()))

/* package codechef; // don't place package name! */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{    
     static void solve(int l, int r, int i, char[] str) {
        if (l == 0 && r == 0) {
            System.out.println(new String(str));
        } else {
            if (l > 0) {
                str[i] = '(';
                solve(l - 1, r, i + 1, str);
            }

            if (r > 0 && r > l) {
                str[i] = ')';
                solve(l, r - 1, i + 1, str);
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		solve(3, 3, 0, new char[6]);
	}
}
