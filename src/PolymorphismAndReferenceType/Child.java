package PolymorphismAndReferenceType;

import Poly2.Parent;

public class Child extends Parent{
	
	int tellMe=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj1 = new Child();
		obj1.tellMe=1;
		System.out.println(obj1.tellMe);
		
		Child obj2 = new Parent();//does not fit in Child reference
		obj2.tellMe=2;
		
		Child obj2a = (Child) new Parent(); //throws ClassCastException
		obj2a.tellMe=2;
		
		Parent obj3 = new Child();
		obj3.tellMe=3;// Child reference can call this protected variable into this class but 
		System.out.println(obj3.tellMe);// not this one, because it is only visible to the Child references
		
		Parent obj4 = new Parent();
		obj4.tellMe=3;
		System.out.println(obj4.tellMe);

	}

}
