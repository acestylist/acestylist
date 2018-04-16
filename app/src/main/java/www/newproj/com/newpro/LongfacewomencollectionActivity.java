package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class LongfacewomencollectionActivity extends AppCompatActivity  implements View.OnClickListener {
    private CardView makeupCard, haircutCard, ornamentsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longfacestructurecollection);
        makeupCard = (CardView) findViewById(R.id.longwfmakeup_et);
        haircutCard = (CardView) findViewById(R.id.longwfhaircut_et);
        ornamentsCard = (CardView) findViewById(R.id.longwfornaments_et);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.longwfmakeup_et:
                i = new Intent(this, LongwomenfacestructuremakeupActivity.class);
                startActivity(i);
                break;
            case R.id.longwfhaircut_et:
                i = new Intent(this, LongwomenfacestructurehaircutActivity.class);
                startActivity(i);
                break;
            case R.id.longwfornaments_et:
                i = new Intent(this,LongwomenfacestructureaccessoriesActivity.class);
                startActivity(i);
                break;

        }
    }
}
