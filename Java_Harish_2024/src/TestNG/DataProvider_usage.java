package TestNG;

public class DataProvider_usage {

@DataProvider(name="data")
public Object[][] userData(){
return new Object[][]{
  {"harish","Hari@9911"},
  {"savvi","Hari@3344"}
};
}

@Test(dataProvider="data")
public void testUser(String Username,String Password){
    WebElement uname = driver.findElement(By.id("userid"));
    WebElement pass = driver.findElement(By.id("passwd"));
    uname.sendKeys(Username);
    pass.sendKeys(Password);
  }
  
}
