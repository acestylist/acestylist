package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class FacemenActivity extends AppCompatActivity  implements View.OnClickListener {
    CardView triangle, square, oval, round,shape;


    Intent intent;
    String gender, skintone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facemen);
        oval = (CardView) findViewById(R.id.ovalmenfacestructure);
        round = (CardView) findViewById(R.id.roundmenfacestructure);
        triangle = (CardView) findViewById(R.id.trianglemenfacestructure);
        square = (CardView) findViewById(R.id.squaremenfacestructure);
        shape = (CardView) findViewById(R.id.shapemenfacestructure);


        intent = getIntent();
        gender = intent.getStringExtra("gender");
        skintone = intent.getStringExtra("skintone");

        System.out.println("Values are : "+gender+"\n"+skintone);

    }

    @Override
    public void onClick(View view) {
        Animation animation;
        Intent menbody;
        switch (view.getId()) {
            case R.id.ovalmenfacestructure:
                menbody = new Intent(getApplicationContext() , MenbodyActivity.class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face","oval");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.roundmenfacestructure:
                menbody = new Intent(getApplicationContext() , MenbodyActivity.class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face","round");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.trianglemenfacestructure:
                menbody = new Intent(getApplicationContext() , MenbodyActivity.class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face","triangle");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.squaremenfacestructure:
                menbody = new Intent(getApplicationContext() , MenbodyActivity.class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face","square");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;
            case R.id.shapemenfacestructure:
                menbody = new Intent(getApplicationContext() , MenbodyActivity.class);
                menbody.putExtra("gender", gender);
                menbody.putExtra("skintone",skintone);
                menbody.putExtra("face","shape");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(menbody);
                break;


        }
    }
}
