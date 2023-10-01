
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(String.format("https://maps.googleapis.com/maps/api/directions/json?origin=%s&destination=%s&key=%s", "43.6595903772, -79.3976291786", "43.667202, -79.3923527", "your api key here"))
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            JSONObject responseBody = new JSONObject(response.body().string());

            if (responseBody.getString("status").equals("OK")) {
                JSONArray routes = responseBody.getJSONArray("routes");
                System.out.println("status: " + responseBody.getString("status") + "\n" + routes);
            } else {
                throw new RuntimeException(responseBody.getString("error_message"));
            }
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
