package mainrestaurant;

public class Order {
    public int orderCode;

    public Dish dish;

    public int numOfDish;

    public double orderPrice;



    public void setOrderCode(int code){
        this.orderCode=code;
    }

    public Order(Dish dish,int numOfDish){
        this.dish=dish;
        this.numOfDish=numOfDish;
        setPrice();
        orderCode++;
    }



    public void setPrice(){
        this.orderPrice=this.dish.getPrice()*this.numOfDish;
    }








}
