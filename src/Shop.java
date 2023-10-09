public class Shop {
    public int[] price;

    public Shop(int[] price) {
        this.price = price;
    }

    public int getCheapTast(){    //4.1
        int cheap=this.price[0];
        for(int i=0; i<this.price.length;i++){
            if(cheap>this.price[i]){
                cheap=this.price[i];
            }
        }
    return cheap;
    }
    public int getExpensiveDisp(Shop disp) {   //4.2
        int expensive1=this.price[0];
        int expensive2=disp.price[0];
        for(int i=0; i<this.price.length;i++){
            if(expensive1<this.price[i]){
                expensive1=this.price[i];}
        }
        for(int j=0; j<disp.price.length;j++) {
            if (expensive2 < disp.price[j]) {
                expensive2 = disp.price[j];}
        }
        if(expensive1>expensive2){
            return expensive1;
        }else{
            return expensive2;
        }
    }
    public int getExpensiveUsb(){    //4.3
        int expensive=this.price[0];
        for(int i=0; i<this.price.length;i++){
            if(expensive<this.price[i]){
                expensive=this.price[i];
            }
        }
        return expensive;
    }

}
