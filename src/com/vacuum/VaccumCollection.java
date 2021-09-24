package com.vacuum;

public class VaccumCollection implements VaccumList<Vaccum>{

	private Vaccum[] vc;
	
	public VaccumCollection(Vaccum[] vc) {
		this.vc = vc;	           

	}

	@Override
	public Iterator<Vaccum> iterator() {

		return new VaccumIterator(vc);
	}

}
