import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class WebServer extends WebServerApplication {

    
    private int portNumber;

    WebServer(){}

    WebServer(int newPortNumber){
        portNumber = newPortNumber;
    }
    
    
    private void readRequest(Socket socket) throws IOException{
        InputStream input = socket.getInputStream();
        InputStreamReader reader = new InputStreamReader(input); 
   }
    private void sendResponse(Socket socket){
        try {
            OutputStream output = socket.getOutputStream();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void run(int portNumber) throws IOException{
        try{
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Server started on port "+portNumber);    
       
        while (true){
            Socket clienSocket = serverSocket.accept();

            readRequest(clienSocket);
            sendResponse(clienSocket);

            clienSocket.close();
        }
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }
}