package com.KoreaIT.java.BAM;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	// 현재 날짜와 시간 리턴
	public static String getNowDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date now = new Date();

		return format.format(now);
	}

}