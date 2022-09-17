public class ReCapDemo2 {
    public static void main(String[] args) {
        double[] mylist = {1.2,1.3,6.4};
        double total = 0;
        double max =mylist[0];
        for (double number: mylist){
            if(max<number){
                max=number;
            }
            total = total +number;
            System.out.println(number);
        }
        System.out.println("Toplam :" + total);
        System.out.println("En büyük :" + max);

    }
}
