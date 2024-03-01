// import java.util.*;
// import bank;
package bank;
class Account{
  public String name;
  protected String email;
  private String password;

  // getters and setters
  public String getPassword(){
    return this.password;
  }
  public void setPassword(String pass){
    this.password = pass;
  }
}

class Shape{
  public void area(){
    System.out.println("dispaly area");
  }
}
class Triangle extends Shape{
  public void area(int l, int h){
    System.out.println(1/2*l*h);
  }
}
  class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
      System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
  public void area(int r){
    System.out.println(3.14 * r * r);
  }
}
public class Bank {
  
  public static void main(String args[]){
   
    bank.Account account1 = new bank.Account();
    account1.name = "customer1";
    account1.email = "apanacolege.com";
    account1.setPassword("abcsd");
    System.out.println(account1.getPassword());
  }
}
