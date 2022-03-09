package MapSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoQNav.DemoQBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Mapselectelement extends DemoQBase
{
	
	public Mapselectelement(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	
	
	protected By btnLogin = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginEmail']");
	
	protected By btnIngreso = By.xpath("//android.widget.TextView[@text = 'Correo electrónico']");
	
	protected By btnCorreo = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edUsuario']");
	
	protected By btnPassword = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edPassword']");
	
	protected By btnAccepts = By.xpath("//android.widget.LinearLayout/android.widget.Button");
	
	protected By btnAccepts1 = By.xpath("//android.widget.Button[@text = 'Iniciar sesión']");
	
	protected By Option2  = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	
	protected By Option3 = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]");
	
	protected By MineCel = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
			
	protected By AcceptDevice = By.xpath("//android.widget.Button[@text='Continuar']");
	
	protected By btnAcceptDevice = By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btn41']");
	
	
	

}



