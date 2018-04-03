package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class IntrimenbodycollectionActivity extends AppCompatActivity  implements View.OnClickListener{
    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrimenbodycollection);
        groomingCard = (CardView) findViewById(R.id.intrimbgrooming_et);
        outfitCard = (CardView) findViewById(R.id.intrimboutfit_et);
        accesoriesCard = (CardView) findViewById(R.id.intrimbaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.intrimbgrooming_et:
                i = new Intent(this, IntrimenbodystructuregroomingActivity.class);
                startActivity(i);
                break;
            case R.id.intrimboutfit_et:
                i = new Intent(this, IntrimenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.intrimbaccessories_et:
                i = new Intent(this, IntrimenbodystructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
