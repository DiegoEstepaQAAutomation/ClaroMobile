package DemoQNav;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilidadesExcel.ReadExcel;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DemoQBase

{

	protected AppiumDriver<MobileElement> driver;

	public DemoQBase(WebDriver driver) {
		super();

	}

	@SuppressWarnings("rawtypes")
	public static AppiumDriver appiumDriverConnection() 
	{
		AppiumDriver _driver = null;
		Properties propiedades;
		InputStream entrada= null;
		propiedades = new Properties();
		try 
		{
			
			
			entrada =new FileInputStream("./Properties/datos.propiedades");
			propiedades.load(entrada);
			
			
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName",propiedades.getProperty("platformName"));
			caps.setCapability("deviceName",propiedades.getProperty("deviceName"));
			caps.setCapability("platformVersion",propiedades.getProperty("platformVersion"));
			caps.setCapability("appPackage", propiedades.getProperty("appPackage"));
			caps.setCapability("appActivity",propiedades.getProperty("appActivity"));
			caps.setCapability("noReset" ,propiedades.getProperty("noReset"));
			caps.setCapability("autoGrantPermissior",propiedades.getProperty("autoGrantPermissior"));
			
			
			
			//caps.setCapability
		
		
		
			try 
			{
				printConsola("Loading please wait clod");
				_driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
			}
			
			catch(MalformedURLException e) 
			{
				printConsola(e.getMessage());
				
			}
			
			return _driver;
			
		   }
			catch(Exception e) 
			{
				printConsola(e.getMessage());		
			}
			
			return _driver;
			
		   
		
		
	}

	
	
	public boolean elementoPresente(By Locator) 
	{
		boolean estado = driver.findElement(Locator).isDisplayed();
		return estado;
	}

	private static void printConsola(String cadena) {
		System.out.println(cadena);

		// TODO Auto-generated method stub

	}

	
	
	public void scrollVertical(File rutaCarpeta) throws Exception 
	{                                           
		@SuppressWarnings("rawtypes")
		 TouchAction touch = new TouchAction(driver);
		 touch.press(PointOption.point(350,930))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		 .moveTo(PointOption.point(350,430))
		 .release().perform();
		 captureScreen(rutaCarpeta);	
	
	
	
	
	
	}
	
	@SuppressWarnings("deprecation")
	public void Tab() 
	{

		driver.getKeyboard().sendKeys(Keys.TAB);
		
	}
	
	
	//METODO SCROLLVERTICAL//CREA LAS VARIABLES DE LAS COORDENADAS DEL INSPECTOR
	public void scrollVertical1(File rutaCarpeta, int xini,int yini, int yfinal, int iteraciones) throws Exception
	{

	for (int i = 1 ;i<=iteraciones;i++)
	{
	@SuppressWarnings("rawtypes")
	TouchAction touch = new TouchAction(driver);
	touch.press(PointOption.point(xini,yini))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	.moveTo(PointOption.point(xini,yfinal))
	.release().perform();
	captureScreen(rutaCarpeta);
	}
	}
	
	
		 
	
	public void tocarPantalla(int col,int fil)
	{
	@SuppressWarnings("rawtypes")
	TouchAction touch = new TouchAction(driver);
	touch.press(PointOption.point(col,fil)).release().perform();

	}
	
	public void scrollHorizontal(File rutaFile, int X, int Y, int XFin, int YFin, int iteraciones) throws Exception 
	{



		for (int i = 1; i <= iteraciones; i++) {
		@SuppressWarnings("rawtypes")
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(X, Y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.moveTo(PointOption.point(XFin, YFin)).release().perform();
		captureScreen(rutaFile);
		}
		}
	
	
	

	public String fechaHora() {
		// TOMAMOS LA FECHA DEL SISTEMA
		LocalDateTime fechaSistema = LocalDateTime.now();

		// DEFINIR FORMATO FECHA
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyymmdd-HHmmss");

		// DAR FORMATO A LA FECHA DEL SISTEMA
		String formatFecha = fecha.format(fechaSistema);
		return formatFecha;
	}

	public void esconderteclado() 
	{
		driver.hideKeyboard();
	} 
		
	
	public String HoraSistema() {
		// TOMAMOS LA FECHA DEL SISTEMA
		LocalTime horaSistema = LocalTime.now();

		// DEFINIR FORMATO FECHA
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("HHmmss");

		// DAR FORMATO A LA FECHA DEL SISTEMA
		String hora = fecha.format(horaSistema);
		return hora;
	}

	public void captureScreen(File rutaCarpeta) throws Exception {
		String hora = HoraSistema();
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(rutaCarpeta + "\\" + hora + ".png"));

	}

	/*
	 * public void captureScreen(File rutaCarpeta) throws Exception { //HORA DEL
	 * SISTEMA String hora = HoraSistema(); //HERRAMIENTAS DE TAMAÑO DE
	 * IMAGEN(HERRAMIENTA DEL SISTEMA) Dimension screenSize =
	 * Toolkit.getDefaultToolkit().getScreenSize(); Rectangle screenRectangle = new
	 * Rectangle(screenSize); Robot robot = new Robot(); BufferedImage image =
	 * robot.createScreenCapture(screenRectangle); ImageIO.write(image, "png",new
	 * File(rutaCarpeta+"/"+hora+"jpg"));
	 * 
	 * 
	 * }
	 */

	public File crearCarpeta(Properties propiedades, String nomTest) {
		// FECHA DEL SISTEMA
		String fecha = fechaHora();

		// NOMBRE CARPETA
		String nomCarpeta = nomTest + "-" + fecha;

		// RUTA DE ALOJAMIENTO DE SALIDA Y NOMBRE DE TEST A EJECUTAR
		File directorio = new File("./output/" + nomCarpeta);

		// CREAMOS LA CARPETA
		directorio.mkdir();
		return directorio;

	}
	
	@SuppressWarnings("deprecation")
	public void recargarPag() {
	driver.getKeyboard().sendKeys(Keys.F5);
	}

	// METODO CLICK
	public void click(By locator, File rutaCarpeta) throws Exception {
		driver.findElement(locator).click();
		tiempoEspera(5000);
		captureScreen(rutaCarpeta);

	}

	// METODO BORRAR
	public void borrar(By locator, File rutaCarpeta) throws Exception {
		driver.findElement(locator).clear();
		captureScreen(rutaCarpeta);
	}

	// METODO ENVIAR TEXTO

	public void sendkey(String inputText, By locator, File rutaCarpeta) throws Exception {
		driver.findElement(locator).sendKeys(inputText);
		captureScreen(rutaCarpeta);

	}
	
	@SuppressWarnings("deprecation")
	public void sendkeyandroid(ReadExcel leer,Properties propiedades,String numHoja,int fil,int col) throws Exception
	{
		driver.getKeyboard().sendKeys(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,fil,col));
	} 

	// METODO UNIVERSAL PARA TODOS LOS CASOS
	public void urlAcceso(String url) {
		driver.get(url);
		// busquedaInicial();
	}

	// metodo intro
	public void intro(By locator, File rutaCarpeta) throws Exception {
		driver.findElement(locator).sendKeys(Keys.ENTER);
		captureScreen(rutaCarpeta);
	}

	// Metodo control de campo
	public void controla(By locator, File rutaCarpeta) throws Exception {
		driver.findElement(locator).sendKeys(Keys.CONTROL, "a");
		captureScreen(rutaCarpeta);
	}
	// Tecla borrar

	public void teclaborrar(By locator, File rutaCarpeta) throws Exception {
		driver.findElement(locator).sendKeys(Keys.BACK_SPACE);
		captureScreen(rutaCarpeta);
	}

	// METODO ENTER SUBMIN

	public void submit(By locator, File rutaCarpeta) throws Exception {
		driver.findElement(locator).submit();
		captureScreen(rutaCarpeta);
	}

	// METODO DE TIEMPO DE ESPERA
	public void tiempoEspera(long tiempo) throws InterruptedException {
		Thread.sleep(tiempo);
	}

}
	