package practice.javaPart2;

public class Product {
    private int id;
    private String name;
    private Double price;
    public  Product() {
        super();
    }
    private void getData(int id,String name,Double price) {
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public void showData() {
        System.out.print(id+","+name+","+price);
    }

    public static void main(String[] args) {
        new Product().getData(10,"Sugar",45.00);
        new Product().showData();               // o/p :0,null,null

        //If object is created and called by same object then o/p will be  10,Sugar,45.0
        Product p = new Product();
        p.getData(10,"Sugar",45.00);
        p.showData();                // 10,Sugar,45.0

    }
}


// o/p :0,null,null