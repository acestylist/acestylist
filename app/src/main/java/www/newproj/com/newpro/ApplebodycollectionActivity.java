package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class ApplebodycollectionActivity extends AppCompatActivity  implements View.OnClickListener {
    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applebodycollection);
        groomingCard = (CardView) findViewById(R.id.applewbgrooming_et);
        outfitCard = (CardView) findViewById(R.id.applewboutfit_et);
        accesoriesCard = (CardView) findViewById(R.id.applewbaccessories_et);
    }


    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.applewbgrooming_et:
                i = new Intent(this, ApplewomenbodystructuregroomingActivity.class);
                startActivity(i);
                break;
            case R.id.applewboutfit_et:
                i = new Intent(this, ApplewomenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.applewbaccessories_et:
                i = new Intent(this, ApplewomenbodystructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
