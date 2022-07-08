package com.syntax.homework0107;

interface WebDriver1{
    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot{
    void screenshot();
}

interface RemoteWebDriver extends WebDriver1, TakesScreenshot {
    void navigate();
}



class ChromeDriver1 implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Chrome is opened");
    }

    @Override
    public void close() {
        System.out.println("Chrome is closed");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void screenshot() {
        System.out.println("Chrome screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome");
    }
}
class FireFoxDriver1 implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("FireFox is opened");
    }

    @Override
    public void close() {
        System.out.println("FireFox is closed");
    }

    @Override
    public String getTitle() {
        return "FireFox";
    }

    @Override
    public void screenshot() {
        System.out.println("FireFox screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to FireFox");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Safari is opened");
    }

    @Override
    public void close() {
        System.out.println("Safari is closed");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void screenshot() {
        System.out.println("Safari screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari");
    }
}

class Task5{
    public static void main(String[] args) {
        RemoteWebDriver[] webDrivers = {new ChromeDriver1(), new FireFoxDriver1(), new SafariDriver()};
        for (RemoteWebDriver webDriver:webDrivers){
            webDriver.open();
            webDriver.navigate();
            System.out.println(webDriver.getTitle());
            webDriver.screenshot();
            webDriver.close();
        }
    }
}