package ObjectHandler.API;
import factory.API.JsonPlaceHolderEvent;

import java.io.IOException;

public class APIObjectHandler {
    static JsonPlaceHolderEvent jsonPlaceHolderEvent;

    public static JsonPlaceHolderEvent getJsonPlaceHolderEvent() throws IOException {
        if(jsonPlaceHolderEvent==null)
            return new JsonPlaceHolderEvent();
        return jsonPlaceHolderEvent;
    }

}
