package recursion;

import java.util.Scanner;

public class dsa1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        table(n,i);
    }
    static void table(int n, int i){
        if(i==11){
            return;
        }
        System.out.println(n+"*"+i+" =" +n*i);
        table(n,i+1);
    }
}
