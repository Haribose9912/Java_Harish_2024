//driect handling
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement btn = (WebElement) js.executeScript(
    "return document.querySelector('#shadow-host').shadowRoot.querySelector('#my-btn')"
);
btn.click();


// utility method 

public WebElement getShadowElement(WebDriver driver, String hostCss, String innerCss) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    return (WebElement) js.executeScript(
        "return document.querySelector(arguments[0]).shadowRoot.querySelector(arguments[1])",
        hostCss, innerCss
    );
}
//usage 

WebElement btn = getShadowElement(driver, "#shadow-host", "#my-btn");
btn.click();
