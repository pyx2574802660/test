package cn.huse;

public class ShuiXianHua {
    public static void main(String[] args) {
        int sxh = 100;
        for (;sxh<=999;sxh++){
            int g = sxh % 10;
            int s = sxh / 10 % 10;
            int b = sxh / 100;
            int result = g*g*g + s*s*s + b*b*b;
            if (result == sxh){
                System.out.println(sxh);
            }
        }


    }


}
