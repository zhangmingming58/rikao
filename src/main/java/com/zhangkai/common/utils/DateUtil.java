package com.zhangkai.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil
 * @Description: 日期工具类
 * @author: ZK
 * @date: 2019年8月22日 上午8:09:22
 */
public class DateUtil {
	/*
	 * 方法1：(10分) 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	 * 则返回的结果为2019-05-01 00:00:00
	 */
	public static Date getDateByInitMonth(Date src) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, src.getYear());
		cal.set(Calendar.MONTH, src.getMonth());
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}

	/*
	 * 方法2：(10分) 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	 * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	 * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	 */
	public static Date getDateByFullMonth(Date src) {
Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, src.getYear());
		cal.set(Calendar.MONTH, src.getMonth());
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.add(Calendar.SECOND, -1);
		return cal.getTime();
	}
}
