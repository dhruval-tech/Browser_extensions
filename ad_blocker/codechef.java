/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. 
3
5
LLLUR
7
LLLRUUD
8
LRULLUDU*/
class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ip=new Scanner(System.in);
		int t=ip.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=ip.nextInt();
		    String s=ip.next();
		    int x=0,y=0;
		    for(int j=0;j<n;j++){
		        if(s.charAt(j)!= 'L' &&  s.charAt(j)!= 'R' && s.charAt(j)!= 'U' && s.charAt(j)!= 'D')
		            return;
		        if(s.charAt(j)=='L')
		        {
		            if(j>1 )
		                if(s.charAt(j-1)!='L')
		                     x--;
		            else
		                x--;
		        }      
		           if(s.charAt(j)=='R')
		        {
		            if(j>1 )
		                if(s.charAt(j-1)!='R')
		                     x--;
		            else
		                x--;
		        }    if(s.charAt(j)=='U')
		        {
		            if(j>1 )
		                if(s.charAt(j-1)!='U')
		                     y++;
		            else
		                y++;
		        }    if(s.charAt(j)=='D')
		        {
		            if(j>1 )
		                if(s.charAt(j-1)!='D')
		                     y--;
		            else
		                y--;
		        }
		            
		    }
		    System.out.println(x+" "+y)
		}
	}
}
