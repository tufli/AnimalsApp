package main;

public class AnimalsApp {
	public static void main(String[] args) {
				
		Animal a = new Animal ("Tuzik", 35);
		a.info();
		
		Dog my_dog = new Dog("Nerro",11);
		my_dog.info();
				
		Cat c= new Cat("M",6);
		c.info();
		
		}	
	}

////////////////////////////PROPERTIES///////////////////////////
class Animal {
	private String name;
	private Integer age;
	
/////////////////////////////METHODS//////////////////////////////
		
	public Animal() {} //// Default constructor my be empty
		public Animal (String name, Integer age) {
//			this.name= name; 
			setName(name);
//			this.age= age;	
			setAge(age);
		}
			public void info() {
				info("ANIMAL");
			}
		
///////Get-Set NAME///////////
		public String getName() {
			return name;
			}
		public void setName(String name) {
			int len= name.length();
			
			if(len>1) {
				this.name=name;
			} else {
	System.err.println("WRONG NAME!");
	}
}
		
///////Get-Set AGE///////////	
		public Integer getAge() {
			return age;
			}
		public void setAge(Integer age) {
			if(age>0 && age<30) {
			this.age = age;
			}else{ System.err.print("Wrong in age");
				}
			}
			
public void info(String type) {
	System.out.printf("###  This is an %6s  ###\n", type);
	System.out.printf( "%10s (%d years)\n",name,age);	
	System.out.println("###########################\n");
	}
}
//////////////////////////INHERITAGE//////////////////////////
//descendant class
class Dog extends Animal {
	public Dog() {} /////////// Constructor cannot be inherited
		public Dog (String name, Integer age) {		
//		this.name= name; 
//		this.age= age;
			super(name,age);
		}
		public void info() {
			super.info("DOG");
		}
}

class Cat extends Animal {
	public Cat() {} /////////// Constructor cannot be inherited
		public Cat (String name, Integer age) {		
//		this.name= name; 
//		this.age= age;
			super(name,age);
		}
		public void info() {
			super.info("CAT");
		}
}
