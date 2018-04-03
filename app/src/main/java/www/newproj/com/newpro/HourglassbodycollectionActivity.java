package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HourglassbodycollectionActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourglassbodycollection);
        groomingCard = (CardView) findViewById(R.id.hourglasswbgrooming_et);
        outfitCard = (CardView) findViewById(R.id.hourglasswboutfit_et);
        accesoriesCard = (CardView) findViewById(R.id.hourglasswbaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.hourglasswbgrooming_et:
                i = new Intent(this, HourglasswomenbodystructuregroomingActivity.class);
                startActivity(i);
                break;
            case R.id.hourglasswboutfit_et:
                i = new Intent(this, HourglasswomenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.hourglasswbaccessories_et:
                i = new Intent(this, HourglasswomenbodystructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
