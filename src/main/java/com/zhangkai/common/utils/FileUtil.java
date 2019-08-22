package com.zhangkai.common.utils;

/**
 * 
 * @ClassName: FileUtil
 * @Description: File工具类
 * @author: ZK
 * @date: 2019年8月22日 上午8:21:09
 */
public class FileUtil {
	/*
	 * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	 */
	public static String getExtendName(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));
	}
}
