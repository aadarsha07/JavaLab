# Constructor in Java
Constructor is a block of code that initializes the newly created object. A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type. 
## Types of Constructors
There are two types of constructors: Default and Parameterized
1. Default constructor
If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code on your behalf. This constructor is known as default constructor. 
2. Parameterized constructor
Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
Example:
```javascript 
public class Employee {

   int empId;  
   String empName;  
	    
   //parameterized constructor with two parameters
   Employee(int id, String name){  
       this.empId = id;  
       this.empName = name;  
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  
	   
   public static void main(String args[]){  
	Employee obj1 = new Employee(10245,"Chaitanya");  
	Employee obj2 = new Employee(92232,"Negan");  
	obj1.info();  
	obj2.info();  
   }  
}
