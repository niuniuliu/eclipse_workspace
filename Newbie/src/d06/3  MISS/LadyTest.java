package org.whatisjava.core;

public class LadyTest {
	public static void main(String[] args)
	{
		//feed dog
		Lady lady = new Lady();
		lady.name = "好人";
		lady.age = 25;
		
		lady.pet = new Dog();
		lady.pet.name = "dahuang";		
		lady.feedMyPet();
		
//		lady.pet = new Cat();
//		lady.pet.name = "xiaobai";		
//		lady.feedMyPet();

		//feed cat
		Lady lady2 = new Lady();
		lady2.name = "da好人";
		lady2.age = 28;
		
		lady2.pet = new Cat();
		lady2.pet.name = "xiaobai";		
		lady2.feedMyPet();
		
		//feed bird
		Lady lady3 = new Lady();
		lady3.name = "xiao好人";
		lady3.age = 40;
		
		lady3.pet = new Bird();
		lady3.pet.name = "xiaobai";		
		lady3.feedMyPet();
		
	}

}
