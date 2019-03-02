package keyword_driven_Framework;


import org.junit.Test;
import org.openqa.selenium.By;


public class Driver extends Repository
{
  @Test
  public void user_registration() 
  {
	  
	  launch_browser("chrome");
	  loadApp("http://facebook.com");
	  setTimeout(30);
	  
	  Excel.excel_connection("KWD.xlsx", "Sheet1");
	  //Iterate for number of rows
	  for (int i = 1; i <= Excel.sht.getLastRowNum(); i++) 
	  {
		
		  String Tcname=Excel.getcellData(i, 0);
		  String Lname=Excel.getcellData(i, 1);
		  String Lvalue=Excel.getcellData(i, 2);
		  String Keword=Excel.getcellData(i, 3);
		  String Input=Excel.getcellData(i, 4);
		  
		  
		  //Convert to locator class
		  By Element_locator=Locator.convert_locator(Lname, Lvalue);
		  
		  
		  //Switch to keyword
		  switch (Keword) {
		  
		  case "enter_text":
			Enter_textTo_eb(Element_locator, Input);
			  break;
			
		  case "select_dropdown":
				Select_dropdown(Element_locator, Input);
				break;
				
		  case "click_element":
				Click_element(Element_locator);
				break;
				
		  case "switchto_window":
				switchto_window(Input);
				break;
				
		  case "switchto-alert":
				Close_Alert();
				break;
				
		  case "switchto_frame":
				
				break;
				
		  case "mouse_hover":
				MouseHover(Element_locator);
				break;
				
		  case "wait_visible":
				wait_for_Element_visible(Element_locator);
				break;

		default:
			break;
		}
		  
	  }
	  
	  
  }

}
