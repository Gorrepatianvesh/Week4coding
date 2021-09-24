package com.vacuum;

public class MainClass {
	 public static void main(String[] args) 
	    {
	        Vaccum[] vc = new Vaccum[3];
	        vc[0] = new Vaccum("Water Cleaner Vaccum");
	        vc[1] = new Vaccum("Dirt Cleaner Vaccum");
	        vc[2] = new Vaccum("Carpet Cleaner Vaccum");
        
	        VaccumList<Vaccum> list = new VaccumCollection(vc);
	         
	        Iterator<Vaccum> iterator = list.iterator();
	         
	        while(iterator.hasNext()) {
	        	Vaccum vcc = iterator.next();
	            System.out.println(vcc.getName());
	        }
	    }
}
