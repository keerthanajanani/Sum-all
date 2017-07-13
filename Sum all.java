# Sum-all
import java.io.*;
import java.util.*;
public class Sum all
{
public static void main(String args[])throws IOException
{
int i,j,n,sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Number:");
n=Integer.parseInt(br.readLine());
for(i=0;i<=10;i++)
{
for(j=0;j<=i;j++)
{
sum=sum+j;
}
System.out.println("sum of all Number is : "+sum);
}
}
}
