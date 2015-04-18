package com.pranay.learning2;

import com.pranay.learning.SimpleProgram;


public class DriverProgram2 extends SimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SuperProgram t1=new SuperProgram();
		 SuperProgram t2=new SuperProgram();
		 
		 if((t1.equals(t2))){
			 System.out.println("its true");
		 }
		 if(t1 instanceof Object){
			 
			 System.out.println("its really true");
		 }
		 
	}

}
