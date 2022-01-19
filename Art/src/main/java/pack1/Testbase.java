package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pack3.TestUtil;



public class Testbase {


	public static WebDriver driver;
	public static Properties prop;

	public Testbase()
	{
		prop= new Properties();

		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Rakes\\eclipse-workspace\\FreeAutoTest\\src\\main\\java\\com\\amzon\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void intialization()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals(browsername))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakes\\Downloads\\chromedriver_win32\\chromedriver.exe");			
			driver= new ChromeDriver();		
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		//driver.get(prop.getProperty("url"));
		driver.get("https://github.com/login");
		
	}
	

}
