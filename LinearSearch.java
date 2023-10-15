import java.util.Scanner;

class LinearSearch{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n number of element in array ");
int n=sc.nextInt();
int flag=0;
for(int i=0;i<n;i++)
{
System.out.println("Enter array element"+i+" ");
arr[i]=sc.nextInt();
}

System.out.println("Enter target as linear search ");
int target=sc.nextInt();

for(int i=0;i<n;i++)
{
if(target==arr[i])
{
flag=1;
System.out.println("Element found at "+i+" index");
break;
}
}

if(flag==0)
{
system.out.println("target not found in array -1");
}
}
