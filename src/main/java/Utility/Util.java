package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Util {
	
	public static void cpatureScreenshotF(WebDriver driver , String SC) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\jayesh\\eclipse-workspace\\FrameworkJay\\ScreenshotsFrameworkJay\\"+ SC + ".jpeg");
		FileHandler.copy(source, dest);
	
	}

}
