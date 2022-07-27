package com.KoreaIT.java.BAM.dao;

public abstract class Dao {
	protected int lastId;
	
	Dao() {
		lastId = 0;
	}
	
	public int getLastId() {
		return lastId;
	}
	
	public int getNewId() {
		return lastId + 1;
	}
	
}
