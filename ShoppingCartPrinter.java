import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String itemOneName;
    String itemTwoName;
    int itemOnePrice;
    int itemTwoPrice;
    int itemOneQuantity;
    int itemTwoQuantity;
    int itemOneTotal;
    int itemTwoTotal;
    int totalCost;
    Scanner scnr = new Scanner(System.in);
    ItemToPurchase itemOne = new ItemToPurchase();
    ItemToPurchase itemTwo = new ItemToPurchase();

    System.out.println("Item 1");
    itemOne.setName();
    itemOneName = itemOne.getName();
    itemOne.setPrice();
    itemOnePrice = itemOne.getPrice();
    itemOne.setQuantity();
    itemOneQuantity = itemOne.getQuantity();
    itemOneTotal = itemOneQuantity * itemOnePrice;

    scnr.nextLine();

    System.out.println("Item 2");
    itemTwo.setName();
    itemTwoName = itemTwo.getName();
    itemTwo.setPrice();
    itemTwoPrice = itemTwo.getPrice();
    itemTwo.setQuantity();
    itemTwoQuantity = itemTwo.getQuantity();
    itemTwoTotal = itemTwoQuantity * itemTwoPrice;

    System.out.println("TOTAL COST");
    System.out.println(itemOneName + " " + itemOneQuantity + " $" + itemOnePrice + " = " + itemOneTotal);

    System.out.println(itemTwoName + " " + itemTwoQuantity + " $" + itemTwoPrice + " = " + itemTwoTotal);
    System.out.println("");
    totalCost = itemOneTotal + itemTwoTotal;
    System.out.println("Total:  $" + totalCost);
    


  }
}