package DemoQNav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import ObjectSelectelement.CerrarSesion;
import ObjectSelectelement.PagObjectDatos;
import ObjectSelectelement.PagObjectTarjeta;
import ObjectSelectelement.PageObjectSelectElement;

import UtilidadesExcel.ReadExcel;
import UtilidadesExcel.WriteExcel;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class ExecDemoQtest 
{
	
	private AppiumDriver<MobileElement> driver;
	Properties propiedades;
	ReadExcel leer;
	WriteExcel escribir;
	PageObjectSelectElement selecObject;
	PagObjectDatos pageDatos;
	PagObjectTarjeta tarjeta;
	
	CerrarSesion cerrar;
	
	String  url = null;

	
	
	
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws InterruptedException, IOException 
	{
		

		driver= DemoQBase.appiumDriverConnection();
		
		
		
		//ACCESOS PORTABLES DEL NAVEGADOR
		
		// INSTANCIAR LA CLASE PROPIEDADES DE JAVA UNIT
		propiedades = new Properties();
		//claseBase= new ClaseBase(driver);
		//ACCESOS PORTABLES DEL NAVEGADOR(VAN EN CADA CASO DE PRUEBA)
	    //driver = claseBase.chromeDriverConnection();
		
	
		//INSTANCIAR CLASES DE EXCEL 
		leer = new ReadExcel();
		escribir = new WriteExcel();

		// CREAR LA VARIABLE TIPO INPUTSTRING
		InputStream entrada = null;

		// VALIDAR SI GENERA ERROR AL NO ENCONTRAR EL ARCHIVO
		try {
			entrada = new FileInputStream("./Properties/datos.propiedades");
			propiedades.load(entrada);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
			// TODO: handle exception
		}
		
		selecObject = new PageObjectSelectElement(driver);
		pageDatos = new PagObjectDatos(driver);
		tarjeta = new PagObjectTarjeta(driver);
		
		cerrar = new CerrarSesion(driver);
		
		// INSTANCIAR LA CLASE PAGOBJET
		// = new PagsObjeInicioPrueba(driver);

		// ASIGNAMOS LAS OPCIONES Y LA CONFIGURACION DEL NAVEGADOR A LA VARIABLE DRIVER

		//driver = paginas.chromeDriverConnection();

		// ACCEDER AL METODO DE ABRIR LA PAGINA

		
	}
	
	@Test
	
	public void Pagos() throws Exception
	{
		
		if(leer.getCellValue(propiedades.getProperty("PathExcel"),"Hoja5",0,0).equals("Tarjeta"));
		
		
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		File rutaCarpeta = selecObject.crearCarpeta(propiedades,nomTest);
		
		
		tarjeta.Tarjeta(leer, propiedades, "Hoja5", rutaCarpeta);
		
		cerrar.CerrarSesion(rutaCarpeta);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//HABILITAR
	//METDODO DE ACCESO A MERCURY VIAJES
	@Test
	
	public void busquedaDemoq() throws Exception
	{
		if(leer.getCellValue(propiedades.getProperty("PathExcel"),"Hoja1",0,0).equals("No")); 
		 
		
		
		
		
		
			
	    //OBTENER EL NOMBRE DEL METODO A EJECUTAR
	    String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			
	    //CREAR CARPETA PARA EL ALMACENAMIENTO DE IMAGENES
	    File rutaCarpeta = selecObject.crearCarpeta(propiedades,nomTest);
				
					
		//ACCESO AL DRIVER DEL NAVEGADOR
		//driver = demobase.chromeDriverConnection();
		
				
		//INSTANCIACION DE LA VARIABLE URL A UN DOCUMENTO EXCEL 
	    // = leer.getCellValue(propiedades.getProperty("PathExcel"),"Hoja2",0,1);
	    
	    
	    selecObject.CallPage(leer, propiedades, "Hoja2", rutaCarpeta);
	    
	    pageDatos.CallResidency(leer, propiedades, "Hoja1", rutaCarpeta);
	    
	    cerrar.CerrarSesion(rutaCarpeta);
	    
	    
	    //get(leer.getCellValue(propiedades.getProperty("PathExcel"),"Hoja1",0,1));
	    
		//ENTRADAS AL METODO urlACCESO
	   // selecObject.urlAcceso(leer.getCellValue(propiedades.getProperty("PathExcel"),"Hoja1",0,1));
		
		//selecObject.scrollVertical(rutaCarpeta);
		
		//selecObject.ProductofMinus(rutaCarpeta, propiedades, "Hoja4", leer);
		
		//selecObject.ProductOfElements(rutaCarpeta, propiedades, "Hoja4", leer);
		
		//selecObject.ProductofDivision(rutaCarpeta, propiedades, "Hoja4", leer);
	    
	    
		/*
		selecObject.SumElements(leer, propiedades, "Hoja4", nomTest, rutaCarpeta);
		
		selecObject.DivisionElement(leer, propiedades, "Hoja4", nomTest, rutaCarpeta);
		
		selecObject.ProductElements(leer, propiedades, "Hoja4", nomTest, rutaCarpeta);
				
		selecObject.MinusElement(leer, propiedades, "Hoja4", nomTest, rutaCarpeta);*/
	    
	    
		
		//selecObject.seleccionDemoQ(rutaCarpeta, propiedades, "Hoja1", leer);
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
		
		
		
	
		
	


	@After
	public void cerrar() {
		//driver.quit();
	}
	

	

}
