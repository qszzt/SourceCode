package test5;

public class Student {
        private String name;
        private char sex;
        private int age;
        private String ID;
        private String credit;
        public Student(String name,char sex,int age,String ID,String credit) {
        	this.name=name;
        	this.sex=sex;
        	this.age=age;
        	this.ID=ID;
        	this.credit=credit;
        }
        public String getName() {
        	return name;
        }
        public char getSex() {
        	return sex;
        }
        public int getAge() {
        	return age;
        }
        public String getID() {
        	return ID;
        }
        public String getCredit() {
        	return credit;
        }
        public void setName(String name) {
        	this.name=name;
        }
        public void setSex(char sex) {
        	this.sex=sex;
        }
        public void setAge(int age) {
        	this.age=age;
        }
        public void setID(String ID) {
        	this.ID=ID;
        }
        public void setCredit(String credit) {
        	this.credit=credit;
        }
        @Override
       public boolean equals(Object obj) {
    	   if(this==obj) {
    		   return true;
    	   }
    	   if(obj==null) {
    		   return false;
    	   }
    	   else {
    		   if(obj instanceof Student);{
    			   Student student=(Student)obj;
    			   if(student.credit==this.credit) {
    				   return true;
    			   }
    			   else
    				   return false;
    		   }
    		   
    	   }
       }
        public static void main(String[] args){
        	Student a=new Student("xx",'Å®',19,"20181101xxx","21");
        	Student b=new Student("xxx",'ÄÐ',18,"201811012xx","22");
        	System.out.println(a.getName());
        	System.out.println(a.getSex());
        	System.out.println(a.getAge());
        	System.out.println(a.getID());
        	System.out.println(a.getCredit());
        	System.out.println(b.getName());
        	System.out.println(b.getSex());
        	System.out.println(b.getAge());
        	System.out.println(b.getID());
        	System.out.println(b.getCredit());
        	System.out.println(a.equals(b));
        }
}
