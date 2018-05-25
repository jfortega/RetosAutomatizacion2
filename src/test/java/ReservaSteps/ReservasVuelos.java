package ReservaSteps;

import java.io.FileOutputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class ReservasVuelos {
	
	public WebDriver webDriver;
	public WebElement fechaInicio;
	public WebElement fechaFin;
	public WebElement origen;
	public WebElement destino;
	public WebElement nroPasajeros;
	public WebElement banner;
	public WebElement Fecha;
	public WebElement Fec1;
	public WebElement Fec2;
	public WebElement Fec3;
	public WebElement Pas1;
	public WebElement buscar;
	String ciudad= "Medellin";
	String CiudadDestino= "Cartagena";
	
	
	
	@Given("^IngresoPaginaReservas$")
	public void ingresopaginareservas() throws Throwable {
	   
		try {

		System.setProperty("webdriver.chrome.driver",
					"D:/Users/jfortega/Documents/Visual Studio 2015/Clases Selenium - Appium/PracticaBancolombia - SELENIUM/packages/Selenium.Chrome.WebDriver.2.32/driver/chromedriver.exe");

		webDriver = new ChromeDriver();

		webDriver.navigate().to("https://www.despegar.com");
		Thread.sleep(5000);
			
		banner= webDriver.findElement(By.xpath("/html/body/div[16]/div/div[1]/span"));
		Thread.sleep(5000);
		banner.click();
			
					
		} catch (Exception e) {
			e.printStackTrace();
			//
		}
	}

	@Given("^UbicoReserva$")
	public void ubicoreserva() throws Throwable {
	try {
		WebElement vuelo = webDriver.findElement(By.xpath("//span[contains(@class,'nevo-header-navigation-menu-text')]  [contains(text(),'Vuelos')]"));
		vuelo.click();
			
		// Write code here that turns the phrase above into concrete actions
	} catch (Exception e) {
		e.printStackTrace();
		//
	}
	}

	@When("^IngresoOrigen$")
	public void ingresoorigen() throws Throwable {
	  try {
		origen =  webDriver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input"));
		origen.clear();
		origen.sendKeys(ciudad);
			//WebElement origen1= webDriver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[1]/div"));
		Thread.sleep(5000);
		origen.sendKeys(Keys.ENTER);
		
	  } catch (Exception e) {
			e.printStackTrace();
			//
		}  
	}

	@When("^IngresoDestino$")
	public void ingresodestino() throws Throwable {
	    try {
	    	destino = webDriver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input"));
			destino.clear();
	    	destino.click();
			destino.sendKeys(CiudadDestino);
			Thread.sleep(5000);
	    	destino.sendKeys(Keys.ENTER);	
			
	    } catch (Exception e) {
			e.printStackTrace();
			//
		}
	}

	@When("^IngresoFechaInicio$")
	public void ingresofechainicio() throws Throwable {
		   try {
			   

			Fecha = webDriver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input"));
			Fecha.click();	
			Fec1= webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]"));
			Fec1.click();
			Fec1.click();
			Fec1.click();
			Thread.sleep(1000);       
            Fec2= webDriver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[1]"));
            Fec2.click();
            Thread.sleep(2000);

			    	
		    } catch (Exception e) {
				e.printStackTrace();
				//
			}
	}

	@When("^IngresoFechaFin$")
	public void ingresofechafin() throws Throwable {
		   try {
			   
			   
			   	Fec3= webDriver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[30]"));
				Fec3.click();
				Thread.sleep(2000);
		    	
		    } catch (Exception e) {
				e.printStackTrace();
				//
			}
	}

	@When("^IngresoNroPasajeros$")
	public void ingresonropasajeros() throws Throwable {
		   try {
			   
			    nroPasajeros = webDriver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[6]/div[2]/div/input"));
				nroPasajeros.click();
				Pas1= webDriver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]"));
				Pas1.click();
				nroPasajeros.click();
				Thread.sleep(2000);
		    	
		    } catch (Exception e) {
				e.printStackTrace();
				//
			}
	}

	@When("^RealizoBusqueda$")
	public void realizobusqueda() throws Throwable {
		   try {
		    	
			    buscar= webDriver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[4]/div/a/em"));
				buscar.click();
				Thread.sleep(5000);
			   
		    } catch (Exception e) {
				e.printStackTrace();
				//
			}
	}

	@Then("^importoExcelPrecios$")
	public void importoexcelprecios() throws Throwable {
		   try {
		    	
			   String excelFileName = "C:\\Users\\jfortega\\eclipse-workspace\\pruebaResultado.xls";
	             String sheetName = "Resultado";
	             HSSFWorkbook wb = new HSSFWorkbook();
	             HSSFSheet sheet = wb.createSheet(sheetName);
	             Thread.sleep(5000);


			int j= 1;
			int nroMaximo= 7;
				for(j=1;j<=nroMaximo;j++) {
					
	                HSSFRow row = sheet.createRow(j);
	                HSSFCell cell = row.createCell(0);
	                
	                if (j == 1) {
	                    HSSFCellStyle style = wb.createCellStyle();
	                    HSSFFont font = wb.createFont();
	                    font.setColor(HSSFColor.GREEN.index);
	                    style.setFont(font);
	                    cell.setCellStyle(style);
	             }

						
				WebElement from1=webDriver.findElement(By.xpath("//*[@id=\"clusters\"]/span["+ j + "]/span/cluster/div/div/span/fare/span"));
		        // Get the list from the drop down list Selenium WebDriver
			        List<WebElement> list1=from1.findElements(By.xpath("//*[@id=\"clusters\"]/span[" + j +"]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em"));
					for(WebElement i:list1)
			        {
			            String Resultado= i.getText();
			            cell.setCellValue(Resultado);
			            //Reporter.log(i.getText());
			        } 
				
								
						Thread.sleep(500);
				}	
		
	            FileOutputStream fileOut = new FileOutputStream(excelFileName);
	            wb.write(fileOut);
	            fileOut.flush();
	            fileOut.close();

			   webDriver.close();
			   
			   
		    } catch (Exception e) {
				e.printStackTrace();
				//
			}
	}
	
}














	
	








