package cn.huse;

public class NiceNIce {
    public static void main(String[] args) {
        int i = 1;
        int j;
        for (;i<=9;i++) {
            for (j=1;j<=i;j++) {
                System.out.print(" " + j + "*" + i + "=" + j*i);
            }
            System.out.println();
        }
    }
}
