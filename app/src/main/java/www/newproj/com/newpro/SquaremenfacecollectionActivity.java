package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class SquaremenfacecollectionActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView beardCard, haircutCard, accesoriesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squaremenfacecollection);
        beardCard = (CardView) findViewById(R.id.squaremfbeard_et);
        haircutCard = (CardView) findViewById(R.id.squaremfhaircut_et);
        accesoriesCard = (CardView) findViewById(R.id.squaremfaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.squaremfbeard_et:
                i = new Intent(this, SquaremenfacestructurebeardActivity.class);
                startActivity(i);
                break;
            case R.id.squaremfhaircut_et:
                i = new Intent(this, SquaremenfacestructureheircutActivity.class);
                startActivity(i);
                break;
            case R.id.squaremfaccessories_et:
                i = new Intent(this, SquaremenfacestructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
