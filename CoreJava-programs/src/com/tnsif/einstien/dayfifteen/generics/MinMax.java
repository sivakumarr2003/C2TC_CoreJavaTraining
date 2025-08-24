//Program to demonstrate generic interface
package com.tnsif.einstien.dayfifteen.generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

