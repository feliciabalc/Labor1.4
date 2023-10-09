// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shop usb = new Shop(new int[]{10,22,47});
        Shop tastatur = new Shop(new int[]{18,32,40});

        int a=tastatur.getCheapTast();//4.1
        System.out.println(a);

        int b=tastatur.getExpensiveDisp(usb);//4.2
        System.out.println(b);

        int c=usb.getExpensiveUsb();//4.3
        System.out.println(c);
    }

}