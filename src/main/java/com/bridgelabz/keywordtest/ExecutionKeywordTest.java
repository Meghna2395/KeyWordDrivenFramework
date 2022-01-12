package com.bridgelabz.keywordtest;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import com.bridgelabz.excelutility.ReadExcelFile;
import com.bridgelabz.keywordmain.ActionKeyword;

public class ExecutionKeywordTest {
	public static void main(String[] args) throws IOException, Exception, IllegalArgumentException, InvocationTargetException 
	{ 
	ReadExcelFile rs = new ReadExcelFile(); 

	ActionKeyword k = new ActionKeyword(); 
	k.openBrowser(); 
	k.navigate(); 
	k.fullName();
	k.enterMobileNumber();
	k.enterEmail(); 
	//k.clickContinue();
	k.enterPassword(); 
	k.clickContinue();
	//k.closeBrowser();
	System.out.println("Test executed successfully"); 
	}

}
