package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class WomenbodyActivity extends AppCompatActivity  implements View.OnClickListener {
    CardView triangle,hourglass,stright,pear,apple;


    Intent intent;
    String gender, skintone,face;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womenbody);
        triangle=(CardView) findViewById(R.id.trianglewomenbody);
        hourglass=(CardView) findViewById(R.id.hourglasswomenbody);
        pear=(CardView) findViewById(R.id.pearwomenbody);
        stright=(CardView) findViewById(R.id.strightwomenbody);
        apple=(CardView) findViewById(R.id.applewomenbody);


        intent = getIntent();
        gender = intent.getStringExtra("gender");
        skintone = intent.getStringExtra("skintone");
        face=intent.getStringExtra("face");
        System.out.println("Values are : "+gender+"\n"+skintone+"\n"+face);

    }
    @Override
    public void onClick(View view) {
        Animation animation ;
        Intent profilecard;
        switch (view.getId()) {
            case R.id.trianglewomenbody:
            profilecard = new Intent(getApplicationContext() , ProfilecardActivity.class);
                profilecard.putExtra("gender", gender);
               profilecard.putExtra("skintone",skintone);
               profilecard.putExtra("face",face);
                profilecard.putExtra("body","triangle");

            AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
            startActivity(profilecard);
            break;

            case R.id.hourglasswomenbody:
                profilecard = new Intent(getApplicationContext() , ProfilecardActivity.class);
                profilecard.putExtra("gender", gender);
                profilecard.putExtra("skintone",skintone);
                profilecard.putExtra("face",face);
                profilecard.putExtra("body","hourglass");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(profilecard);
                break;

            case R.id.pearwomenbody:
                profilecard = new Intent(getApplicationContext() , ProfilecardActivity.class);
                profilecard.putExtra("gender", gender);
                profilecard.putExtra("skintone",skintone);
                profilecard.putExtra("face",face);
                profilecard.putExtra("body","pear");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(profilecard);
                break;
            case R.id.strightwomenbody:
                profilecard = new Intent(getApplicationContext() , ProfilecardActivity.class);
                profilecard.putExtra("gender", gender);
                profilecard.putExtra("skintone",skintone);
                profilecard.putExtra("face",face);
                profilecard.putExtra("body","stright");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(profilecard);
                break;
            case R.id.applewomenbody:
                profilecard = new Intent(getApplicationContext() , ProfilecardActivity.class);
                profilecard.putExtra("gender", gender);
                profilecard.putExtra("skintone",skintone);
                profilecard.putExtra("face",face);
                profilecard.putExtra("body","apple");
                AnimationUtils.loadAnimation(getApplicationContext() , R.anim.slide_inright);
                startActivity(profilecard);
                break;
        }
    }
}
