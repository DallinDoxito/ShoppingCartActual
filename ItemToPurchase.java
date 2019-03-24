import java.util.Scanner;
public class ItemToPurchase {
  private String itemName;
  private int itemPrice;
  private int itemQuantity;
  

  public ItemToPurchase() {
    itemName = "NoName";
    itemPrice = -1;
    itemQuantity = -1;
  }
  public void setName() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the item name: ");
    itemName = scnr.nextLine();
  }
  public String getName() {
    return itemName;
  }
  public void setPrice() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the item price: ");
    itemPrice = scnr.nextInt();
  }
  public int getPrice() {
    return itemPrice;
  }
  public void setQuantity() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the item quantity: ");
    itemQuantity = scnr.nextInt();
  }
  public int getQuantity() {
    return itemQuantity;
  }
}