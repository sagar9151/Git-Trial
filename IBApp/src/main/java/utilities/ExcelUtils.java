package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath,String sheetName)
	{
		try 
		{
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	public static int getRowCount()
	{
		int rowCount=0;
		try 
		{
			rowCount = sheet.getPhysicalNumberOfRows();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return rowCount;
	}
	public static int getcolCount()
	{
		int colCount=0;
		try 
		{
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return colCount;
	}
	public static String getcellDataString(int rowNum, int colNum)
	{
		String cellData=null;
		try 
		{
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return cellData;
	}
	public static int getcellDataNumber(int rowNum, int colNum)
	{
		int cellData=0;
		try 
		{
			cellData = (int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return cellData;
	}

}
