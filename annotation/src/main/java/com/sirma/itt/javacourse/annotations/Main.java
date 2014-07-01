package com.sirma.itt.javacourse.annotations;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Class for comparing classes.  
 * 
 * @author Nikolay Ch
 */
public class Main {

	/**
	 * Makes an array with the three children and sorts them a custom annotation. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		Parent[] arraylist=new Parent[3];
		Child1 child1=new Child1();
		Child2 child2=new Child2(0, null, null);
		Child3 child3=new Child3(0, null, null, null);
		
		arraylist[0]=child1;
		arraylist[1]=child2;
		arraylist[2]=child3;
		
		Arrays.sort(arraylist,new Comparator<Parent>(){

			public int compare(Parent o1, Parent o2) {
				Layout ann=o1.getClass().getAnnotation(Layout.class);
				Layout ann2=o2.getClass().getAnnotation(Layout.class);
				int priority1=ann.priority();
				int priority2=ann2.priority();
				
				if(priority1>priority2){
					return 1;
				}else return 0;
			}
			
		});
		
		for(int i=0;i<3;i++){
			System.out.println(arraylist[i]);
		}
	}

}
