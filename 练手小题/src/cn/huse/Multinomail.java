package cn.huse;

import java.util.Scanner;

public class Multinomail {
    public static void main(String[] args) {
        //a+aa+aaa+...+aaaaaaa=?
        System.out.println("请输入一个1-9的数字:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a<=0){
            System.out.println("请输入一个1-9的数字:");
            a = scanner.nextInt();
        }
        //System.out.println("OK");
        System.out.println("请输入多项式的项数:");
        int length = scanner.nextInt();
        int sum = 0;
        int temp = 1;
        System.out.print(a);
        while (length>0) {
            sum += a * temp;
            length -= 1;
            temp =  temp * 10 + 1;
            if (length>0) {
                System.out.print("+" + a * temp);
            }
        }
        //System.out.print('\b');

        System.out.println("=" + sum);
    }
}
