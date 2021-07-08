package Assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_1_07_21 {
 public static WebDriver driver;
 
 
	 @Test(dataProvider="data")
	 public void mm1(String un,String pwd) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\kd21221\\selenium softwares\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		System.out.println("login Successfull");
		driver.close();
	
	
	 }

	 

    
    
    @DataProvider(name="data")
    public Object[][]  feedDP() throws ClassNotFoundException, SQLException
    {
        Object[][] data=getvalues();
        
                return data;
    }

@Test(dataProvider="data")
public Object[][] getvalues() throws ClassNotFoundException, SQLException
{
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/ojas";
    String username = "root";
    String password = "root";
    Connection con = DriverManager.getConnection(url,username,password);
    Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    ResultSet rs = smt.executeQuery("select * from logindata");
    rs.last();
    int rows = rs.getRow();
    System.out.println("number of rows"+ rows);
    ResultSetMetaData rsmd = rs.getMetaData();
    int cols = rsmd.getColumnCount();
    System.out.println("number of columns"+cols);
    String data[][] = new String[rows][cols];
    int i=0;
    rs.beforeFirst();
    while(rs.next()) {
        for(int j=0;j<cols;j++)
        {
            data[i][j]=rs.getString(j+1);
           System.out.println(data[i][j]);
           
        }i++;
    }
    return data;
    
    
    
    }
}

    
    
    





	
	 
	 


