import java.io.*;
import java.net.*;

public class URLReader {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
