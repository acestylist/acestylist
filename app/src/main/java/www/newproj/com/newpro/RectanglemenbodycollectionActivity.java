package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class RectanglemenbodycollectionActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectanglemenbodycollection);
        groomingCard = (CardView) findViewById(R.id.rectanglembgrooming_et);
        outfitCard = (CardView) findViewById(R.id.rectanglemboutfit_et);
        accesoriesCard = (CardView) findViewById(R.id.rectanglembaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.rectanglembgrooming_et:
                i = new Intent(this, RectanglemenbodystructuregroomingActivity.class);
                startActivity(i);
                break;
            case R.id.rectanglemboutfit_et:
                i = new Intent(this, RectanglemenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.rectanglembaccessories_et:
                i = new Intent(this, RectanglrmenodystructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }

    }
}
