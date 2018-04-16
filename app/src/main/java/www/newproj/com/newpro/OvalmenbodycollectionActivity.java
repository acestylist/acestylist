package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class OvalmenbodycollectionActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView groomingCard, outfitCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovalmenbodycollection);
        groomingCard = (CardView) findViewById(R.id.ovalmbgrooming_et);
        outfitCard = (CardView) findViewById(R.id.ovalmboutfit_et);
        accesoriesCard = (CardView) findViewById(R.id.ovalmbaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.ovalmbgrooming_et:
                i = new Intent(this, OvalmenbodystructuregroomigActivity.class);
                startActivity(i);
                break;
            case R.id.ovalmboutfit_et:
                i = new Intent(this, OvalmenbodystructureoutfitActivity.class);
                startActivity(i);
                break;
            case R.id.ovalmbaccessories_et:
                i = new Intent(this, OvalmenbodystuctureaccessoriesActivity.class);
                startActivity(i);
                break;

        }

    }
}
