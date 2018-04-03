package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class TrianglemenfacecollectionActivity extends AppCompatActivity  implements View.OnClickListener {
    private CardView beardCard, haircutCard, accesoriesCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trianglemenfacecollection);
        beardCard = (CardView) findViewById(R.id.trianglemfbeard_et);
        haircutCard = (CardView) findViewById(R.id.trianglemfhaircut_et);
        accesoriesCard = (CardView) findViewById(R.id.trianglemfaccessories_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.trianglemfbeard_et:
                i = new Intent(this, TrianglemenfacestructurebeardActivity.class);
                startActivity(i);
                break;
            case R.id.trianglemfhaircut_et:
                i = new Intent(this, TrianglemenfacestructurehaircutActivity.class);
                startActivity(i);
                break;
            case R.id.trianglemfaccessories_et:
                i = new Intent(this, TrianglemenfacestructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}