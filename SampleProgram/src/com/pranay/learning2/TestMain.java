package com.pranay.learning2;

public class TestMain {
	
	//int last;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 boolean s=isPrime(1);
 System.out.println("hi this is "+s);
		

	}

	public static boolean isPrime(int prime){
		if(prime==2){
			
			return true;
		}
		
		for(int i=2;i<prime;i++){
			
		if( prime%i==0){
			return false;
		}
		
		}
		return true;
	}
}
