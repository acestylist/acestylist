package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class RoundmenfacecollectionActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView beardCard, haircutCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roundmenfacecollection);
        beardCard = (CardView) findViewById(R.id.roundmfbeard_et);
        haircutCard = (CardView) findViewById(R.id.roundmfhaircut_et);
        accesoriesCard = (CardView) findViewById(R.id.roundmfaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.roundmfbeard_et:
                i = new Intent(this, RoundmenfacestructurebeardActivity.class);
                startActivity(i);
                break;
            case R.id.roundmfhaircut_et:
                i = new Intent(this, RoundmenfacestructurehaircutActivity.class);
                startActivity(i);
                break;
            case R.id.roundmfaccessories_et:
                i = new Intent(this, RoundmenfacestructeraccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
