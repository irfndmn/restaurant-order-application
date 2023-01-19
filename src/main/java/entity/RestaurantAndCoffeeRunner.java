package entity;

import restaurantside.RestaurantBillGenerator;
import snakecafeside.CafeBillGenerator;

import java.util.Scanner;

public class RestaurantAndCoffeeRunner {

    public static void main(String[] args) {
        start();
    }



    public static void start(){
        RestaurantBillGenerator res=new RestaurantBillGenerator();
        CafeBillGenerator cafe=new CafeBillGenerator();
        Scanner scanner=new Scanner(System.in);
        int select=-1;
        while(select!=0) {

            String a = " =============          VanCity Restaurantimiza Hosgeldiniz         =============";
            slowPrint(a, 30);
            System.out.println();
            System.out.println("Lutfen Ana Restaurant ve Coffee Bolumlerimiz Icin Seciminizi Giriniz...");
            System.out.println(" 1-Restaurant Bolumu \n 2-Coffee Bolumu \n 0-CIKIS");
            System.out.println();
            System.out.print("Seciminiz  : ");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    res.forRestaurantSide();
                    break;
                case 2:
                    cafe.forCafeSide();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz");
            }

        }
        System.out.println("Iyi Gunler Tekrar Bekleriz");



    }
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }




}
