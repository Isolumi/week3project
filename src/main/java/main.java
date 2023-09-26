import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;

import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException, ApiException {
        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey("AIzaSyCCPBnR3n8Rhx4t8rbOzbSjIGXEmlW-5n4")
                .build();
        try
        {
            DirectionsResult res = DirectionsApi.getDirections(context, "43.6595903772, -79.3976291786", "43.667202, -79.3923527").await();
            //        Gson gson = new GsonBuilder().registerTypeAdapter(ZonedDateTime.class, ZonedDateTimeAdapter()).setPrettyPrinting().create();
            System.out.println("status: " + res.geocodedWaypoints[0].geocoderStatus + " " + Arrays.toString(res.routes[0].legs));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        context.shutdown();
    }
}
