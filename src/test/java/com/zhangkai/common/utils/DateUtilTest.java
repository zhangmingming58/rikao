package com.zhangkai.common.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		Date date = DateUtil.getDateByInitMonth(new Date());
		System.out.println(date);
	}

	@Test
	public void testGetDateByFullMonth() {
		System.out.println(DateUtil.getDateByFullMonth(new Date()));
	}

}
