package cn.huse;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("请输入一个正数:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        //System.out.println(year);
        if ((year%4 == 0 && year/100 !=0) || year%400 ==0 ) {
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "不是闰年");
        }
    }
}
