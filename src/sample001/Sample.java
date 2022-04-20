package sample001;

public class Sample {
	public static void main(String[] args) throws InterruptedException{
		 
		 System.out.println("Execution after setting ChromeDriver path in System setProperty method");
		 System.setProperty("webdriver.chrome.driver", "E:\\drivers\\ChromeDrivers\\85\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com");
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");
		 
		 }

}
