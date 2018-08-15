package com.balzabar.number;

public class BelzabarNumber {
	
	public static boolean isBelzabarNumber(long number){
		AlgebricUtil algebricUtil = new AlgebricUtil();
		Double[] solutions = algebricUtil.getSolution(number);
		return algebricUtil.containsPrimNumber(solutions);
	}
	
	public static Long countBelzabarNumber(long number){
		Long count = 0l;
		for(long i=0l;i<number;i++){
			if(isBelzabarNumber(i)){
				System.out.println("i="+i);
				count++;
			}
		}
		return count;
	}
	
}
