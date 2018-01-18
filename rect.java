import java.util.*;
import java.io.*;
import java.*;
class rect
{
	public static void main(String args[])
	{
		int a[]=new int[2];
		int b[]=new int[2];
		int c[]=new int[2];
		int d[]=new int[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++)
		{
			c[i]=sc.nextInt();
		}
		d[0]=(b[0]-a[0])+c[0];
		d[1]=(c[1]-a[1])+b[1];
		System.out.print(d[0]);
		System.out.print(d[1]);
	}
}
		