
// class -> blueprint
class Pen{
  String color;
  String type;

  public void write(){
    System.out.println("writing something");
  }

  public void printColor(){
    System.out.println(this.color);
  }
}

class Student{
  String name;
  int age;

  public void pritnName(){
    System.out.println(this.name);
    System.out.println(this.age);
  }

  // constructor -> (1).non parameter
  // Student(){
  //   System.out.println("constructor called");
  // }

  // (2).parameter constructor
  Student(String name, int age){
    this.name = name;
    this.age = age;
  }

  // (3).copy constructer
  Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
  }
  Student(){

  }
}
// ❤️abstraction

 abstract class Animal{
  abstract void walk();
  // constructer
  Animal(){
    System.out.println("you are creating a new Animal");
  }
  public void eats(){
    System.out.println("Animal eats");
  }

  }

  // ❤️interfaces

interface Man{
  // property
  //int eyes = 2;
  //void finger();
  public void finger();
}
//prop hai
 interface Herbivore {

}
class Boy implements Man,Herbivore{
  public void finger(){
    System.out.println("5 finger in left hand");
  }
}
class Horse extends Animal{
    // constructer
       Horse(){
      System.out.println("created a horse");
    }
  public void walk(){
    System.out.println("walks on 4 legs");
  }
}
class Chicken extends Animal{
  public void walk(){
    System.out.println("walks on 2 legs");
  }
}

//❤️ static keyword
class Std{
 String name;
  static String school;
}

// object main function ke andar
public class OOPS{
 
  public static void main(String args[]){
  //  Pen pen1 = new Pen();
  //  pen1.color = "blue";
  //  pen1.type = "gel";

   //pen1.write();

  //  Pen pen2 = new Pen();
  //  pen2.color = "black";
  //  pen2.type = "ballpen";

  //  pen1.printColor();
  //  pen2.printColor();

 /* Student s1 = new Student();
  s1.name = "LALIT";
  s1.age = 18;
  s1.pritnName();*/ 

  // Student s1 = new Student("LALIT",18);
  // s1.pritnName();

  // Student s1 = new Student();
  // s1.name = "AMAN";
  // s1.age = 25;

  // Student s2 = new Student(s1);
  // s2.pritnName();

// ❤️abstraction
Horse horse = new Horse();
horse.walk();

 //Animal animal = new Animal(); // runtime error
 //animal.walk();

 horse.eats();

//  ❤️interfaces
Boy boy = new Boy();
boy.finger();

//❤️ static keyword
Std.school = "jmv";
Std student1 = new Std();
student1.name = "tony";
System.out.println(student1.school);

  }
}