package www.newproj.com.newpro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class SkintoneActivity extends AppCompatActivity implements View.OnClickListener {
  private  CardView neutral,cool ,warm;


    Intent i;
    String gender;


    SharedPreferences facesharedpref;
    SharedPreferences.Editor editor;
    String pref_name = "FacePref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skintone);

        facesharedpref = getSharedPreferences("pref_name", MODE_PRIVATE);
        editor = facesharedpref.edit();

        neutral = (CardView) findViewById(R.id.neutralskintype);
        cool = (CardView) findViewById(R.id.coolskintype);
        warm = (CardView) findViewById(R.id.warmnskintype);

        i =  getIntent();
        gender = i.getStringExtra("gender");
        System.out.println("Gender is "+gender);


    }

    @Override
    public void onClick(View view) {
        Animation animation ;
        Intent faceactivity;
        switch (view.getId()) {
            case R.id.neutralskintype:
                editor.putString("skintone", "Neutral");
                editor.commit();
                if(gender.equals("female")) {
                    faceactivity = new Intent(getApplicationContext(), FacewomenActivity.class);
                    faceactivity.putExtra("gender", gender);
                    faceactivity.putExtra("skintone","neutral");
                }
                else
                    {
                    faceactivity = new Intent(getApplicationContext(), FacemenActivity.class);
                    faceactivity.putExtra("gender", gender);
                    faceactivity.putExtra("skintone","neutral");
                    }
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_inright);
                startActivity(faceactivity);
                break;
            case R.id.coolskintype:
                editor.putString("skintone", "Cool");
                editor.commit();
                if(gender.equals("female")) {
                    faceactivity = new Intent(getApplicationContext(), FacewomenActivity.class);
                    faceactivity.putExtra("gender", gender);
                    faceactivity.putExtra("skintone","cool");
                }
                else
                {
                    faceactivity = new Intent(getApplicationContext(), FacemenActivity.class);
                    faceactivity.putExtra("gender", gender);
                    faceactivity.putExtra("skintone","cool");
                }
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_inright);
                startActivity(faceactivity);
                break;
            case R.id.warmnskintype:
                editor.putString("skintone", "Warm");
                editor.commit();
                if(gender.equals("female")) {
                    faceactivity = new Intent(getApplicationContext(), FacewomenActivity.class);
                    faceactivity.putExtra("gender", gender);
                    faceactivity.putExtra("skintone","warm");
                }
                else
                {
                    faceactivity = new Intent(getApplicationContext(), FacemenActivity.class);
                    faceactivity.putExtra("gender", gender);
                    faceactivity.putExtra("skintone","warm");
                }
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_inright);
                startActivity(faceactivity);
                break;
            default:
                break;
        }

    }
}








