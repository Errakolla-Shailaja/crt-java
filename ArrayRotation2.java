import java.util.*;
class ArrayRotation2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,r;
        int n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        for(r=0;r<k;r++){
           int t=a[0];
        for(i=0;i<n-1;i++){
            a[i]=a[i+1];
        }
        a[i]=t;
        }
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
        }
}
 //array no change       