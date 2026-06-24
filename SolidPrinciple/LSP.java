package SolidPrinciple;  // Liskov substition principle
interface Account{
  void checkbalance();
}

interface withdrawell{
  void withdraw(double amount);
}
class savingAccount implements Account, withdrawell{
  public void checkbalance(){
    System.out.println(" savings account checked balance...");
  }
  public void withdraw(double amount){
    System.out.println(amount + " withdraw from saving account");

  }
}

class currentaccount implements Account , withdrawell{
    public void checkbalance(){
    System.out.println(" current account checked balance...");
  }
  public void withdraw(double amount){
    System.out.println(amount + " withdraw from current account");

  }
}
class FD implements Account{
  public void checkbalance(){
    System.out.println("FD account check balance");
  }
}
public class LSP {
  public static void main(String[] args) {
    savingAccount s = new savingAccount();
    s.checkbalance();
    s.withdraw(3000);
    currentaccount c = new currentaccount();
    c.checkbalance();
    c.withdraw(4000);

    FD f = new FD();
    f.checkbalance();;




  }
  
}
