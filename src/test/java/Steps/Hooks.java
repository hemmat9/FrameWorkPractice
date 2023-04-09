package Steps;

import Utils.CommonMethods;
import org.junit.After;
import org.junit.Before;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        openBrowserAndLaunchApplication();
    }
    @After
    public void end(){
        closeBrowser();
    }
}
