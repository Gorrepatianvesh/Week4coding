package com.vacuum;

public class VaccumIterator implements Iterator<Vaccum> {

	private Vaccum[] vaccum;
    private int position;
	public VaccumIterator(Vaccum[] vaccum) {
		super();
		this.vaccum = vaccum;
		position=0;
	}
	
	
	@Override
	public void reset() {
		position =0;		
	}

	@Override
	public Vaccum next() {
		return vaccum[position++];
	}

	@Override
	public Vaccum currentItem() {
		return vaccum[position];
	}

	@Override
	public boolean hasNext() {
		if(position >= vaccum.length )
		{
			return true;
		}
		return false;
	}

	
}
