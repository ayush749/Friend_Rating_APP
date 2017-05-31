package ayush.abes.friendratingapp.APIClasses;

import ayush.abes.friendratingapp.APIClasses.JusSayAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Ayush on 5/31/2017.
 */

public class JusSayAPIClient {



    private static final String BASE_URL = "http://webandrioz.com/shwet/";

    public static JusSayAPI getClient(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(JusSayAPI.class);
    }

}
