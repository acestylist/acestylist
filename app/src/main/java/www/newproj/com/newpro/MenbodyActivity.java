package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MenbodyActivity extends AppCompatActivity  implements View.OnClickListener{
    CardView triangle,oval, trap,intri,rectangle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menbody);
        oval = (CardView) findViewById(R.id.ovalmenbodystructure);
        intri = (CardView) findViewById(R.id.intrimenbodystructure);
        triangle = (CardView) findViewById(R.id.trianglemenbodystructure);
        trap = (CardView) findViewById(R.id.trapmenbodystructure);
        rectangle = (CardView) findViewById(R.id.rectanglemenbodystructure);
    }

    @Override
    public void onClick(View view) {
        Animation animation;
        Intent menbody;
        switch (view.getId()) {
            case R.id.ovalmenbodystructure:
                menbody = new Intent(getApplicationContext() , ProfilecardActivity.class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.intrimenbodystructure:
                menbody = new Intent(getApplicationContext() , ProfilecardActivity.class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.trianglemenbodystructure:
                menbody = new Intent(getApplicationContext() ,ProfilecardActivity .class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                break;
            case R.id.trapmenbodystructure:
                menbody = new Intent(getApplicationContext() , ProfilecardActivity.class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.rectanglemenbodystructure:
                menbody = new Intent(getApplicationContext() , ProfilecardActivity.class);
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;


        }
    }
    }

