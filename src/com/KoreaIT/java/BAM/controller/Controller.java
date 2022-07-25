package com.KoreaIT.java.BAM.controller;

import com.KoreaIT.java.BAM.dto.Member;

public abstract class Controller {

	public static Member loginedMember;
	
	public abstract void doAction(String cmd, String actionMethodName);

	public abstract void makeTestData();
	
	public static boolean isLogined() {
		return loginedMember != null;
	}
	
}
