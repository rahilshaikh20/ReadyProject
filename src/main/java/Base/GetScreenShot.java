package Base;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
public class GetScreenShot {
	
	public static int count=0;
     
    public static void captureScreenshot(WebDriver driver) throws IOException
   
    {
    	
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+count+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);        
        count++;
    }
}