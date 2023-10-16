// abstract class Bank{    
// abstract int getRateOfInterest();    
// }    
// class SBI extends Bank{    
// int getRateOfInterest(){return 7;}    
// }    
// class PNB extends Bank{    
// int getRateOfInterest(){return 8;}    
// }    
    
// class TestBank{    
// public static void main(String args[]){    
// Bank b;  
// b=new SBI();  
// System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
// b=new PNB();  
// System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
// }}    


abstract class MotorBike {
  abstract void brake();
}

class SportsBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("SportsBike Brake");
  }
}

class MountainBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("MountainBike Brake");
  }
}

class Main {
  public static void main(String[] args) {
    MountainBike m1 = new MountainBike();
    m1.brake();
    SportsBike s1 = new SportsBike();
    s1.brake();
  }
}