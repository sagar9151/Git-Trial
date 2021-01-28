package utilities;

import java.util.ArrayList;

public class TestUtil {
	static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		 try 
		 {
			reader = new Xls_Reader("D:\\Eclipse\\BankingFirstApp\\src\\test\\resources\\loginData.xlsx");
		 } catch (Exception e) 
		 {
			e.printStackTrace();
		 }
		 for(int rowNum=2;rowNum<=reader.getRowCount("sheet1");rowNum++)
		 {
			 String username = reader.getCellData("sheet1", "Username", rowNum);
			 String password = reader.getCellData("sheet1", "Password", rowNum);
			 String pin = reader.getCellData("sheet1", "Pin", rowNum);
			 
			 Object ob[] = {username,password,pin};
			 
			 myData.add(ob);
		 }
		 return myData;
	}

}
