package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class GenderActivity extends AppCompatActivity implements View.OnClickListener
{
    private CardView FemaleCard, MaleCard;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        FemaleCard = (CardView) findViewById(R.id.female_et);
        MaleCard = (CardView) findViewById(R.id.male_et);
    }

    @Override
    public void onClick(View v)
    {

        Intent i;
        switch (v.getId())
        {
            case R.id.female_et:
                i = new Intent(this, SkintoneActivity.class);
                i.putExtra("gender","female");
                startActivity(i);
                break;
            case R.id.male_et:
                i = new Intent(this, SkintoneActivity.class);
                i.putExtra("gender","male");
                startActivity(i);
                break;
            default:
                break;

        }
    }

    }

