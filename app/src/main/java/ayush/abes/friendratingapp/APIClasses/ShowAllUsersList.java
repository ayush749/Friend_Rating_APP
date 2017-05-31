package ayush.abes.friendratingapp.APIClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import ayush.abes.friendratingapp.ShowMyUsersLists;

/**
 * Created by Ayush on 5/31/2017.
 */

public class ShowAllUsersList {

    @SerializedName("sources")
    @Expose
    public List<ShowMyUsersLists> showMyUsersLists;

}
