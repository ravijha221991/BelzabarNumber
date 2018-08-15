package com.balzabar.number;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgebricUtil {
	
	//Belzabar equation(n^2+14n-number) 1 constants
	public static final int QUADRATIC_CONSTANT1=1;
	public static final int LINEAR_CONSTANT1=14;
	
	//Belzabar equation(n^2-14n-number) 2 constants
	public static final int QUADRATIC_CONSTANT2=1;
	public static final int LINEAR_CONSTANT2=-14;
	
	public Double[] getSolution(long number){
		double[] equation1Roots = getEquationRoots(QUADRATIC_CONSTANT1,LINEAR_CONSTANT1,number);
		double[] equation2Roots = getEquationRoots(QUADRATIC_CONSTANT2,LINEAR_CONSTANT2,number);
		return merge(equation1Roots,equation2Roots);
	}
	
	private double[] getEquationRoots(int quadConstant,int linearConstant,long number) {
		double d = Math.pow(linearConstant, 2) - (4*quadConstant)*(-number);
		double root1 = (-linearConstant + Math.sqrt(d))/(2*quadConstant);
		double root2 = (-linearConstant - Math.sqrt(d))/(2*quadConstant);
		return new double[]{root1,root2};
	}

	private Double[] merge(double[] equation1Roots, double[] equation2Roots) {
		List<Double> list = new ArrayList<>();
		if(isWholeNumber(equation1Roots[0])){
			list.add(equation1Roots[0]);
		}
		if(isWholeNumber(equation1Roots[1])){
			list.add(equation1Roots[1]);
		}
		if(isWholeNumber(equation2Roots[0])){
			list.add(equation2Roots[0]);
		}
		if(isWholeNumber(equation2Roots[1])){
			list.add(equation2Roots[1]);
		}
		Collections.sort(list);
		return list.toArray(new Double[]{});
	}
	
	private double round(double value, int places) {
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	public boolean containsPrimNumber(Double[] numbers){
		boolean isPrime = false;
		for(double number:numbers){
			if(isPrime(number)){
				isPrime=true;
				break;
			}
		}
		return isPrime;
	}
	
	public boolean isPrime(double number){
		boolean isPrimeNumber = true;
		if(number==1 || number == 2 || number == 3){
			isPrimeNumber = true;
		}else if(!(number%2==0)){
			Double sqrt = Math.sqrt(number);
			if(!sqrt.equals(Double.NaN)){
				for(Double i=4d;i<sqrt;i+=2d){
					if(number%i==0){
						isPrimeNumber=false;
						break;
					}
				}
			}else{
				isPrimeNumber = false;
			}
		}else{
			isPrimeNumber=false;
		}
		return isPrimeNumber;
	}
	
	public boolean isWholeNumber(Double number){
		return number>0 && (number-Math.floor(number))==0;
	}

	
}
