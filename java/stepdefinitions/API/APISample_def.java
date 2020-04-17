package stepdefinitions.API;

import ObjectHandler.API.APIObjectHandler;
import configs.DataLoader;
import cucumber.api.java.en.Given;
import java.io.IOException;

public class APISample_def extends DataLoader {

    public APISample_def() throws IOException {
    }

    @Given("call GET method")
    public void callGETMethod() throws IOException {
        System.out.println("API given ");
        APIObjectHandler.getJsonPlaceHolderEvent().performGETMethod();
    }


}
