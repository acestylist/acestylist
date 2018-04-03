package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class OvalmenfacecollectionActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView beardCard, haircutCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovalmenfacecollection);
        beardCard = (CardView) findViewById(R.id.ovalmfbeard_et);
        haircutCard = (CardView) findViewById(R.id.ovalmfhaircut_et);
        accesoriesCard = (CardView) findViewById(R.id.ovalmfaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.ovalmfbeard_et:
                i = new Intent(this, OvalmenfacestructurebeardActivity.class);
                startActivity(i);
                break;
            case R.id.ovalmfhaircut_et:
                i = new Intent(this, OvalmenfacestructurehaircutActivity.class);
                startActivity(i);
                break;
            case R.id.ovalmfaccessories_et:
                i = new Intent(this, OvalmenfacestructureaccesoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
