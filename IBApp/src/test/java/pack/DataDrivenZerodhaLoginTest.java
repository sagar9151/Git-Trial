package pack;

import utilities.Xls_Reader;

public class DataDrivenZerodhaLoginTest {
	
	public static void main(String[] args) {
		
		 Xls_Reader reader = new Xls_Reader("D:\\Eclipse\\BankingFirstApp\\src\\test\\resources\\loginData.xlsx");
		 
		 int rowCount = reader.getRowCount("sheet1");
		
		 for(int rowNum=2;rowNum<=rowCount;rowNum++)
		 {
			 System.out.println("===========");
			 String username = reader.getCellData("sheet1", "Username", rowNum);
			 System.out.println(username);
			 String password = reader.getCellData("sheet1", "Password", rowNum);
			 System.out.println(password);
			 String pin = reader.getCellData("sheet1", "Pin", rowNum);
			 System.out.println(pin);
		 } 
	}
}
