package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class CollectioncardprofileActivity extends AppCompatActivity  {

    Intent intent;
    String gender, skintone,face,body;

    Intent newact;

    private CardView cardskintone,cardbodystructure,cardfacestructure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectioncardprofile);
        cardfacestructure = (CardView) findViewById(R.id.facestructure_et) ;
       cardbodystructure = (CardView) findViewById(R.id.bodystructure_et) ;
       cardskintone = (CardView) findViewById(R.id.skintone_et) ;
        System.out.println("Oncollection");
        intent = getIntent();
        gender = intent.getStringExtra("gender");
        skintone = intent.getStringExtra("skintone");
        cardskintone.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                System.out.println("card clicked");
                if(skintone.equals("neutral") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , NeutralskintonecollectioncardActivity.class);
                    startActivity(newact);
                }else  if(skintone.equals("cool") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , CoolskintonecollectioncardActivity.class);
                    startActivity(newact);
                }else  if(skintone.equals("warm") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , WarmskintonecollectionActivity.class);
                    startActivity(newact);
                }
                else if(skintone.equals("neutral") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this ,NeutralskintonecollectioncardActivity.class);
                    startActivity(newact);
                }else  if(skintone.equals("cool") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , CoolskintonecollectioncardActivity.class);
                    startActivity(newact);
                }else  if(skintone.equals("warm") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , WarmskintonecollectionActivity.class);
                    startActivity(newact);
                }
            }
        });

        face = intent.getStringExtra("face");
        cardfacestructure.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                System.out.println("card clicked");
                if(face.equals("oval") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , Ovalfaceswomencollectionctivity.class);
                    startActivity(newact);
                }else  if(face.equals("round") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , RoundfaceswomencollectionActivity.class);
                    startActivity(newact);
                }else  if(face.equals("heart") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , HeartfaceswomencollectionActivity.class);
                    startActivity(newact);
                }else  if(face.equals("long") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , LongfacewomencollectionActivity.class);
                    startActivity(newact);
                }else  if(face.equals("square") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this ,SquraefacewomencollectionActivity.class);
                    startActivity(newact);
                }
                else if(face.equals("triangle") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , TrianglemenfacecollectionActivity.class);
                    startActivity(newact);
                }else  if(face.equals("square") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , SquaremenfacecollectionActivity.class);
                    startActivity(newact);
                }else  if(face.equals("oval") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , OvalmenfacecollectionActivity.class);
                    startActivity(newact);
                }else  if(face.equals("shape") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , LongmenfacecollectionActivity.class);
                    startActivity(newact);
                }else  if(face.equals("round") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this ,RoundmenfacecollectionActivity.class);
                    startActivity(newact);
                }
            }
        });

        body = intent.getStringExtra("body");
        cardbodystructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("card clicked");
                if(body.equals("triangle") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , InvertedtrianglebodycollectionActivity.class);
                    startActivity(newact);
                }else  if(body.equals("hourglass") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this ,HourglassbodycollectionActivity.class);
                    startActivity(newact);
                }else  if(body.equals("stright") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , StraightbodycollectionActivity.class);
                    startActivity(newact);
                }else  if(body.equals("pear") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this , PearbodycollectionActivity.class);
                    startActivity(newact);
                }else  if(body.equals("apple") && gender.equals("female")){
                    newact = new Intent(CollectioncardprofileActivity.this ,ApplebodycollectionActivity.class);
                    startActivity(newact);
                }
                else if(body.equals("oval") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , OvalmenbodycollectionActivity.class);
                    startActivity(newact);
                }else  if(body.equals("rectangle") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , RectanglemenbodycollectionActivity.class);
                    startActivity(newact);
                }else  if(body.equals("trap") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , TrapmenbodycollectionActivity.class);
                    startActivity(newact);
                }else  if(body.equals("triangle") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this , TrianglemenbodycollectionActivity.class);
                    startActivity(newact);
                }else  if(body.equals("intri") && gender.equals("male")){
                    newact = new Intent(CollectioncardprofileActivity.this ,IntrimenbodycollectionActivity.class);
                    startActivity(newact);
                }
            }
        });

        System.out.println("Values on collection activity : "+gender+"\n"+skintone+"\n"+face+"\n"+body);

    }


}