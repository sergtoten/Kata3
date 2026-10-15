package software.ulpgc.katas;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        URI uri = new URI("https://randomuser.me/api/?results=10");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
        String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        JsonArray results = new Gson().fromJson(response, JsonObject.class). getAsJsonArray("results");
        List<User> users = new ArrayList<>();
        for (JsonElement element : results) {
            DtoUser user  = new Gson().fromJson(element, DtoUser.class);
            users.add(
                    new User(user.name.first + " " + user.name.last, User.Gender.valueOf(user.gender))
            );
        }
        for (User user : users) {
            System.out.println(user);
        }
    }
}
