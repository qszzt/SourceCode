package test4;

public class Person {
	String name;
    int age;
    public Person(String n,int a) {
  	  name=n;
  	  age=a;
    }
    public Person(String name) {
    	this.name=name;
    }
    public String getName() {
      	return name;
      }
    public int getAge() {
      	return age;
      }
    public String toString() {
    	return name;
    	
    }
    
    public static void main(String[] args){
  		Person abc=new Person("ÇñË¬");
  		System.out.println(abc.getName());
  	
  		
    }
}
