class Person 
{
    //1. this is overload by changing the no of arguments
   Person(String name)
  {
    System.out.println("Name of person = "+name);
  }
  
  Person(String name, String voterId)
  {
    System.out.println("Name of person = "+name );
    System.out.println("Voter ID of " +name+ " = "+ voterId);
  }
  

  //2. this overload by changing data type of parameter

  
  Person(String name, int voterId)
  {
    System.out.println("Name of person = "+name );
    System.out.println("Voter ID of " +name+ " = "+ voterId);
  }


  //3. this overload by changing the order of parameters

  Person(int voterId, String name)
  {
    System.out.println("Name of person = "+name );
    System.out.println("Voter ID of " +name+ " = "+ voterId);
  }


  public static void main (String [] args) 
  {

    // 1. Overload example
      // If user has not voter ID then just print name.
      Person person1 = new Person("Ravi");
      // If user has voter ID then print name and voter Id
      Person person2 = new Person("Ram", "12345678");

    //   2.Overload example 
         // If user has city and name then perform different action
      Person person3 = new Person("Ravi", "YNR");
      // If user has voter ID then print name and voter Id
      Person person4 = new Person("Ram", 12345678);

    //   3. Overload Example 
          // If user has name and PAN card details then perform some action
      Person person5 = new Person("Ravi", 0001112);
      // If user has name and voter ID then perform some action
      Person person6 = new Person(12345678, "Ram");
  }
}


