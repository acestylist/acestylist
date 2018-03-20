package www.newproj.com.newpro;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;

public class ProfilecardActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView CollectionCard, SuggetionCard, UpdateCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilecard);
        CollectionCard = (CardView) findViewById(R.id.collectioninprofile_et);
        SuggetionCard = (CardView) findViewById(R.id.suggestioninprofile_et);
        UpdateCard = (CardView) findViewById(R.id.updateinprofile_et);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.collectioninprofile_et:
                i = new Intent(this, CollectioncardprofileActivity.class);
                startActivity(i);
                break;
            case R.id.suggestioninprofile_et:
                i = new Intent(this, SuggestioncardprofileActivity.class);
                startActivity(i);
                break;
            case R.id.updateinprofile_et:
                i = new Intent(this,GenderActivity.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }

    }

