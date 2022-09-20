package utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@DataProvider(name = "numberedPassword")
	 public Object[][] numberedPassword() throws Exception{
		Object[][] obj = this.testDataSupplier("//data//testdata//numberedPassword.xlsx");
		return obj;
	}
	
	 public Object[][] testDataSupplier(String filePath) throws Exception{
	  
	  //read excel file using file input stream, using Apache POI
	  FileInputStream fis = new FileInputStream(new File (filePath));
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet = wb.getSheet("Sheet1");
	  
	  //calculate total number of rows and columns so that we can iterate over it.
	  int totalNumberOfRows = sheet.getLastRowNum()+1;
	  int totalNumberOfCols = sheet.getRow(0).getLastCellNum();
	  
	  //create an object array. which will store the test data from excel file
	  Object[][] testdata1 = new Object[totalNumberOfRows][totalNumberOfCols];

	  
	  for (int i = 0; i <totalNumberOfRows; i++ ){
		   for (int j = 0; j < totalNumberOfCols; j++){
			   testdata1[i][j] =  sheet.getRow(i).getCell(j).toString();   
		   }
	  }
	  return testdata1;
	 }

}
