package com.zfsoft.file.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FreemarkerUtilTest {

	@Test
	public void testGetPdfFile(){
		try {Map<String, Object> o = new HashMap<String, Object>();
			File file = new File("ftl/demo.ftl");
			File pdf = FreemarkerUtil.getPdfFile(file, o , false);
			System.out.println(String.format("生成pdf文件：%s", pdf.getAbsolutePath()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetWordFile(){
		try {
			Map<String, Object> o = new HashMap<String, Object>();
			File file = new File("ftl/demo.ftl");
			File docx = FreemarkerUtil.getWordFile(file, o,false);
			System.out.println(String.format("生成docx文件：%s", docx.getAbsolutePath()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
