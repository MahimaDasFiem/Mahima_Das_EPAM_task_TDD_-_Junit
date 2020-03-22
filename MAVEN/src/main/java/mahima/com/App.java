package mahima.com;

import java.util.*;
import java.io.*;
import java.lang.*;
public class App
{   
	public static void main(String[] args)
    	{
       		App ob=new App();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String=");
		System.out.println("New String="+ob.Del(sc.next()));
	}
	
	public String Del(String Str)
	{
		if(Str.length()==0)
		{
			return(Str);
		}
		else if(Str.length()==1)
		{
			if(Str.charAt(0)=='A')
			{
				return("");
			}
			else
			{
				return(Str);
			}
		}
		else
		{
			if(Str.charAt(0)=='A' && Str.charAt(1)=='A')
			{
				return(Str.substring(2));
			}
			else if(Str.charAt(0)=='A')
			{
				return(Str.substring(1));
			}
			else if(Str.charAt(1)=='A')
			{
				return(Str.charAt(0)+Str.substring(2));
			}
			else
			{
				return(Str);
			}
		}
	}
}
			
		 