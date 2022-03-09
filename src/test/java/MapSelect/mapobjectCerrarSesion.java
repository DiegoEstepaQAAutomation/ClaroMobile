package MapSelect;

import org.openqa.selenium.By;

import DemoQNav.DemoQBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class mapobjectCerrarSesion extends DemoQBase
{

	public mapobjectCerrarSesion(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	
	
	protected By btnPerfilEnd = By.xpath("//android.widget.ImageView[@resource-id = 'com.clarocolombia.miclaro.debug:id/imgPerfil']");
	
	protected By GreatFinale = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[11]");
	
	protected By Close = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn_aceptar']");
	
}
