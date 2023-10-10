// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Usb usb=new Usb(new int[]{10,22,47});
        Tastatur tastatur= new Tastatur(new int[]{18,32,40});
        Shop altex = new Shop(usb,tastatur);

        int a=tastatur.getCheapTast();//4.1
        System.out.println(a);

        int b=altex.getExpensiveDisp(usb,tastatur);//4.2
        System.out.println(b);

        int c=usb.getExpensiveUsb();//4.3
        System.out.println(c);

        altex.maximumPurchase(usb,tastatur,60);
    }
}
class Shop {
    Usb usb;
    Tastatur tastatur;

    public Shop(Usb usb, Tastatur tastatur) {
        this.usb=usb;
        this.tastatur=tastatur;
    }

    public int getExpensiveDisp(Usb usb, Tastatur tastatur) {   //4.2
        int expensive1 = usb.price[0];
        int expensive2 = tastatur.price[0];
        for (int i = 0; i < usb.price.length; i++) {
            if (expensive1 < usb.price[i]) {
                expensive1 = usb.price[i];
            }
        }
        for (int j = 0; j < tastatur.price.length; j++) {
            if (expensive2 < tastatur.price[j]) {
                expensive2 = tastatur.price[j];
            }
        }
        if (expensive1 > expensive2) {
            return expensive1;
        } else {
            return expensive2;
        }
    }

    public void maximumPurchase(Usb usb,Tastatur tastatur,int budget) {
        int maxTotalCost = -1;
        for (int i=0;i<usb.price.length;i++) {
            for (int j=0;j<tastatur.price.length;j++) {
                int totalCost = usb.price[i] + tastatur.price[j];
                if (totalCost <= budget && totalCost > maxTotalCost) {
                    maxTotalCost = totalCost;
                }
            }
        }
        if (maxTotalCost != -1) {
            System.out.println(maxTotalCost);
        } else {
            System.out.println("Markus cannot afford both items within his budget.");
        }
    }
}

class Usb {
    int[] price;

    public Usb(int[] price) {
        this.price=price;
    }

    public int getExpensiveUsb() {    //4.3
        int expensive = this.price[0];
        for (int i = 0; i < this.price.length; i++) {
            if (expensive < this.price[i]) {
                expensive = this.price[i];
            }
        }
        return expensive;
    }
}

class Tastatur{
    int[] price;
    public Tastatur(int[] price) {
        this.price=price;
    }
    public int getCheapTast() {    //4.1
        int cheap = this.price[0];
        for (int i = 0; i < this.price.length; i++) {
            if (cheap > this.price[i]) {
                cheap = this.price[i];
            }
        }
        return cheap;
    }
}