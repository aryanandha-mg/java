import java.util.Arrays;
import java.util.Scanner;
public class stringsorts
{
public static void main(String[] args)
{
Scanner scanner= new Scanner (System.in);
System.out.println ("enter the no.of strings: ");
int n=scanner.nextInt();
scanner.nextLine();
String[]string=new String[n];
System.out.println("enter the strings:");
for(int i=0;i<n;i++)
{
string[i]=scanner.nextLine();
}
Arrays.sort(string);
System.out.println("in sorting strings:");
for(String str: string){  
System.out.println(str);
}
scanner.close();
}
}
