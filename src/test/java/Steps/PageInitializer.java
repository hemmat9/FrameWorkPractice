package Steps;

import Pages.DemoQa;

public class PageInitializer {

    public static DemoQa demoQa;



    public static void initializePageObject(){
        demoQa = new DemoQa();
    }
}
