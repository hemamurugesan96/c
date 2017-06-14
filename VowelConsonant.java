import java.io.*;
import java.util.*;
import java.util.Scanner;
class VowelConsonant
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch=='a' || ch=='A' || ch=='b' || ch=='B' || ch=='c' || ch=='C' || ch=='d' || ch=='D' || ch=='e' || ch=='E')
{
System.out.println("Vowel");
}
else
{
System.out.println("Consonant");
}
}
}
