package test6;

public class G {
	public  void makeCry() {
		dog.say();
		cat.say();
	}
	Dog dog=new Dog();
	Cat cat=new Cat();
	static G g=new G();
	public static void main(String[] args){
		 g.makeCry();
	}
}
class Dog {
	public void say() {
  	  System.out.println("我是狗，我的叫声是汪汪汪");
	}
}
class Cat{
	public void say() {
    	  System.out.println("我是猫，我的叫声是喵喵喵");
  	}
}