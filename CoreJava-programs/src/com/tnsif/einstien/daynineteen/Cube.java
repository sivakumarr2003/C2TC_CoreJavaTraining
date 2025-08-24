//Program to demonstrate Functional Interface

package com.tnsif.einstien.daynineteen;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}