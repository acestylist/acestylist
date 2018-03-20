package www.newproj.com.newpro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class CollectioncardprofileActivity extends AppCompatActivity  {

    SharedPreferences facesharedpref;
    String pref_name = "FacePref";
    String facetype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectioncardprofile);

        facesharedpref = getSharedPreferences(pref_name , MODE_PRIVATE);
        facetype = facesharedpref.getString("skintone", null);
        System.out.println("Facetype : "+facetype);

    }

}