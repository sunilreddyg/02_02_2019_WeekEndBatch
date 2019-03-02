package datadriven_framework;

public class Run_Excel 
{

	public static void main(String[] args) 
	{
		
		Excel.Get_Excel_connection("InputData.xlsx", "Sheet3");
		//Iterate for number of rows
		for (int i = 5; i <= Excel.sht.getLastRowNum(); i++) 
		{
			//Get CellData
			String username=Excel.getCellData(i, 0);
			System.out.println(username);
			
			//write celldata
			Excel.Write_cellData(i, 2, "Testpass");
			
		}
		Excel.createExcel_output("OPFrameWork.xlsx");
		
		
	}

}
