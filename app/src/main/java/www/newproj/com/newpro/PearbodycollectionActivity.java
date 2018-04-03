package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class PearbodycollectionActivity extends AppCompatActivity  implements View.OnClickListener{
    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pearbodycollection);
        groomingCard = (CardView) findViewById(R.id.pearwbgrooming_et);
    outfitCard = (CardView) findViewById(R.id.pearwboutfit_et);
    accesoriesCard = (CardView) findViewById(R.id.pearwbaccessories_et);
}

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.pearwbgrooming_et:
                i = new Intent(this, PearwomenbodystructuregroomingActivity.class);
                startActivity(i);
                break;
            case R.id.pearwboutfit_et:
                i = new Intent(this, PearwomenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.pearwbaccessories_et:
                i = new Intent(this, PearwomenbodystructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
