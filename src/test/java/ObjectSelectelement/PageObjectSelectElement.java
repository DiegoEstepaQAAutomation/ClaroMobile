package ObjectSelectelement;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import MapSelect.Mapselectelement;
import UtilidadesExcel.ReadExcel;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PageObjectSelectElement extends Mapselectelement
{
	
	public PageObjectSelectElement(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver =  driver;
	}
	
	
	
	
	public void seleccionDemoQ( File rutaCarpeta,Properties propiedades,String numHoja,ReadExcel leer) throws Exception
	{
		
		
		scrollVertical(rutaCarpeta);
		tiempoEspera(5000);
		
	}
	
	
	//USAR XPATH PRIMERO DE RESOURCE ID  Y LUEGO DE Text
	public void CallPage (ReadExcel leer, Properties propiedades, String numHoja, File rutaCarpeta) throws Exception 
	{
		
		
		tiempoEspera(6000);
		click(btnLogin,rutaCarpeta);
		
		click(btnIngreso,rutaCarpeta); 
		tiempoEspera(1000);
		
	
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,3,0),btnCorreo,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,3,1),btnPassword,rutaCarpeta);
		
		
		//colocarlo como falso al comienzo
		//colocarlo con un touch
		
		/*
		boolean elementoPresente
		try {
			
			driver.findElement(By.xpath(""))
			
			elementoPresente = true;
			
		} catch (NoSuchElementException e) {
			
			elementoPresente = false;
		}
		*/
		
		click(btnAccepts1,rutaCarpeta);
		
		
		
		tocarPantalla(399,711);
		tocarPantalla(343,802);
		
		
		click(btnAccepts,rutaCarpeta);
		
			
	
		
			
		
		
		
		
		//click(AcceptDevice,rutaCarpeta);
		
		//btnPassword
		
		
	}
	
	
	
	/*
	public void SumElements(ReadExcel leer, Properties propiedades, String numHoja, String nomTest, File rutaCarpeta) throws Exception 
	{
		
		

		String numero1 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 1,0);
		String xpathN1 = elemento + numero1 + "']";
		driver.findElement(By.xpath(xpathN1)).click();
		
		
		
		String numero11 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 2,0);
		String xpathN11 = elemento + numero11 + "']";
		driver.findElement(By.xpath(xpathN11)).click();
		
		
		
		String numero111 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 1,1);
		String xpathN111 = elemento + numero111 + "']";
		driver.findElement(By.xpath(xpathN111)).click();
		
		
		click(Equals,rutaCarpeta);
		
		click(EraseObject,rutaCarpeta);
		
			
		
	}
	
	

	public void ProductElements(ReadExcel leer, Properties propiedades, String numHoja, String nomTest, File rutaCarpeta) throws Exception 
	{
		
		

		String numero1 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 1,2);
		String xpathN1 = elemento + numero1 + "']";
		driver.findElement(By.xpath(xpathN1)).click();
		
		
		
		String numero11 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 2,2);
		String xpathN11 = elemento + numero11 + "']";
		driver.findElement(By.xpath(xpathN11)).click();
		
		
		
		String numero111 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 1,3);
		String xpathN111 = elemento + numero111 + "']";
		driver.findElement(By.xpath(xpathN111)).click();
		
		
		click(Equals,rutaCarpeta);
		
		click(EraseObject,rutaCarpeta);
		
			
		
	}

	
	
	
	
	
	
	
	
	
	public void MinusElement(ReadExcel leer, Properties propiedades, String numHoja, String nomTest, File rutaCarpeta) throws Exception 
	{
		
		String numero2 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 1,4);
		String xpathN2 = elemento + numero2 + "']";
		driver.findElement(By.xpath(xpathN2)).click();
		
		
		String numero3 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 2,4);
		String xpathN11 = elemento + numero3 + "']";
		driver.findElement(By.xpath(xpathN11)).click();
		
		String numero4 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 1,5);
		String xpathN3 = elemento + numero4 + "']";
		driver.findElement(By.xpath(xpathN3)).click();
		
        click(Equals,rutaCarpeta);
		
		click(EraseObject,rutaCarpeta);
		
		
		
		
	}
	
	public void DivisionElement(ReadExcel leer, Properties propiedades, String numHoja, String nomTest, File rutaCarpeta) throws Exception 
	{
		
		String numero1 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 1,5);
		String xpathN1 = elemento + numero1 + "']";
		driver.findElement(By.xpath(xpathN1)).click();
		
		String numero11 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 2,6);
		String xpathN11 = elemento + numero11 + "']";
		driver.findElement(By.xpath(xpathN11)).click();
		
		String numero111 = leer.getCellValue(propiedades.getProperty("PathExcel"), numHoja, 1,6);
		String xpathN111 = elemento + numero111 + "']";
		driver.findElement(By.xpath(xpathN111)).click();
		
        click(Equals,rutaCarpeta);
		
		click(EraseObject,rutaCarpeta);
		
		
		
		
		
	}
	
	*/
	
	
	
}
