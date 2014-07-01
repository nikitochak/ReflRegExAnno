package com.sirma.itt.javacourse.annotations;

import java.lang.annotation.*;



/**
 * Annotation for keeping the priority. 
 * @author Nikolay Ch
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Layout {
	 
	public int  priority();
	
}
