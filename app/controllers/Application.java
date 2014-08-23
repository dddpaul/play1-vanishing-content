package controllers;

import play.libs.WS;
import play.mvc.*;

import static play.libs.WS.*;

public class Application extends Controller
{
    public static void index()
    {
        String url = "http://google.com";
        HttpResponse response = WS.url( url ).post();
        String resp1 = response.getString();
        String resp2 = response.getString();
        renderArgs.put( "resp1", resp1 );
        renderArgs.put( "resp2", resp2 );
        render();
    }
}
