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

    Intent intent;
    String gender, skintone,face;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menbody);
        oval = (CardView) findViewById(R.id.ovalmenbodystructure);
        intri = (CardView) findViewById(R.id.intrimenbodystructure);
        triangle = (CardView) findViewById(R.id.trianglemenbodystructure);
        trap = (CardView) findViewById(R.id.trapmenbodystructure);
        rectangle = (CardView) findViewById(R.id.rectanglemenbodystructure);


        intent = getIntent();
        gender = intent.getStringExtra("gender");
        skintone = intent.getStringExtra("skintone");
        face=intent.getStringExtra("face");
        System.out.println("Values are : "+gender+"\n"+skintone+"\n"+face);
    }

    @Override
    public void onClick(View view) {
        Animation animation;
        Intent menbody;
        switch (view.getId()) {
            case R.id.ovalmenbodystructure:
                menbody = new Intent(getApplicationContext() , ProfilecardActivity.class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face",face);
                menbody.putExtra("body","oval");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.intrimenbodystructure:
                menbody = new Intent(getApplicationContext() , ProfilecardActivity.class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face",face);
                menbody.putExtra("body","intri");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.trianglemenbodystructure:
                menbody = new Intent(getApplicationContext() ,ProfilecardActivity .class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face",face);
                menbody.putExtra("body","triangle");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.trapmenbodystructure:
                menbody = new Intent(getApplicationContext() , ProfilecardActivity.class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face",face);
                menbody.putExtra("body","trap");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.rectanglemenbodystructure:
                menbody = new Intent(getApplicationContext() , ProfilecardActivity.class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face",face);
                menbody.putExtra("body","rectangle");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;


        }
    }
    }

