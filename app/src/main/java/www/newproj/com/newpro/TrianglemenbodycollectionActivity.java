package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class TrianglemenbodycollectionActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trianglemenbodycollection);
        groomingCard = (CardView) findViewById(R.id.trianglembgrooming_et);
        outfitCard = (CardView) findViewById(R.id.trianglemboutfit_et);
        accesoriesCard = (CardView) findViewById(R.id.trianglembaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.trianglembgrooming_et:
                i = new Intent(this, TrianglemenbodystructuregroomingActivity.class);
                startActivity(i);
                break;
            case R.id.trianglemboutfit_et:
                i = new Intent(this, TrianglemenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.trianglembaccessories_et:
                i = new Intent(this, TrianglemenbodystructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
