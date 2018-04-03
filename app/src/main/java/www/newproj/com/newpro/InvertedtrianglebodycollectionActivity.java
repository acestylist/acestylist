package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class InvertedtrianglebodycollectionActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invertedtrianglebodycollection);
        groomingCard = (CardView) findViewById(R.id.invertedwbgrooming_et);
        outfitCard = (CardView) findViewById(R.id.invertedwboutfit_et);
        accesoriesCard = (CardView) findViewById(R.id.invertedwbaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.invertedwbgrooming_et:
                i = new Intent(this, InvertedwomenbodystructuregroomingActivity.class);
                startActivity(i);
                break;
            case R.id.invertedwboutfit_et:
                i = new Intent(this, InvertedwomenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.invertedwbaccessories_et:
                i = new Intent(this, InvertedwomenbodystructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }

    }
}
