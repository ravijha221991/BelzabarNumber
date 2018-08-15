package com.balzabar.number;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AlgebricUtilTest {
	
	AlgebricUtil algebricUtil = null;
	
	@Before
	public void init(){
		algebricUtil = new AlgebricUtil();
	}
	
	@Test
	public final void testGetSolution1() {
		Double[] roots = algebricUtil.getSolution(0);
		Assert.assertArrayEquals(roots, new Double[]{-17d,-3d,3d,17d});
	}
	
	@Test
	public final void testGetSolution2() {
		Double[] roots = algebricUtil.getSolution(2);
		Assert.assertArrayEquals(roots, new Double[]{-14.14d,-0.14d,0.14d,14.14d});
	}
	
	@Test
	public final void testIsPrime1(){
		boolean isPrime = algebricUtil.isPrime(1d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime2(){
		boolean isPrime = algebricUtil.isPrime(2d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime3(){
		boolean isPrime = algebricUtil.isPrime(3d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime4(){
		boolean isPrime = algebricUtil.isPrime(4d);
		Assert.assertFalse(isPrime);
	}
	
	@Test
	public final void testIsPrime5(){
		boolean isPrime = algebricUtil.isPrime(5d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime6(){
		boolean isPrime = algebricUtil.isPrime(13d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime7(){
		boolean isPrime = algebricUtil.isPrime(43d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime8(){
		boolean isPrime = algebricUtil.isPrime(103d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime9(){
		boolean isPrime = algebricUtil.isPrime(99d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime10(){
		boolean isPrime = algebricUtil.isPrime(229d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime11(){
		boolean isPrime = algebricUtil.isPrime(4951d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime12(){
		boolean isPrime = algebricUtil.isPrime(10271d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime13(){
		boolean isPrime = algebricUtil.isPrime(99901d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime14(){
		boolean isPrime = algebricUtil.isPrime(999983d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime15(){
		boolean isPrime = algebricUtil.isPrime(1299827d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime16(){
		boolean isPrime = algebricUtil.isPrime(99832261d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime17(){
		boolean isPrime = algebricUtil.isPrime(1000012337d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime18(){
		boolean isPrime = algebricUtil.isPrime(1000000016531d);
		Assert.assertTrue(isPrime);
	}
	
	@Test
	public final void testIsPrime19(){
		boolean isPrime = algebricUtil.isPrime(2098893657440586486151264256610222593863921d);
		Assert.assertFalse(isPrime);
	}
	
	
	
	
	
	
	
	
}
