package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HeartfaceswomencollectionActivity extends AppCompatActivity  implements View.OnClickListener {
    private CardView makeupCard, haircutCard, ornamentsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heartfacewomencollection);
        makeupCard = (CardView) findViewById(R.id.heartwfmakeup_et);
        haircutCard = (CardView) findViewById(R.id.heartwfhaircut_et);
        ornamentsCard = (CardView) findViewById(R.id.heartwfornaments_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.heartwfmakeup_et:
                i = new Intent(this, HeartwomenfacestructuremakeupActivity.class);
                startActivity(i);
                break;
            case R.id.heartwfhaircut_et:
                i = new Intent(this, HeartwomenfacestructurehaircutActivity.class);
                startActivity(i);
                break;
            case R.id.heartwfornaments_et:
                i = new Intent(this,HeartwomenfacestructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
