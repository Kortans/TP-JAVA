import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class WebServer extends WebServerApplication {

    
    
    
    private void readRequest(Socket socket) throws IOException{
        InputStream input = socket.getInputStream();
        InputStreamReader reader = new InputStreamReader(input); 
   }
    private void sendResponse(Socket socket){
        
    }
    
    public void run(int portNumber) throws IOException{
        ServerSocket serverSocket = new ServerSocket(portNumber);
        readRequest(serverSocket);
    }
}