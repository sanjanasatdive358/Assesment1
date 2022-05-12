import java.util.Scanner;
class Armstrong{
public static void main (String args[]){
int i=100,a,n,tem,arm;
System.out.println("Armstrong number");
while(i<1000);
{
n=i;
arm=0;
while(n>0)
{ a=n%10;
arm=arm+(a*a*a);
n=n/10;
}
if (arm==i)
System.out.println(i);
i++;
}
}
}