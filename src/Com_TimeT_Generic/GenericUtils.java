package Com_TimeT_Generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class GenericUtils 
{
public static void getScreenshot(WebDriver driver,String name)
{
TakesScreenshot ts = (TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);

File dest = new File("./Screenshot/"+name+".png");
try 
{
	Files.copy(src, dest);
} catch (IOException e) 
{
	
}
}
public static void selectByIndex(WebElement element,int index)
{
	Select sel = new Select(element);
	sel.selectByIndex(index);
}	
public static void selectByValue(WebElement element,String value)
{
	new Select(element).selectByValue(value);
}
public static void selectByVisibleText(WebElement element,String text)
{
	new Select(element).selectByVisibleText(text);
}
public static void robot(int press,int release)
{
	try 
	{
		Robot r = new Robot();
		r.keyPress(press);
		r.keyRelease(release);
	} 
	catch (AWTException e) 
	{	
	}	
}
public void action(WebDriver driver,WebElement target)
{
	Actions ac = new Actions(driver);
	
	ac.moveToElement(target);
}
}
