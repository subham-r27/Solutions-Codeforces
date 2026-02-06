import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int s = (d + 4) / 5; 
        System.out.println(s);
    }
}



/* Brute
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int s=0;int temp=0;
        while(temp<d){
            temp=temp+5;
            s++;
        }
        System.out.println(s);
    }
}
*/
