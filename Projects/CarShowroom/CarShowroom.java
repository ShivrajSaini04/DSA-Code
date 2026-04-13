package CarShowroom;

import java.util.Scanner;

class Showroom {
  String name;
  String price;
  String sunroof;
  String fuletype;

  void menu() {
    System.out.println("\n    Choose From Below \n");
    System.out.println("1. BMW             2. AUDI Q3");
    System.out.println("3. FORTUNER        4. TESLA\n5. OWNER DETAIL    6. EXIT SHOWROOM");
  }

  public void owner() {
    String name = "Shiva Saini ";
    String show = "NinjaX.04";
    int total = 4;
    System.out.println("Owner          -: " + name);
    System.out.println("Showroom Name  -: " + show);
    System.out.println("Location       -: XXXXX");
    System.out.println("Total Car      -:" + total);
  }
}

class car extends Showroom {
  Scanner sc = new Scanner(System.in);

  void buy(int num) {
    // buy car
    if (num == 1) {
      System.out.println("\n    Your Car is  Successfully Ordered ");
      System.out.println("\n   Enter 1 For Main Menu  \n");
      int x = sc.nextInt();
      if (x == 1) {
        menu();
      }
    }
  }

  // Car Details
  void bmw() {
    name = "BMW ";
    price = "20.5 millon ";
    sunroof = "True";
    fuletype = "Disel";
    System.out.println(
        "CarName  -: " + name + "\nPrice    -: " + price + "\nFuletype -: " + fuletype + "\nSunroof  -: " + sunroof);
  }

  void audi() {
    name = "Audi Q3";
    price = "8 millon ";
    sunroof = "True";
    fuletype = "Disel";
    System.out.println(
        "CarName  -: " + name + "\nPrice    -: " + price + "\nFuletype -: " + fuletype + "\nSunroof  -: " + sunroof);
  }

  void fortuner() {
    name = "Fortuner ";
    price = "10 millon ";
    sunroof = "False";
    fuletype = "Disel";
    System.out.println(
        "CarName  -: " + name + "\nPrice    -: " + price + "\nFuletype -: " + fuletype + "\nSunroof  -: " + sunroof);
  }

  void tesla() {
    name = "Tesla ";
    price = "15 millon ";
    sunroof = "False";
    fuletype = "Electric";
    System.out.println(
        "CarName  -: " + name + "\nPrice    -: " + price + "\nFuletype -: " + fuletype + "\nSunroof  -: " + sunroof);
  }
}

// Main Class
public class CarShowroom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("    Welcome To NinjaX.04         ");
    car obj = new car();
    obj.menu();

    for (int i = 0; i < 10; i++) {
      int n = sc.nextInt();
      if (n == 6) {
        break;
      }
      switch (n) {
        case 1:
          obj.bmw();
          break;
        case 2:
          obj.audi();
          break;
        case 3:
          obj.fortuner();
          break;
        case 4:
          obj.tesla();
          break;
        case 5:
          obj.owner();
          break;
      }
      if (n < 5) {
        System.out.println("\n   Enter Number from Below   ");
        System.out.println("1.Buy Car    2.Main Menu");
        int x = sc.nextInt();
        if (x == 1) {
          obj.buy(x);
        } else {
          obj.menu();
        }
      } else {
        obj.menu();
      }
    }
  }
}