package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class FacewomenActivity extends AppCompatActivity  implements View.OnClickListener {


    CardView oval, round, longshape, heart, square;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womenface);
        oval = (CardView) findViewById(R.id.ovalwomenfacestructure);
        round = (CardView) findViewById(R.id.roundwomenfacestructure);
        longshape = (CardView) findViewById(R.id.longwomenfacestructure);
        heart = (CardView) findViewById(R.id.heartwomenfacestructure);
        square = (CardView) findViewById(R.id.squarewomenfacestructure);

    }
        @Override
    public void onClick(View view) {
        Animation animation;
        Intent womenbody;
        switch (view.getId()) {
            case R.id.ovalwomenfacestructure:
              womenbody = new Intent(getApplicationContext() , WomenbodyActivity.class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(womenbody);
                break;

            case R.id.roundwomenfacestructure:
                womenbody = new Intent(getApplicationContext() , WomenbodyActivity.class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(womenbody);
                break;

            case R.id.longwomenfacestructure:
                womenbody = new Intent(getApplicationContext() , WomenbodyActivity.class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(womenbody);
                break;

            case R.id.heartwomenfacestructure:
                womenbody = new Intent(getApplicationContext() , WomenbodyActivity.class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(womenbody);
                break;
            case R.id.squarewomenfacestructure:
                womenbody = new Intent(getApplicationContext() , WomenbodyActivity.class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(womenbody);
                break;


        }
    }
}