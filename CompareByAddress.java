package com.te.Basic.collection;

import java.util.Comparator;

public class CompareByAddress implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.studentAddress.compareTo(o2.studentAddress);
	} 
	

	

		
	}


