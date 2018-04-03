package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class RoundfaceswomencollectionActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView makeupCard, haircutCard, ornamentsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roundfaceswomencollection);
        makeupCard = (CardView) findViewById(R.id.roundwfmakeup_et);
        haircutCard = (CardView) findViewById(R.id.roundwfhaircut_et);
        ornamentsCard = (CardView) findViewById(R.id.roundwfornaments_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.roundwfmakeup_et:
                i = new Intent(this, RoundwomenfacestructuremakeupActivity.class);
                startActivity(i);
                break;
            case R.id.roundwfhaircut_et:
                i = new Intent(this, RoundwomenfacestructurehaircutActivity.class);
                startActivity(i);
                break;
            case R.id.roundwfornaments_et:
                i = new Intent(this,RoundwomenfacestructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
    }

