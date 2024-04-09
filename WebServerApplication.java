import java.io.IOException;

public class WebServerApplication {

    WebServerApplication(){}

public static void main (String[] args)
{
    
    WebServer webserver = new WebServer(80);
    try{
        webserver.run(80);
    }
    catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    }
}
}