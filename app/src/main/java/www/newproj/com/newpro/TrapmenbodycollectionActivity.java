package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class TrapmenbodycollectionActivity extends AppCompatActivity implements View.OnClickListener {


    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapmenbodycollection);
        groomingCard = (CardView) findViewById(R.id.trapmbgrooming_et);
        outfitCard = (CardView) findViewById(R.id.trapmboutfit_et);
        accesoriesCard = (CardView) findViewById(R.id.trapmbaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.trapmbgrooming_et:
                i = new Intent(this, TrapmenbodystructuregroomingActivity.class);
                startActivity(i);
                break;
            case R.id.trapmboutfit_et:
                i = new Intent(this,TrapmenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.trapmbaccessories_et:
                i = new Intent(this, TrapmenbodystructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
