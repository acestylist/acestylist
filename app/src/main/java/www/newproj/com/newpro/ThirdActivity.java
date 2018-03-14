package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

//added comment
     public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView ProfileCard, SearchCard, UpdateCard, LogoutCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ProfileCard = (CardView) findViewById(R.id.profile_et);
        SearchCard = (CardView) findViewById(R.id.search_et);
        UpdateCard = (CardView) findViewById(R.id.update_et);
        LogoutCard = (CardView) findViewById(R.id.logout_et);



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
                i = new Intent(this, UpdatecardActivity.class);
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