package ObjectSelectelement;

import java.io.File;
import java.util.Properties;

import MapSelect.MapObjectTarjeta;
import UtilidadesExcel.ReadExcel;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagObjectTarjeta extends MapObjectTarjeta 

{
	
	public PagObjectTarjeta(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver =  driver;
	}
	
	public void Tarjeta (ReadExcel leer, Properties propiedades, String numHoja, File rutaCarpeta) throws Exception
	{
		
		
		tiempoEspera(6000);
		click(btnLogin,rutaCarpeta);
		
		click(btnIngreso,rutaCarpeta); 
		tiempoEspera(1000);
		
	
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,3,0),btnCorreo,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,3,1),btnPassword,rutaCarpeta);
		
		
		click(btnAccepts1,rutaCarpeta);
		
		
		
		tocarPantalla(399,711);
		tocarPantalla(343,802);
		
		
		click(btnAccepts,rutaCarpeta);
		
	
		click(btnPago,rutaCarpeta);
		tiempoEspera(2000);
		
		scrollVertical1(rutaCarpeta,492, 771, 660, 2);

		
		click(btnPagaAqui,rutaCarpeta);
		tiempoEspera(2000);
		
				
		click(btnPagar,rutaCarpeta);
		tiempoEspera(2000);
		
		
		
		
		click(btnMedioDePago,rutaCarpeta);
		tiempoEspera(2000);
		
		
		tocarPantalla(200,588);
		tiempoEspera(2000);
		//No sirve para nada el xpath apesar de que en el inspector dice que si funciona
		//click(btnTarjetaDeCredito,rutaCarpeta);
		
		
		click(btnContinuar,rutaCarpeta);
		tiempoEspera(2000);
		//200,588
		
		scrollVertical1(rutaCarpeta,414,519,402, 10);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,1),NumberOfPlastic,rutaCarpeta);
		tiempoEspera(2000);
		
		click(btnMesVencido,rutaCarpeta);
		tiempoEspera(2000);
		
		click(Mes4,rutaCarpeta);
		tiempoEspera(2000);
		//
		
		click(YearSelected,rutaCarpeta);
		tiempoEspera(2000);
		
		
		click(OneYear,rutaCarpeta);
		tiempoEspera(2000);
		
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,2),CodigoSeguridad,rutaCarpeta);
		tiempoEspera(2000);
		
		scrollVertical1(rutaCarpeta,444,612,590, 1);
		//CodigoSeguridad
		click(MenuCuotas,rutaCarpeta);
		tiempoEspera(2000);
		
		click(SeleccionCuotas,rutaCarpeta);
		tiempoEspera(2000);
		
		scrollVertical1(rutaCarpeta,444,612,501, 8);
		tiempoEspera(2000);
		
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,3),NombreYapellidoTarjeta,rutaCarpeta);
		tiempoEspera(2000);
		
		click(TipoDocumento,rutaCarpeta);
		tiempoEspera(2000);
		
		click(DocumentoSeleccionado,rutaCarpeta);
		tiempoEspera(2000);
		
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,4),NumberDocument,rutaCarpeta);
		tiempoEspera(2000);
		
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,5),Telefono,rutaCarpeta);
		tiempoEspera(2000);
		
		scrollVertical1(rutaCarpeta,444,612,501, 1);
		tiempoEspera(2000);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,6),Correo,rutaCarpeta);
		tiempoEspera(2000);
		
		
		
		scrollVertical1(rutaCarpeta,444,612,501, 3);
		tiempoEspera(2000);
		
		
		click(btnCancelarTarjeta,rutaCarpeta);
		tiempoEspera(2000);
		
		
		click(GoBack,rutaCarpeta);
		tiempoEspera(2000);
		
	
		
		
		//Correo
		
		//Telefono
		
		//NumberDocument
		
		
		//NombreYapellidoTarjeta
	}
	

}
