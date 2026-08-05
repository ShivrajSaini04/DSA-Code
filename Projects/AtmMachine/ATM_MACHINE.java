package AtmMachine;
import java.util.Scanner;

// ATM MACHINE 
class account {
  int E_pin;// exact atm pin
  int Blance = 5000;
  Scanner scan1 = new Scanner(System.in);

  public account(int pin, int pin1) { // checking of user
    E_pin = pin1;
    if (pin == pin1) {
      System.out.println("Choose Any Number From Below ");
    } else {
      System.out.println("Invalid Pin : Try Again ");
    }
  }

  public int Deposite(int n) {
    Blance = Blance + n;
    return Blance;
  }

  public int totalblance(int n) {
    int amount = Blance - n; // n=amaount of withraw & diposite
    return amount;
  }

  void accountdetail() {
    String name = "Shiva Saini";
    int Ac_num = 100047;
    long mobail = 9258210535L;
    int Blance = totalblance(0);
    System.out.println("Name            -: " + name);
    System.out.println("Account Number  -: " + Ac_num);
    System.out.println("Total Blance    -: " + Blance);
    System.out.println("Mobail Number   -: " + mobail);
  }

  int pinchange(int pin1) {
    for (int i = 0; i < 4; i++) {
      System.out.println("Enter your old pin ");
      int pin2 = scan1.nextInt();
      if (pin1 == pin2) {
        System.out.println("Enter New Pin ");
        pin1 = scan1.nextInt();
        return pin1;
      } else {
        System.out.println("Wrong pin enter ! try again  ");
      }
    }
    return 0;
  }
}

// Main Class
public class ATM_MACHINE {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int pin1 = 1052, with = 0, res = 0;
    System.out.println(" Welcome To Atm Machine ");
    System.out.println(" Enter your Pin ");
    int pin = scan.nextInt();
    account ac = new account(pin, pin1);
    if (pin == pin1) {
      System.out.println(
          " Enter 1 For Check Account Detailes\n Enter 2 for Withraw Ammount \n Enter 3 for Deposite Ammount \n Enter 4 for Check  Blance \n Enter 5 Change Your Pin \n Enter 6 for Exit From Atm Machine ");
      for (int i = 1; i < 10; i++) {
        int n = scan.nextInt();

        switch (n) {
          case 1:
            ac.accountdetail();
            break;

          case 2:
            System.out.println("Enter withraw amount ");
            with = scan.nextInt();
            if (ac.totalblance(with) < 0) {
              System.out.println("Invalid Amaount ! Try  Again ");
              break;
            } else {
              System.out.println("Enter your Atm PIN ");
            }
            int Check = scan.nextInt();
            if (Check == pin1) {
              res = ac.totalblance(with);
              System.out.println(with + " ruppes  succesfull withraw" + "\nremining Blance is = " + res);
            } else {
              System.out.println("INVALID ATM PIN , Try Again ");
            }
            break;

          case 3:
            System.out.println("Enter Deposite amount ");
            int newblance = scan.nextInt();
            if (newblance < 0) {
              System.out.println("Invalid Amaount ! Try  Again ");
              break;
            } else {
              System.out.println("Enter your Atm PIN ");
            }
            int Check1 = scan.nextInt();
            if (Check1 == pin1) {
              res = ac.Deposite(newblance);
              System.out.println(newblance + " Ruppes  succesfull withraw" + "\nTotal  Blance is = " + res);
            } else {
              System.out.println("INVALID ATM PIN , Try Again ");
            }
            break;

          case 4:
            res = ac.totalblance(with);
            System.out.println(res + " ruppes is  total blance ");
            break;
          case 5:

            pin1 = ac.pinchange(pin1);
            System.out.println("your New Pin is " + pin1);
            break;

          default:
            if (n != 6) {
              System.out.println("Invalid Number : Try Again ");
              break;
            }
        }
        if (n == 6) {
          break;
        }
        System.out.println("\nChoose Number From Above For More Services");
      }
    }
  }
}
