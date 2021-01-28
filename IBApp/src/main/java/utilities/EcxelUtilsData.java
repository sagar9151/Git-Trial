package utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EcxelUtilsData {
	
	@Test(dataProvider="loginData")
	public void test1(String username,String password,String pin)
	{
		System.out.println(username+" | "+password);
	}
	@DataProvider(name="loginData")
	public Object[][] getData()
	{
		String excelPath = "D:\\Eclipse\\BankingFirstApp\\src\\test\\resources\\loginData.xlsx";
		Object data[][] = testData(excelPath,"sheet1");
		return data;
	}
	public Object[][] testData(String excelPath, String sheetName)
	{
		ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getcolCount();
		
		Object data [][] = new Object[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellData = excel.getcellDataString(i, j);
				data[i-1][j] = cellData;
			}
		}
		return data;
	}

}
