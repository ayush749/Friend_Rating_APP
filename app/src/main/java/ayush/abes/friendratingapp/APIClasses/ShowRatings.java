package ayush.abes.friendratingapp.APIClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import ayush.abes.friendratingapp.APIClasses.ShowMyRatingsList;

/**
 * Created by Ayush on 5/31/2017.
 */

public class ShowRatings {
    @SerializedName("sources")
    @Expose
    public List<ShowMyRatingsList> showMyRatingsList;

}
