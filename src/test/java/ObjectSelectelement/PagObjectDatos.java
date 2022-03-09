package ObjectSelectelement;

import java.io.File;
import java.util.Properties;

import MapSelect.MapObjectDatos;
import UtilidadesExcel.ReadExcel;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagObjectDatos  extends MapObjectDatos 
{
	
	public PagObjectDatos(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver =  driver;
	}
	
	
	public void CallResidency (ReadExcel leer, Properties propiedades, String numHoja, File rutaCarpeta) throws Exception 
	{
		
		
		
		click(btnPerfil,rutaCarpeta);
		
		click(btnDatos,rutaCarpeta);
		
		click(ActualizarDatos11,rutaCarpeta);
		
		click(ActualizaDatos,rutaCarpeta);
		
		click(CambiarDireccion,rutaCarpeta);
		
		tiempoEspera(7000);
		
		scrollVertical1(rutaCarpeta, 361, 560, 510, 5);
		tiempoEspera(1000);
		
		
		click(SeleccionDeparta,rutaCarpeta);
		
		tiempoEspera(2000);
		
		click(City,rutaCarpeta);
		
		tiempoEspera(2000);
		
		click(SeleccionCiudad,rutaCarpeta);
		tiempoEspera(2000);
		
		
		click(City2,rutaCarpeta);
		tiempoEspera(2000);
		
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,1),Barrio,rutaCarpeta);
		tiempoEspera(2000);
		
		
		click(PrimerTipo,rutaCarpeta);
		tiempoEspera(2000);
		
		click(Tipo,rutaCarpeta);
		tiempoEspera(2000);
		

		
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,2),NumeroPrincipal,rutaCarpeta);
		tiempoEspera(3000);
		
		
		
		
		click(Sufijo,rutaCarpeta);
		tiempoEspera(2000);
		
		
		click(TipoDireccion,rutaCarpeta);
		tiempoEspera(2000);
		
		scrollVertical1(rutaCarpeta, 200, 720, 677, 18);
		
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,3),NumeroSecundario,rutaCarpeta);
		tiempoEspera(2000);
		
		click(MenuSufijoSecundario,rutaCarpeta);
		tiempoEspera(2000);
		
		click(sufijo2,rutaCarpeta);
		tiempoEspera(2000);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,4),compu,rutaCarpeta);
		tiempoEspera(2000);
		
		click (complemento,rutaCarpeta);
		tiempoEspera(2000);
		
		click(complemento2,rutaCarpeta);
		tiempoEspera(2000);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,5),numero,rutaCarpeta);
		tiempoEspera(2000);
		
		click(validar,rutaCarpeta);
		tiempoEspera(2000);
		
		click(cerrar,rutaCarpeta);
		tiempoEspera(2000);
		
		click(GoBack,rutaCarpeta);
		tiempoEspera(2000);
		
		click(GoBack,rutaCarpeta);
		tiempoEspera(2000);
		
		click(GoBack,rutaCarpeta);
		tiempoEspera(2000);
		
		click(GoBack,rutaCarpeta);
		tiempoEspera(2000);
		
		click(GoBack,rutaCarpeta);
		tiempoEspera(2000);
		
		tocarPantalla(477,73);
		
		scrollVertical1(rutaCarpeta,444,612,501, 2);
		click(GreatFinale,rutaCarpeta);
		
		click(Close,rutaCarpeta);
		//numero
		//compu
		
		//NumeroSecundario
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
