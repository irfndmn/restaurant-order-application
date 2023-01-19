package restaurantside;

import mainrestaurant.OrderService;

import java.util.Scanner;

public class RestaurantBillGenerator {



    public  void forRestaurantSide(){
        MainService anaSer=new MainService();
        anaSer.fillDishList();
        OrderService o=new OrderService();
        getSelectionMenu(anaSer,o);



    }



    public void getSelectionMenu(MainService a,OrderService o) {
        int select=-1;
        while(select!=0){
            Scanner sc =new Scanner(System.in);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("=========    Ana Restaurant Siparis Uygulamasi ===========");
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
                    o.createOrder(a);
                    break;
                case 3:
                    o.deleteOrder();
                    break;
                case 4:
                    o.printBill();
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
