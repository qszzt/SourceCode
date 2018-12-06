package test4;

public class Student {
      String name;
      int age;
      char sex;
      String num;
      String profession;
      public Student(String n,int a,char s,String n1,String p) {
    	  name=n;
    	  age=a;
    	  sex=s;
    	  num=n1;
    	  profession=p;
      }
      public Student(String n,int a) {
    	  name=n;
    	  age=a;
      }
      public String getName() {
      	return name;
      }
      public void setName(String n) {
        	name=n;
        }
      public int getAge() {
    	  return age;
      }
      public void setAge(int a) {
      	age=a;
      }
      public char getSex() {
    	  return sex;
      }
      public String getNum() {
    	  return num;
      }
      public void setNum(String n1) {
        	num=n1;
        }
      public String getProfession() {
    	  return profession;
      }
      public void setProfession(String p) {
        	profession=p;
        }
      public void say() {
    	  System.out.println("我叫邱爽，今年18岁，我的专业是计算机类"); 
      }
      public static void main(String[] args){
  		Student abc=new Student("邱爽",18,'女',"20181101205","计算机类");
  		System.out.println(abc.getName());
  		System.out.println(abc.getAge());
  		System.out.println(abc.getSex());
  		System.out.println(abc.getNum());
  		System.out.println(abc.getProfession());
  		abc.setName("q");
  		System.out.println(abc.getName());
  		abc.setAge(17);
  		System.out.println(abc.getAge());
  		abc.setNum("2018xxx");
  		System.out.println(abc.getNum());
  		abc.setProfession("网计");
  		System.out.println(abc.getProfession());
  		abc.say();
  		Student abcd=new Student("邱爽",17);
  		System.out.println(abcd.getAge());
  	}
}
