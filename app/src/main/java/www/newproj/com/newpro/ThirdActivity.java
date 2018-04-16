package www.newproj.com.newpro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

//added comment
     public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView ProfileCard, SearchCard, UpdateCard, LogoutCard;

    DatabaseHandler db;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public static final String MyPREFERENCES = "MyPrefs" ;
    String myname, mylastname, myemail, mymobile,mydob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ProfileCard = (CardView) findViewById(R.id.profile_et);
        SearchCard = (CardView) findViewById(R.id.search_et);
        UpdateCard = (CardView) findViewById(R.id.update_et);
        LogoutCard = (CardView) findViewById(R.id.logout_et);

        db = new DatabaseHandler(this);

        /*Get Data from shared preference*/

        sharedPreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        myname = (sharedPreferences.getString("name", ""));
        mylastname = (sharedPreferences.getString("lastname", ""));
        mymobile = (sharedPreferences.getString("mobile", ""));
        myemail= (sharedPreferences.getString("password", ""));
        myemail= (sharedPreferences.getString("dob", ""));

        Clientdata clientdata = db.getClient("shriyaarolkar26@gmail.com ");// get data from database for particular user

        Log.v("DATAIS:"+clientdata,"");

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.profile_et:
                i = new Intent(this, ProfilecardActivity.class);
                startActivity(i);
                break;
            case R.id.search_et:
                i = new Intent(this, SearchcardActivity.class);
                startActivity(i);
                break;
            case R.id.update_et:
                i = new Intent(this, SecondActivity.class);
                startActivity(i);
                break;
            case R.id.logout_et:
                i = new Intent(this, LogoutcardActivity.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }
}