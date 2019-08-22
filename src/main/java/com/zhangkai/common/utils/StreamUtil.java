package com.zhangkai.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * 
 * @ClassName: StreamUtil
 * @Description: 流处理工具类
 * @author: ZK
 * @date: 2019年8月22日 上午8:22:38
 */
public class StreamUtil {
	/*
	 * 方法1：批量关闭流，参数能传入无限个。(10分)
	 * 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	 */
	public static void closeAll(Closeable... closeables) {
		// 判断传入的流是否为空
		if (closeables != null && closeables.length > 0) {
			// 遍历传入的流
			for (Closeable closeable : closeables) {
				try {
					// 批量关闭
					closeable.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	 */
	public static String readTextFile(InputStream src) throws IOException {
		// 创建输入流
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] b = new byte[1024];
		int a = 0;
		// 循环读
		while ((a = src.read(b)) != -1) {
			// 输出
			out.write(b);
		}
		// 关流
		closeAll(out, src);
		// 返回UTF-8
		String string = out.toString("UTF-8");
		return string;
	}

	/*
	 * 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException {
		// 调用上面第2个方法
		return readTextFile(new FileInputStream(txtFile));
	}
}
