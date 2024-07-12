package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("sum")
public class ArthematicOpration {
	
	public double sumOftwoNum(double num1,double num2) {
		return num1+num2;
	}

}
