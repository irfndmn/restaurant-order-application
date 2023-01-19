package snakecafeside;

import mainrestaurant.Order;
import mainrestaurant.OrderService;

import java.util.Scanner;

public class CafeBillGenerator {



    public  void forCafeSide(){
        CafeeService c=new CafeeService();
        c.fillDishList();
        OrderService ord = new OrderService();
        getSelectionMenu(c,ord);

    }


    public void getSelectionMenu(CafeeService a,OrderService ord) {
        int select=-2;
        while(select!=0){
            Scanner sc =new Scanner(System.in);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("=========    Caffee  Siparis Uygulamasi ===========");
            System.out.println("1-Menu");
            System.out.println("2-Siparis girme");
            System.out.println("3-Siparis iptal etme");
            System.out.println("4-Hesap Olustur");
            System.out.println("0-CIKIS");
            System.out.println("Seciminiz : ");
            select=sc.nextInt();
            System.out.println("------------------------------------------------------------------------");

            switch (select){
                case 1:
                    a.showMenu();
                    break;
                case 2:
                    ord.createOrder(a);
                    break;
                case 3:
                    ord.deleteOrder();
                    break;
                case 4:
                    ord.printBill();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Giris");
                    break;
            }


        }

        System.out.println("Iyi Gunler...");
    }
}
