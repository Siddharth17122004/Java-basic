import java.util.*;
public  class t1{
    public String brand;
    public String model;
    public double price;
    public int batteryCapacity;

public void display(){
    System.out.println("Brand: "+brand);
    System.out.println("Model is: "+model);
    System.out.println("Price is: "+price);
    System.out.println("Batter Capacity is: "+batteryCapacity);
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    t1 m=new t1();

    System.out.println("Enter brand,model,price and battery capacity: ");
    m.brand=sc.nextLine();
    m.model=sc.nextLine();
    m.price=sc.nextDouble();
    m.batteryCapacity=sc.nextInt();
    sc.nextLine();
    m.display();
    System.out.print("Enter brand,model,price and battery capacity");
    t1 m1=new t1();
    m1.brand=sc.nextLine();
    m1.model=sc.nextLine();
    m1.price=sc.nextDouble();
    m1.batteryCapacity=sc.nextInt();
    
    
    m1.display();


} 
}