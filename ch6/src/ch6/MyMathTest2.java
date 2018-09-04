package ch6;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest2 {

	@Test public void test1() {assertTrue(mid(1,2,3)==2);}
	@Test public void test2() {assertTrue(mid(1,1,1)==1);}
	@Test public void test3() {assertTrue(mid(1,3,3)==3);}
	@Test public void test4() {assertTrue(mid(3,2,1)==2);}
	@Test public void test5() {assertTrue(mid(2,3,1)==2);}
	@Test public void test6() {assertTrue(mid(1,1,3)==1);}
	@Test public void test7() {assertTrue(mid(2,2,1)==2);}
	@Test public void test8() {assertTrue(mid(2,2,2)==2);}
	@Test public void test9() {assertTrue(mid(3,3,3)==3);}
	@Test public void test10() {assertTrue(mid(2,1,1)==1);}
	@Test public void test11() {assertTrue(mid(1,3,2)==2);}
	@Test public void test12() {assertTrue(mid(1,2,3)==2);}
	@Test public void test13() {assertTrue(mid(6,7,3)==6);}
	
	
	int mid(int x, int y, int z){
		int tmp = 0;
		//
		if(x>y){
			tmp = x;
			x = y;
			y = tmp;
		}
		if(y>z){
			tmp = y;
			y = z;
			z = tmp;
		}
		if(x>y){
			tmp = x;
			x = y;
			y = tmp;
		}
		return y;
	}

}
