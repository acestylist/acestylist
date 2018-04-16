package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class StraightbodycollectionActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_straightbodycollection);
        groomingCard = (CardView) findViewById(R.id.straightwbgrooming_et);
        outfitCard = (CardView) findViewById(R.id.straightwboutfit_et);
        accesoriesCard = (CardView) findViewById(R.id.straightwbaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.straightwbgrooming_et:
                i = new Intent(this, StrightwomenbodystructuregroomingActivity.class);
                startActivity(i);
                break;
            case R.id.straightwboutfit_et:
                i = new Intent(this, StrightwomenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.straightwbaccessories_et:
                i = new Intent(this, StraightwomenbodystructureaceessoriesActivity.class);
                startActivity(i);
                break;

        }

    }
}
