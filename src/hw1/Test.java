package hw1;

import static org.junit.Assert.*;

public class Test {

	static Shoppingcart cart= new Shoppingcart();
	
	@org.junit.Test
	public void test1() {
	int act1= cart.noOfBooks();
	assertTrue(act1==0);
	}

	
	@org.junit.Test
	public void test2() {
	cart.addBook("java",127);
	int act2= cart.noOfBooks();
	assertTrue(act2==1);
	int act3=cart.totalprice();
	assertTrue(act3==127);
	}
	
	
	@org.junit.Test
	public void test3() {
	cart.addBook("web",100);
	int act4= cart.noOfBooks();
	assertTrue(act4==2);
	int act5=cart.totalprice();
	assertTrue(act5==227);
	}
}
