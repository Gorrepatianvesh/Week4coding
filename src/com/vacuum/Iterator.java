package com.vacuum;

public interface Iterator<I> {
	 void reset();  
	 
	    I next();   
	 
	    I currentItem();    
	 
	    boolean hasNext();  
}
