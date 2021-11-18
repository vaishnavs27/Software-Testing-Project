package autom_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UDC_clg
{

	public static void main(String[] args) throws InterruptedException
	{
//TC01-launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumjar1\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		
		//open url
		w.get("https://www.udc.ac.in/index.php");
		
		//to maximize 
		w.manage().window().maximize();
		
//TC02-   PROJECT PAGE TITLE
		
		System.out.println("project page title:" +(w.getTitle()));
		
//TC03-  PROJECT PAGE URL
		
		System.out.println("project url:"  + (w.getCurrentUrl()));	
		
		


		//it is an interface to convert webdriver object to javascript object
		JavascriptExecutor js=(JavascriptExecutor)w;
		Thread.sleep(2000);
		
		//scroll down
		js.executeScript("window.scrollBy(0,600)", "");
		
//TC04-Founder Message read more arrow
		w.findElement(By.linkText("Read More →")).click();
		
        //scroll  upto bottom of founder message page
	     js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
	     
	     //scroll up
		   js.executeScript("window.scrollBy(0,-2000)", "");
// TC05-click on home to go back
		   w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/i[1]")).click();
//TC06- read more arrow of NCC (Men's & Women's)  
	 //scroll down
		js.executeScript("window.scrollBy(0,500)", "");
		w.findElement(By.xpath("//*[@id=\"wrapper\"]/div/section[2]/div/div/div/div[2]/div/div[1]/div/p/a")).click(); //DO1 reflect to home page
	 
//TC07- read more arrow of Red Cross
		 //scroll down
		js.executeScript("window.scrollBy(0,500)", "");
        w.findElement(By.xpath("//*[@id=\"wrapper\"]/div/section[2]/div/div/div/div[2]/div/div[2]/div/p/a")).click(); //DO2 reflect to home page
//TC08- read more arrow of NSS 4 Units
        //scroll down
		js.executeScript("window.scrollBy(0,600)", "");
		 w.findElement(By.xpath("//*[@id=\"wrapper\"]/div/section[2]/div/div/div/div[2]/div/div[3]/div/p/a")).click(); //DO3 reflect to home page
		 
//TC09- read more arrow of Red Ribbon Club
		 //scroll down
			js.executeScript("window.scrollBy(0,600)", "");
			 w.findElement(By.xpath("//*[@id=\"wrapper\"]/div/section[2]/div/div/div/div[2]/div/div[4]/div/p/a")).click(); //DO4 reflect to home page
			// click on home to go back
			   w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/i[1]")).click(); 
		
		//Thread.sleep(2000);
		//scroll down
	    js.executeScript("window.scrollBy(0,2000)", "");
	    
	   
//TC10-click on college handbook
	    w.findElement(By.xpath("//a[contains(text(),'College Hand-Book')]")).click();	
	    	  //scroll  upto bottom of college handbook  page
	       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		//scroll up
		   js.executeScript("window.scrollBy(0,-2000)", "");
		
		// click on home to go back
		   w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/i[1]")).click();
	
		
		//scroll down
	       js.executeScript("window.scrollBy(0,2000)", "");
//TC11-  click on library catalogue option
	       w.findElement(By.linkText("Library Catalogue")).click();
	   
		//scroll down
	       js.executeScript("window.scrollBy(0,2000)", "");
	    //scroll up
	  	   js.executeScript("window.scrollBy(0,-2000)", "");
	  	
        // click on home to go back
		   w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/i[1]")).click();
		
		//scroll down
	        js.executeScript("window.scrollBy(0,2000)", "");
	    
//TC12-   NAAC option
	        w.findElement(By.linkText("NAAC")).click();      //D05--  not working ....reflect to homepage only //
	    
	   //scroll down
	       js.executeScript("window.scrollBy(0,2000)", "");
	       
 // TC13-    News Letter option
	    w.findElement(By.linkText("News Letter")).click();   
	     //scroll down
	         js.executeScript("window.scrollBy(0,2200)", "");
	     //scroll up
	      	js.executeScript("window.scrollBy(0,-2200)", "");
	  	
	    // click on home to go back
		   w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/i[1]")).click();
	    
		 //scroll down
		    js.executeScript("window.scrollBy(0,2000)", "");
		    
 //TC14-   NIRF option
		    w.findElement(By.linkText("NIRF")).click();    // D06---not working properly  ..NAAC page is opening //
		    
           //scroll down
			    js.executeScript("window.scrollBy(0,2000)", "");
		   //scroll up
			  js.executeScript("window.scrollBy(0,-2000)", "");    
			
			// click on home to go back
			   w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/i[1]")).click();

				 //scroll down
				    js.executeScript("window.scrollBy(0,2000)", "");
// TC15---- Quality Assurance Report
				    w.findElement(By.xpath("//a[contains(text(),'Quality Assurance Report')]")).click();
		    
				  //-   scroll down OF Quality Assurance Report
				    js.executeScript("window.scrollBy(0,2000)", "");
			  //scroll up
				  js.executeScript("window.scrollBy(0,-2000)", ""); 
				  
				// click on home to go back
				   w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/i[1]")).click(); 
				   
				  //scroll  upto bottom of  HOME page
			       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
			       
			       //QUICK LINKS
//TC16----home optio in QUICK LINKS
			    w.findElement(By.linkText("Home")).click();
			    
			  //scroll  upto bottom of  HOME page
			       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
			       
 //TC17----About Us optio in QUICK LINKS     
			       w.findElement(By.xpath("//*[@id=\"footer\"]/section[1]/div/div/div[2]/div/ul/li[2]/a")).click();
			     //scroll  upto bottom of  AboutUs page
			       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
			       
//TC18--- Courses Offered OPTION IN QUICK LINKS
			       w.findElement(By.xpath("//*[@id=\"footer\"]/section[1]/div/div/div[2]/div/ul/li[3]/a")).click();
			       //scroll  upto bottom of  AboutUs page
			       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
			       
 //TC19--- Students Corner  OPTION IN QUICK LINKS
			       w.findElement(By.xpath("//*[@id=\"footer\"]/section[1]/div/div/div[2]/div/ul/li[4]/a")).click();
			     //scroll  upto bottom of  Students Corner page
			       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
			       
//TC20--- Contact  OPTION IN QUICK LINKS
			       w.findElement(By.linkText("Contact")).click();
			       //scroll  upto bottom of  Contact page
			       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");   
			       
 //TC21--- RTI  OPTION IN QUICK LINKS
			       w.findElement(By.linkText("RTI")).click();
			       
			       Set<String> win= w.getWindowHandles();
					Iterator<String> it= win.iterator();
					String p_window =it.next(); //0 index
					String c_window =it.next(); //1st index
					w.switchTo().window(c_window);
					Thread.sleep(2000);
					//to download pdf ???
					w.switchTo().window(p_window);
					
//TC22---  Departments OPTION IN QUICK LINKS
		w.findElement(By.xpath("//*[@id=\"footer\"]/section[1]/div/div/div[3]/div/ul/li[1]/a")).click();
		//scroll  upto bottom of  Department page
	       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");     
	       
//TC23---   Facilities OPTION IN QUICK LINKS
	       w.findElement(By.xpath("//*[@id=\"footer\"]/section[1]/div/div/div[3]/div/ul/li[2]/a")).click();
	     //scroll  upto bottom of  Facilities  page
	       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");     
	       
 //TC24---   gallery OPTION IN QUICK LINKS
			   w.findElement(By.xpath("//*[@id=\"footer\"]/section[1]/div/div/div[3]/div/ul/li[3]/a")).click();
			   //scroll  upto bottom of  gallery page
		       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");     
		       
//TC25---      Alumni  OPTION IN QUICK LINKS.......
			   w.findElement(By.xpath("//*[@id=\"footer\"]/section[1]/div/div/div[3]/div/ul/li[4]/a")).click(); // D07---.. alumini page open but it is highlihting  student corner option in header instead of header
			   //scroll  upto bottom of     Alumni page
		       js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");     
		       
//TC26---    Downloads  OPTION IN QUICK LINKS...... 
		       w.findElement(By.xpath("//*[@id=\"footer\"]/section[1]/div/div/div[3]/div/ul/li[5]/a")).click();   //D08...... about us page is opening instead of downloads page
		
//ABOUT US OPTION IN HEADER
//TC27----- founder option in about US
		   	Actions a =new Actions(w);

		   a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			w.findElement(By.linkText("Founder")).click();
			  //   scroll down OF FOUNDER PAGE FROM ABOUT US
		    js.executeScript("window.scrollBy(0,1500)", "");
		    w.navigate().back();
		    
//TC28----  Institution  option in about US
			a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			w.findElement(By.linkText("Institution")).click();
		  //   scroll down OF Institution PAGE FROM ABOUT US
		    js.executeScript("window.scrollBy(0,2000)", "");
	
		    w.navigate().back();
//TC29----  Management  option in about US		    
		    a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			w.findElement(By.linkText("Management")).click();
		  //   scroll down OF Management PAGE FROM ABOUT US
		    js.executeScript("window.scrollBy(0,2000)", "");
		   // Thread.sleep(2000);
		    w.navigate().back();
		    
//TC30----  Principal  option in about US	
		    a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[4]/a")).click();
		  //   scroll down OF Principal PAGE FROM ABOUT US
		    js.executeScript("window.scrollBy(0,600)", "");
		   // Thread.sleep(2000);
		    w.navigate().back();
//TC31----  Director (SFC)  option in about US	
		   a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[5]/a")).click();
		  //   scroll down OF Director (SFC) PAGE FROM ABOUT US
		    js.executeScript("window.scrollBy(0,600)", "");
		  //  Thread.sleep(2000);		    
		    w.navigate().back();
//TC32-----About Us / Staff Details / Aided Staff / Department Of Tamil  option
		    a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			a.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[6]/a"))).build().perform();
			 a.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[6]/ul/li[1]/a"))).build().perform();
			w.findElement(By.linkText("Tamil")).click();
		//   scroll down OFpage
		    js.executeScript("window.scrollBy(0,500)", "");
		    w.navigate().back();
		    
//TC33	------  About Us / Staff Details / Aided Staff / Department Of English  option
		    
			
            a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			a.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[6]/a"))).build().perform();
			 a.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[6]/ul/li[1]/a"))).build().perform();
		   Thread.sleep(2000);
			 w.findElement(By.linkText("English")).click();
		//   scroll down OFpage
		    js.executeScript("window.scrollBy(0,500)", "");
		    w.navigate().back(); 	    
		    
//TC34	------  About Us / Staff Details / Aided Staff / Department Of Mathematics  option
		    a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			a.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[6]/a"))).build().perform();
			 a.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[6]/ul/li[1]/a"))).build().perform();
			w.findElement(By.linkText("Mathematics")).click();
		//   scroll down OFpage
		    js.executeScript("window.scrollBy(0,500)", "");
		    w.navigate().back(); 	
		    
		 
//TC35	------  About Us / Staff Details / Aided Staff / Department Of Physics  option
		    a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			a.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[6]/a"))).build().perform();
			 a.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[6]/ul/li[1]/a"))).build().perform();
			 Thread.sleep(2000);
			w.findElement(By.linkText("Physics")).click();
		//   scroll down OFpage
		    js.executeScript("window.scrollBy(0,500)", "");
		    w.navigate().back(); 

//TC36	------  About Us / Staff Details / Un-Aided Staff / Department Of microbiology option
		   /* a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
			a.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[2]/ul/li[6]/a"))).build().perform();
			 a.moveToElement(w.findElement(By.xpath("//*[@id=\"active\"]/ul/li[6]/ul/li[2]/a"))).build().perform();
			w.findElement(By.linkText("Microbiology")).click();
		//   scroll down OFpage
		    js.executeScript("window.scrollBy(0,500)", "");
		    w.navigate().back(); */		    
		    
//TC37	------  About Us / Staff Details / Un-Aided Staff / Department Of microbiology option
			   /* a.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();
				a.moveToElement(w.findElement(By.xpath("//*[@id=\"active\"]/ul/li[6]/ul/li[3]/a"))).build().perform();
				 (w.findElement(By.xpath("//*[@id=\"active\"]/ul/li[6]/ul/li[3]/ul/li[1]/a"))).click();
				
			//   scroll down OFpage
			    js.executeScript("window.scrollBy(0,500)", "");
			    w.navigate().back(); */    
		    
//TC38  FACILITIES / LIBRARY OPTION
		    Actions a1 =new Actions(w);
			a1.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[7]/a"))).build().perform();
			w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[7]/ul/li[1]/a")).click();
			 w.navigate().back();
			 
//TC39  FACILITIES / Seminar Halls
			   
				a1.moveToElement(w.findElement(By.xpath("//*[@id=\"menuzord\"]/ul/li[7]/a"))).build().perform();
				w.findElement(By.linkText("Seminar Halls")).click();
				 w.navigate().back();

//TC40 CHECK COLLEGE VIEW OPTION
				 
				 w.findElement(By.xpath("//a[contains(text(),'COLLEGE VIEW')]")).click();
					Thread.sleep(2000);
					Set<String> s1=w.getWindowHandles();
					Iterator<String> it1=s1.iterator();
					
					String p1_window=it.next();   //0index
					String C1_window=it.next();     //1 index
					
					w.switchTo().window(C1_window);
					w.switchTo().window(p1_window);  
					Thread.sleep(2000);
					//w.navigate().to("\"https://www.udc.ac.in/index.php");
			 

	}
	

}
