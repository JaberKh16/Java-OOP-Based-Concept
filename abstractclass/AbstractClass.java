/*
    Definition of Abstract Class and Why is used:
   ===========================
    In Java, Abstract Class is the class which is being used when we want Encapsulate the class insidal methods
    definition.In other words, when we want to hide the implementations details and only the functionality needs 
    to be provided. The Class which contains 'abstract' keyword with its name is the Cbstract Class.

    Properties of Abstract Class:
   ==================
    Abstract Class has some properties which are the following:
        1) Abstract Class may or may not have abstract method, but if a Class has at least one abstract method, then it 
            must be created as Abstract Class.
         
        2) Those Classes which extends the Abstract Class must implements(means overrides) all of its abstract method.
        3) Abstract can't be initiated, thuse need to create Child Class which extends it, so required Inheritance.
*/
package javaoopfundamentals.abstractclass;

abstract class User
{
    // class variables
    private String name;
    private String password;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // default methods
    void msgFromAbstractClass()
    {
        System.out.println("This is an Abstract Class 'User' ");
    }
    
}


// Creating a Child Class 'RegularUser' which extends the Abstract Class 'User'
class RegularUser extends User
{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

public class AbstractClass {
    
    public static void main(String [] args)
    {
        // abstract class can't be instantiated, create a child class thus need Inheritance
        //User u = new User();
        // Creating an instance/object of Child Class Itself
        RegularUser ru = new RegularUser();
        ru.setName("Rachel");
        ru.setPassword("rachel123");
        ru.setEmail("rachel12@gmail.com");
        
        System.out.println("UserName:" + ru.getName());
        System.out.println("Password:" + ru.getPassword());
        System.out.println("Email:" + ru.getEmail());
        
        // Creating an user instance/object of Child Class 'RegularUser' using Abstract Class reference 
        User usr = new RegularUser(); // abstract class can't be initiated but its reference can be used if any class extends it
        usr.setName("Ross");
        usr.setPassword("ross124");
        
        System.out.println("UserName:" + usr.getName());
        System.out.println("Password:" + usr.getPassword());
        
        
    }
    
}
