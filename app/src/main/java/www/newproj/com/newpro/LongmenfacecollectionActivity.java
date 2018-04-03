package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class LongmenfacecollectionActivity extends AppCompatActivity  implements View.OnClickListener {
    private CardView beardCard, haircutCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longmenfacecollection);
        beardCard = (CardView) findViewById(R.id.longmfbeard_et);
        haircutCard = (CardView) findViewById(R.id.longmfhaircut_et);
        accesoriesCard = (CardView) findViewById(R.id.longmfaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.longmfbeard_et:
                i = new Intent(this, LongmenfacestructurebeardActivity.class);
                startActivity(i);
                break;
            case R.id.longmfhaircut_et:
                i = new Intent(this, LongmenfacestructurehaircutActivity.class);
                startActivity(i);
                break;
            case R.id.longmfaccessories_et:
                i = new Intent(this, LongmenfacestructureaccesoriesActivity.class);
                startActivity(i);
                break;

        }    }
}
