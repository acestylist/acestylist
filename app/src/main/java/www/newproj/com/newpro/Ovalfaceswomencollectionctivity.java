package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Ovalfaceswomencollectionctivity extends AppCompatActivity implements View.OnClickListener{
    private CardView makeupCard, haircutCard, ornamentsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovalfaceswomencollectionctivity);
        makeupCard = (CardView) findViewById(R.id.ovalwfmakeup_et);
        haircutCard = (CardView) findViewById(R.id.ovalwfhaircut_et);
        ornamentsCard = (CardView) findViewById(R.id.ovalwfornaments_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.ovalwfmakeup_et:
                i = new Intent(this, OvalwomenfacestructuremakeupActivity.class);
                startActivity(i);
                break;
            case R.id.ovalwfhaircut_et:
                i = new Intent(this, OvalwomenfacestructurehaircutActivity.class);
                startActivity(i);
                break;
            case R.id.ovalwfornaments_et:
                i = new Intent(this,OvalwomenfacestructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
