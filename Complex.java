import java.util.Scanner;
public class Complex{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter real and imaginary part of the first complex number(separated by space):");
double real1=s.nextDouble();
double imaginary1=s.nextDouble();
System.out.print("Enter real and imaginary part of the second complex number(separated by space):");
double real2=s.nextDouble();
double imaginary2=s.nextDouble();
System.out.println("Sum of the complex numbers:"+(real1+real2)+"+"+(imaginary1+imaginary2)+"i");
s.close();
}
}
