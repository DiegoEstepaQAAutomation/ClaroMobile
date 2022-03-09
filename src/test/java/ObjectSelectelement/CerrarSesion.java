package ObjectSelectelement;

import java.io.File;
import java.util.Properties;

import MapSelect.mapobjectCerrarSesion;
import UtilidadesExcel.ReadExcel;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CerrarSesion extends mapobjectCerrarSesion
{
	
	
	public CerrarSesion(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver =  driver;
	}
	
	
	public void CerrarSesion (File rutaCarpeta) throws Exception
	{
		
		
		click(btnPerfilEnd,rutaCarpeta);
		
		scrollVertical1(rutaCarpeta,444,612,501, 2);
		click(GreatFinale,rutaCarpeta);
		
		click(Close,rutaCarpeta);
		
	}
	

}
