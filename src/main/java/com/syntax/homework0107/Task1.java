package com.syntax.homework0107;


    /*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */

interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{

        @Override
    public void openBrowser() {
            System.out.println("Crome is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Crome is closed");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Window chrome is maximized");
    }

    @Override
    public void findElement() {
        System.out.println("Element in Chrome is finding");
    }
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox is closed");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Window Firefox is maximized");
    }

    @Override
    public void findElement() {
        System.out.println("Element in Firefox is finding");
    }
}

class Task1{
    public static void main(String[] args) {
        WebDriver[] drivers = {new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver driver:drivers){
            driver.openBrowser();
            driver.maximizeWindow();
            driver.findElement();
            driver.closeBrowser();
        }
    }
}
