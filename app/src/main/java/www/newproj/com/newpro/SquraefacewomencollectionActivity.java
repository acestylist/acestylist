package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class SquraefacewomencollectionActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView makeupCard, haircutCard, ornamentsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squarefaceswomencollection);
        makeupCard = (CardView) findViewById(R.id.squarewfmakeup_et);
        haircutCard = (CardView) findViewById(R.id.squarewfhaircut_et);
        ornamentsCard = (CardView) findViewById(R.id.squarewfornaments_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.squarewfmakeup_et:
                i = new Intent(this, SquarewomenfacestructremakeupActivity.class);
                startActivity(i);
                break;
            case R.id.squarewfhaircut_et:
                i = new Intent(this, SquarewomenfacestructurehaircutActivity.class);
                startActivity(i);
                break;
            case R.id.squarewfornaments_et:
                i = new Intent(this,SquarewomenfacestructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
