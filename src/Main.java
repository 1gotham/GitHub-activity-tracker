import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        if(args == null || args.length == 0){
            System.out.println("Usage: java -jar GitHubUserActivity.jar <username>");
            return;
        } else if(args.length > 1){
            System.out.println("You can only enter one username");
            return;
        }
        String username = args[0];
        URI uriObj = new URI("https://api.github.com/users/" + username + "/events");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uriObj)
                .headers("Content-Type", "text/plain;charset=UTF-8")
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        String jsonString = response.body();

//        JsonReader


    }

}
