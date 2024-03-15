import java.util.Scanner;
class Array
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int size;
System.out.println("Enter the size:");
size=input.nextInt();
int []arr1=new int[size];
System.out.println("Enter the"+size+"values");
for(int i=0;i<size;i++)
{
arr1[i]=input.nextInt();
}
System.out.println("The array:");
for(int i=0;i<size;i++)
{
System.out.println(arr1[i]);
}
}
}
